import java.util.ArrayList;
import java.util.List;

// Component interface: common to both Products and Boxes
interface Item {   // <-- COMPONENT
    double getPrice();  // Common method to calculate price
}

// Leaf: Individual Product
class Product implements Item {   // <-- LEAF
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;  // Simply returns the price of the product
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }
}

// Composite: Box that can contain Products or other Boxes
class Box implements Item {   // <-- COMPOSITE
    private List<Item> items = new ArrayList<>();
    private double packagingCost;

    public Box(double packagingCost) {
        this.packagingCost = packagingCost;
    }

    public void addItem(Item item) {
        items.add(item);  // Adds either Product or another Box
    }

    @Override
    public double getPrice() {
        double totalPrice = packagingCost;  // Start with packaging cost
        for (Item item : items) {
            totalPrice += item.getPrice();  // Sum up the price of all contained items
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
        box1.addItem(product1);
        box1.addItem(product2);

        // Create another box and add a product and the previous box to it
        Box box2 = new Box(10.00);  // Larger box with a higher packaging cost
        box2.addItem(product3);
        box2.addItem(box1);  // Add the smaller box (box1)

        // Calculate and print total prices
        System.out.println(product1 + " - Total Price: $" + product1.getPrice());
        System.out.println(box1 + " - Total Price: $" + box1.getPrice());
        System.out.println(box2 + " - Total Price: $" + box2.getPrice());
    }
}
