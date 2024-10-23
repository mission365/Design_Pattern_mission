class Logger {
    // The single instance of the Logger
    private static Logger instance;

    // Private constructor prevents creating more instances
    private Logger() {
    }

    // Static method to provide the single instance globally
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Create instance only if it doesn't exist
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        // Access the singleton instance across the system
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Logs messages using the same instance
        logger1.log("Log from logger 1");
        logger2.log("Log from logger 2");
    }
}
