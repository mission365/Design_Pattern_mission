/*
 * Imagine you’re creating an app that lets users select the type 
 * of animal sound they want to hear (dog, cat, etc.). 
 * Without the Factory Method, 
 * you'd have to hard-code the logic for every type of animal, 
 * and every time you add a new animal, you'd have to modify the code.
 */
class Dog {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class AnimalApp {
    public void playAnimalSound(String type) {
        if (type.equals("dog")) {
            Dog dog = new Dog();
            dog.makeSound();
        } else if (type.equals("cat")) {
            Cat cat = new Cat();
            cat.makeSound();
        }
        // More animals = more if-else conditions
    }
}

public class Main {
    public static void main(String[] args) {
        // Client code
        AnimalApp app = new AnimalApp();
        app.playAnimalSound("dog");
        app.playAnimalSound("cat");
    }
}
