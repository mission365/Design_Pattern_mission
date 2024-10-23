// Abstract handler class
abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(String requestType) {
        if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}

// Concrete handler for technical support
class TechnicalSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("technical")) {
            System.out.println("Handling technical request.");
        } else {
            super.handleRequest(requestType);
        }
    }
}

// Concrete handler for billing support
class BillingSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("billing")) {
            System.out.println("Handling billing request.");
        } else {
            super.handleRequest(requestType);
        }
    }
}

// Concrete handler for general support
class GeneralSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("general")) {
            System.out.println("Handling general support request.");
        } else {
            super.handleRequest(requestType);
        }
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // Create handlers
        SupportHandler technicalHandler = new TechnicalSupportHandler();
        SupportHandler billingHandler = new BillingSupportHandler();
        SupportHandler generalHandler = new GeneralSupportHandler();

        // Set up the chain
        technicalHandler.setNextHandler(billingHandler);
        billingHandler.setNextHandler(generalHandler);

        // Pass requests down the chain
        technicalHandler.handleRequest("billing");   // Passes to billing handler
        technicalHandler.handleRequest("technical"); // Handled by technical handler
        technicalHandler.handleRequest("general");   // Passes down to general handler
    }
}
