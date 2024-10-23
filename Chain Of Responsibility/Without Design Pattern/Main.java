/*
 *  you are building a support system where a customer,
 * might submit different types of support requests.
 * Depending on the issue (technical, billing, or general),
 * the request should be handled by different departments. 
 * Without the Chain of Responsibility pattern, you might end up with a large,
 * monolithic if-else structure to check each type of request and handle it accordingly.
 */

 class SupportService {
    public void handleRequest(String requestType) {
        if (requestType.equals("technical")) {
            System.out.println("Handling technical request.");
        } else if (requestType.equals("billing")) {
            System.out.println("Handling billing request.");
        } else if (requestType.equals("general")) {
            System.out.println("Handling general support request.");
        } else {
            System.out.println("Unknown request type.");
        }
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        SupportService service = new SupportService();
        service.handleRequest("billing");   // Handles billing request
        service.handleRequest("technical"); // Handles technical request
    }
}

