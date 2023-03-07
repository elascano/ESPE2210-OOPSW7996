package ec.edu.espe.view.chatgpt.view;

import ec.edu.espe.chatgpt.model.Director;
import ec.edu.espe.chatgpt.model.Manager;
import ec.edu.espe.chatgpt.model.President;
import ec.edu.espe.chatgpt.model.Request;
import ec.edu.espe.chatgpt.model.RequestHandler;
import ec.edu.espe.chatgpt.model.VicePresident;

/**
 *
 * @author ChatGPT
 */
public class Main {
    private static RequestHandler getChainOfHandlers() {
    RequestHandler handler1 = new Manager(null);
    RequestHandler handler2 = new Director(handler1);
    RequestHandler handler3 = new VicePresident(handler2);
    RequestHandler handler4 = new President(handler3);
    return handler4;
  }
  
  public static void main(String[] args) {
    RequestHandler chain = getChainOfHandlers();
    chain.handleRequest(new Request("budget"));
    chain.handleRequest(new Request("raise"));
    chain.handleRequest(new Request("stock options"));
    chain.handleRequest(new Request("merger"));
  }
    
}
