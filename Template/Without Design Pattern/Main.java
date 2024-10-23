// Concrete subclass for making tea (without Template Method)
class TeaMaker {
    void makeBeverage() {
        boilWater();
        brewTea();
        pourInCup();
        addLemon();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void brewTea() {
        System.out.println("Steeping the tea");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    void addLemon() {
        System.out.println("Adding lemon");
    }
}

// Concrete subclass for making coffee (without Template Method)
class CoffeeMaker {
    void makeBeverage() {
        boilWater();
        brewCoffee();
        pourInCup();
        addSugarAndMilk();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void brewCoffee() {
        System.out.println("Dripping coffee through filter");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    void addSugarAndMilk() {
        System.out.println("Adding sugar and milk");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Making tea:");
        TeaMaker teaMaker = new TeaMaker();
        teaMaker.makeBeverage();

        System.out.println("\nMaking coffee:");
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeBeverage();
    }
}
