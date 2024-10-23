/*
 * You are tasked with designing a system that calculates ,
 * the total price of individual products and packaging boxes.
 * The boxes can contain both products and other boxes,
 * and each box has a packaging cost.
 * We need a solution that can handle a mix of individual products and boxes,
 * and calculate the total price accordingly.
 */
import java.util.ArrayList;
import java.util.List;

// Individual Product class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }
}

// Box class that can contain Products
class Box {
    private List<Product> products = new ArrayList<>();
    private List<Box> boxes = new ArrayList<>();
    private double packagingCost;

    public Box(double packagingCost) {
        this.packagingCost = packagingCost;
    }

    public void addProduct(Product product) {
        products.add(product);  // Add products to the box
    }

    public void addBox(Box box) {
        boxes.add(box);  // Add smaller boxes to the larger box
    }

    public double calculatePrice() {
        double totalPrice = packagingCost;  // Start with packaging cost
        for (Product product : products) {
            totalPrice += product.getPrice();  // Add product prices
        }
        for (Box box : boxes) {
            totalPrice += box.calculatePrice();  // Add prices of contained boxes
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Box (Packaging Cost: $" + packagingCost + ")";
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // Create individual products
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Phone", 800.00);
        Product product3 = new Product("Headphones", 200.00);

        // Create a box and add products to it
        Box box1 = new Box(5.00);  // Box with a packaging cost
        box1.addProduct(product1);
        box1.addProduct(product2);

        // Create another box and add a product and the previous box to it
        Box box2 = new Box(10.00);  // Larger box with a higher packaging cost
        box2.addProduct(product3);
        box2.addBox(box1);  // Add the smaller box (box1)

        // Calculate and print total prices
        System.out.println(product1 + " - Total Price: $" + product1.getPrice());
        System.out.println(box1 + " - Total Price: $" + box1.calculatePrice());
        System.out.println(box2 + " - Total Price: $" + box2.calculatePrice());
    }
}
