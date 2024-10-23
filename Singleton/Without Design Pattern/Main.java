/*
 * Problem Statement:
 * Imagine you are developing an application that needs to write logs. 
 * If each part of the system creates its own instance of the logger, 
 * you end up with multiple logger objects. This causes inconsistencies, 
 * as each logger might have different settings or log to different files, making debugging difficult.
 */

class Logger {
    public Logger() {
        // Constructor creates a new logger instance
    }

    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        // Different parts of the application create their own logger instances
        Logger logger1 = new Logger();
        Logger logger2 = new Logger();

        // Logs messages using different instances
        logger1.log("Log from logger 1");
        logger2.log("Log from logger 2");
    }
}
