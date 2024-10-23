
/*
 * Imagine you're building a game where you need to create a lot of characters.
 * Each character has many attributes (like health, power, weapons, etc.),
 * and initializing a new character can be very resource-heavy.
 * Without the Prototype pattern, every time you need a new character, 
 * you would have to set up each attribute manually, which can be repetitive and slow.
 */
class Character {
    public String name;
    public int health;
    public String weapon;

    public Character(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void showInfo() {
        System.out.println("Character: " + name + ", Health: " + health + ", Weapon: " + weapon);
    }
}
// Client code creating new characters
public class Main {
    public static void main(String[] args) {
        // Creating each character manually
        Character warrior = new Character("Warrior", 100, "Sword");
        warrior.showInfo();  // Outputs: Character: Warrior, Health: 100, Weapon: Sword

        Character mage = new Character("Mage", 80, "Staff");
        mage.showInfo();     // Outputs: Character: Mage, Health: 80, Weapon: Staff
    }
}
