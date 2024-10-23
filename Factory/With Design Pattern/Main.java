// Abstract Animal class (Product)
abstract class Animal {
    public abstract void makeSound();
}

// Concrete Animal subclasses (Concrete Products)
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Factory class (Creator)
abstract class AnimalFactory {
    public abstract Animal createAnimal();
}

// Concrete Factories (Concrete Creators)
class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

// Client code uses the factory to create animals
class AnimalApp {
    private AnimalFactory factory;

    public AnimalApp(AnimalFactory factory) {
        this.factory = factory;
    }

    public void playAnimalSound() {
        Animal animal = factory.createAnimal();
        animal.makeSound();
    }
}

public class Main {
    public static void main(String[] args) {
        // Client code
        AnimalApp dogApp = new AnimalApp(new DogFactory());
        dogApp.playAnimalSound(); // Outputs: "Woof!"

        AnimalApp catApp = new AnimalApp(new CatFactory());
        catApp.playAnimalSound(); // Outputs: "Meow!"
    }
}
