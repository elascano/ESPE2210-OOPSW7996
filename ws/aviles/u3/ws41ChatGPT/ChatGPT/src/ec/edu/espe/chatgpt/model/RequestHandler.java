package ec.edu.espe.chatgpt.model;

abstract public class RequestHandler {
  private RequestHandler next;
  
  public RequestHandler(RequestHandler next) {
    this.next = next;
  }
  
  public void handleRequest(Request request) {
    if (next != null) {
      next.handleRequest(request);
    }
  }
  
  protected void printHandling(Request request) {
    System.out.println(this + " handling request \"" + request + "\"");
  }
  
  @Override public abstract String toString();
}
