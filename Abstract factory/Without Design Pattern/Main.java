/*
 *  Imagine you're designing a furniture shop that sells two styles of furniture: 
 * Modern and Victorian. Each style has a Chair and a Sofa.

    You want to ensure that when a customer buys Modern furniture, 
    they get both a Modern Chair and a Modern Sofa. 
    Similarly, when a customer selects Victorian furniture, they get both a Victorian Chair and a Victorian Sofa.
 */
class ModernChair {
    public void sitOn() {
        System.out.println("Sitting on a modern chair!");
    }
}

class VictorianChair {
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair!");
    }
}

class ModernSofa {
    public void sitOn() {
        System.out.println("Sitting on a modern sofa!");
    }
}

class VictorianSofa {
    public void sitOn() {
        System.out.println("Sitting on a Victorian sofa!");
    }
}

// Client code that creates furniture
class FurnitureShopApp {
    public void orderFurniture(String style) {
        if (style.equals("modern")) {
            ModernChair chair = new ModernChair();
            chair.sitOn();
            ModernSofa sofa = new ModernSofa();
            sofa.sitOn();
        } else if (style.equals("victorian")) {
            VictorianChair chair = new VictorianChair();
            chair.sitOn();
            VictorianSofa sofa = new VictorianSofa();
            sofa.sitOn();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Client code
        FurnitureShopApp shop = new FurnitureShopApp();
        shop.orderFurniture("modern"); // Outputs: Sitting on a modern chair! Sitting on a modern sofa!
        shop.orderFurniture("victorian"); // Outputs: Sitting on a Victorian chair! Sitting on a Victorian sofa!

    }
}
