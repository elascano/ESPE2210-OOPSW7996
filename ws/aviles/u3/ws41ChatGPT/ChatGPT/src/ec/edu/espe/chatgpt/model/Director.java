package ec.edu.espe.chatgpt.model;

public class Director extends RequestHandler {
  public Director(RequestHandler next) {
    super(next);
  }
  
  @Override public void handleRequest(Request request) {
    if (request.getRequestDescription().equals("stock options")) {
      printHandling(request);
      request.markHandled();
    } else {
      super.handleRequest(request);
    }
  }
  
  @Override public String toString() {
    return "Director";
  }
}
