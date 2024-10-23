/*
 * Imagine we are building a simple remote control that can perform operations,
 * like turning the TV on and off. Initially, we have a problem because the,
 * remote control is tightly coupled to the TV class.
 * Later, we’ll decouple it using the Command pattern.
 */

// TV class: Receiver
class TV {
    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

// RemoteControl class: Invoker that directly controls the TV
class RemoteControl {
    private TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public void pressOnButton() {
        tv.turnOn();
    }

    public void pressOffButton() {
        tv.turnOff();
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        RemoteControl remote = new RemoteControl(tv);

        // Tightly coupled: Remote directly controls the TV
        remote.pressOnButton();  // TV is ON
        remote.pressOffButton(); // TV is OFF
    }
}

