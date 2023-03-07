package ec.edu.espe.chatgpt.model;

public class President extends RequestHandler {
  public President(RequestHandler next) {
    super(next);
  }
  
  @Override public void handleRequest(Request request) {
    if (request.getRequestDescription().equals("merger")) {
      printHandling(request);
      request.markHandled();
    } else {
      super.handleRequest(request);
    }
  }
  
  @Override public String toString() {
    return "President";
  }
}