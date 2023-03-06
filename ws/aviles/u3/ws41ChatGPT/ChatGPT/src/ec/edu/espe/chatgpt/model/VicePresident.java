package ec.edu.espe.chatgpt.model;

public class VicePresident extends RequestHandler {
  public VicePresident(RequestHandler next) {
    super(next);
  }
  
  @Override public void handleRequest(Request request) {
    if (request.getRequestDescription().equals("budget")) {
      printHandling(request);
      request.markHandled();
    } else {
      super.handleRequest(request);
    }
  }
  
  @Override public String toString() {
    return "Vice President";
  }
}
