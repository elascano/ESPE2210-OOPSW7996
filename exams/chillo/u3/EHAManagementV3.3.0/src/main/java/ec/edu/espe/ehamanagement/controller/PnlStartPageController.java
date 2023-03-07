package ec.edu.espe.ehamanagement.controller;

import ec.edu.espe.ehamanagement.view.PnlStartPage;
import java.util.ArrayList;
import utils.Tasks;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class PnlStartPageController {
    public static void warningProductsInShortage(PnlStartPage startPagePanel){
        ArrayList productsInShortage = Tasks.countProductsInShortage(startPagePanel.getProductsCollection());
        if(!productsInShortage.isEmpty()){
             startPagePanel.getTxtAProducts().setText("You have " + productsInShortage.size() + " product/s in shortage in your Inventory : ");
             for(Object product: productsInShortage){
                 String productName = String.valueOf(product);
                 startPagePanel.getTxtAProducts().append("\n"+productName);
             }
        }else{
            startPagePanel.getTxtAProducts().setText("There's no products in shortage in your Inventory");
        }
    }
    
    public static void warningPendingOrders(PnlStartPage startPagePanel){
        ArrayList pendingOrders = Tasks.countPendingOrders(startPagePanel.getOrdersCollection());
        if(!pendingOrders.isEmpty()){
             startPagePanel.getTxtAOrders().setText("You have - " + pendingOrders.size() + " - pending order/s in your Agenda: " );
             for(Object orders: pendingOrders){
                 String dateAndClient = String.valueOf(orders);
                 startPagePanel.getTxtAOrders().append("\n"+dateAndClient);
             }
        }else{
            startPagePanel.getTxtAOrders().setText("There's no pending orders in your Agenda");
        }
    }
}
