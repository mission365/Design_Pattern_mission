
// Abstract Furniture Factory (Abstract Factory)
interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

// Concrete Factories (Concrete Factories)
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

// Product Interfaces (Product)
interface Chair {
    void sitOn();
}

interface Sofa {
    void sitOn();
}

// Concrete Products (Concrete Products)
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair!");
    }
}

class ModernSofa implements Sofa {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern sofa!");
    }
}

class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair!");
    }
}

class VictorianSofa implements Sofa {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian sofa!");
    }
}

// Client code using the Abstract Factory
class FurnitureShopApp {
    private FurnitureFactory factory;

    public FurnitureShopApp(FurnitureFactory factory) {
        this.factory = factory;
    }

    public void orderFurniture() {
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        chair.sitOn();
        sofa.sitOn();
    }
}

public class Main {
    public static void main(String[] args) {

        // Client code
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureShopApp modernShop = new FurnitureShopApp(modernFactory);
        modernShop.orderFurniture(); // Outputs: Sitting on a modern chair! Sitting on a modern sofa!

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        FurnitureShopApp victorianShop = new FurnitureShopApp(victorianFactory);
        victorianShop.orderFurniture(); // Outputs: Sitting on a Victorian chair! Sitting on a Victorian sofa!
    }
}
