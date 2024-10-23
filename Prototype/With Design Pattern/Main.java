// Prototype interface
interface Prototype {
    Character clone();
}

// Character class implements Prototype
class Character implements Prototype {
    public String name;
    public int health;
    public String weapon;

    public Character(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    // Clone method to copy the character
    @Override
    public Character clone() {
        return new Character(this.name, this.health, this.weapon);
    }

    public void showInfo() {
        System.out.println("Character: " + name + ", Health: " + health + ", Weapon: " + weapon);
    }
}

// Client code using Prototype pattern
public class Main {
    public static void main(String[] args) {
        // Create an initial character (the prototype)
        Character warriorPrototype = new Character("Warrior", 100, "Sword");

        // Clone the prototype to create similar characters
        Character warrior1 = warriorPrototype.clone();
        warrior1.showInfo();  // Outputs: Character: Warrior, Health: 100, Weapon: Sword

        // You can still modify the clone if needed
        Character warrior2 = warriorPrototype.clone();
        warrior2.name = "Warrior Clone";
        warrior2.showInfo();  // Outputs: Character: Warrior Clone, Health: 100, Weapon: Sword
    }
}
