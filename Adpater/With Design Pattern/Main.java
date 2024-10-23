// Target interface that the new system expects
interface Printer {   // <-- TARGET INTERFACE
    void print();     // New system expects this method
}

// Existing class with incompatible interface
class LegacyPrinter {   // <-- ADAPTEE
    public void printDocument() {
        System.out.println("Printing document using LegacyPrinter...");
    }
}

// Adapter class that bridges the gap
class PrinterAdapter implements Printer {   // <-- ADAPTER
    private LegacyPrinter legacyPrinter;    // Using the adaptee

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print() {
        // Adapting the call to the legacy method
        legacyPrinter.printDocument();   // Translate print() to printDocument()
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // Old legacy system
        LegacyPrinter legacyPrinter = new LegacyPrinter();

        // New system wants to use Printer interface
        Printer printer = new PrinterAdapter(legacyPrinter);   // Use adapter
        printer.print();  // Now it works with the new system
    }
}
