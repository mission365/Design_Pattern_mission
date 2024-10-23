/*
 * Let’s consider a scenario where we have an existing system,
 * that uses a LegacyPrinter class with a method named printDocument(),
 * which we want to adapt into a new system that expects a Printer interface with a method named print().
 */
// Existing class with incompatible interface
class LegacyPrinter {   // <-- ADAPTEE
    public void printDocument() {
        System.out.println("Printing document using LegacyPrinter...");
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // New system wants to use Printer interface, but it can't
        // LegacyPrinter doesn't match the expected interface
        LegacyPrinter legacyPrinter = new LegacyPrinter();

        // The new system would have to directly interact with the legacy method
        // Even though it expected a "print()" method, it must use "printDocument()" directly
        legacyPrinter.printDocument();  // No adapter, directly calling legacy method
    }
}
