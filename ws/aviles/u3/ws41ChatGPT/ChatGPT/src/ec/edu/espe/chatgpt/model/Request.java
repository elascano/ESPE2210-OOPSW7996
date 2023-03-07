package ec.edu.espe.chatgpt.model;

public class Request {
  private final String requestDescription;
  private boolean handled;
  
  public Request(String requestDescription) {
    this.requestDescription = requestDescription;
  }
  
  public String getRequestDescription() {
    return requestDescription;
  }
  
  public void markHandled() {
    this.handled = true;
  }
  
  public boolean isHandled() {
    return handled;
  }
  
  @Override public String toString() {
    return getRequestDescription();
  }
}
