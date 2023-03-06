package ec.edu.espe.chatgpt.model;

public class Manager extends RequestHandler {

    public Manager(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestDescription().equals("raise")) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Manager";
    }
}
