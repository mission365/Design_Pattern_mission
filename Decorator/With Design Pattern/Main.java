// 1. Beverage class (Abstract Component)
abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

// 2. Concrete Beverages (Concrete Components)
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

// 3. CondimentDecorator class (Abstract Decorator)
abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();  // Force subclasses to implement
}

// 4. Concrete Condiments (Concrete Decorators)
class Mocha extends CondimentDecorator {
    Beverage beverage;  // Wrapped beverage

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}

class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.30;
    }
}

class SteamedMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}

// 5. Client code
public class Main {
    public static void main(String[] args) {
        // Order HouseBlend with Mocha and Steamed Milk
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);  // Decorate with Mocha
        beverage = new SteamedMilk(beverage);  // Decorate with Steamed Milk
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // Order DarkRoast with Soy and Mocha
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Soy(beverage2);  // Decorate with Soy
        beverage2 = new Mocha(beverage2);  // Decorate with Mocha
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
