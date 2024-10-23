/*
 * A car rental service allows customers to rent different types of cars.
 * However, some customers may request a car model,
 * that is not available in the rental service’s fleet.
 * When this happens, the rental service needs a way to handle this situation,
 * gracefully without causing errors or disruptions to the customer.
*/

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

// Car Rental Service
class CarRentalService {
    // Rental service checks if the requested car is available
    public Car rentCar(String model) {
        // Simulating that only "Sedan" and "SUV" are available
        if ("Sedan".equalsIgnoreCase(model) || "SUV".equalsIgnoreCase(model)) {
            return new AvailableCar(model);
        } else {
            return null;  // If the car is not available, return null
        }
    }
}

// Client code without Null Object Pattern
public class Main {
    public static void main(String[] args) {
        CarRentalService rentalService = new CarRentalService();

        // Request a Sedan (available)
        Car sedan = rentalService.rentCar("Sedan");
        if (sedan != null) {
            sedan.drive();
        } else {
            System.out.println("Requested car is not available.");
        }

        // Request a Hatchback (not available)
        Car hatchback = rentalService.rentCar("Hatchback");
        if (hatchback != null) {
            hatchback.drive();
        } else {
            System.out.println("Requested car is not available.");
        }
    }
}
