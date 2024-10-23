// Beverage class (Base class for all beverages)
abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

// Concrete Beverages
class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return 0.89;
    }
}

class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return 0.99;
    }
}

// If we want to add condiments, we create new subclasses
class HouseBlendWithMocha extends HouseBlend {
    @Override
    public String getDescription() {
        return description + ", Mocha";
    }

    @Override
    public double cost() {
        return super.cost() + 0.20;
    }
}

class DarkRoastWithSoyAndSteamedMilk extends DarkRoast {
    @Override
    public String getDescription() {
        return description + ", Soy, Steamed Milk";
    }

    @Override
    public double cost() {
        return super.cost() + 0.30 + 0.10;
    }
}

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlendWithMocha();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoastWithSoyAndSteamedMilk();
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
