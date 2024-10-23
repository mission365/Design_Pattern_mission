// 1. Command interface
interface Command {
    void execute();  // All commands must implement this method
}

// 2. Concrete Command to turn on the TV
class TurnOnCommand implements Command {
    private TV tv;

    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();  // Delegates the action to the receiver
    }
}

// 3. Concrete Command to turn off the TV
class TurnOffCommand implements Command {
    private TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();  // Delegates the action to the receiver
    }
}

// 4. TV class (Receiver)
class TV {
    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

// 5. RemoteControl class (Invoker)
class RemoteControl {
    private Command command;  // Can hold any command

    public void setCommand(Command command) {
        this.command = command;  // Sets the command
    }

    public void pressButton() {
        command.execute();  // Executes the command
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // Receiver
        TV tv = new TV();

        // Commands
        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);

        // Invoker (Remote Control)
        RemoteControl remote = new RemoteControl();

        // Set the command to turn on the TV and press the button
        remote.setCommand(turnOn);
        remote.pressButton();  // TV is ON

        // Set the command to turn off the TV and press the button
        remote.setCommand(turnOff);
        remote.pressButton();  // TV is OFF
    }
}
