// Car interface
interface Car {
    void drive();
}

// Concrete class representing an available car
class AvailableCar implements Car {
    private String model;

    public AvailableCar(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving the " + model);
    }
}

// Null Object class representing a car that is not available
class NullCar implements Car {
    @Override
    public void drive() {
        // Do nothing when this is called
        System.out.println("The requested car is not available.");
    }
}

// Car Rental Service
class CarRentalService {
    // Rental service checks if the requested car is available
    public Car rentCar(String model) {
        // Simulating that only "Sedan" and "SUV" are available
        if ("Sedan".equalsIgnoreCase(model) || "SUV".equalsIgnoreCase(model)) {
            return new AvailableCar(model);
        } else {
            // Return a NullCar if the requested car is not available
            return new NullCar();
        }
    }
}

// Client code with Null Object Pattern
public class Main {
    public static void main(String[] args) {
        CarRentalService rentalService = new CarRentalService();

        // Request a Sedan (available)
        Car sedan = rentalService.rentCar("Sedan");
        sedan.drive();  // No need for null checks

        // Request a Hatchback (not available)
        Car hatchback = rentalService.rentCar("Hatchback");
        hatchback.drive();  // No need for null checks, NullCar handles it gracefully
    }
}
