package utils;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.controller.Agenda;
import ec.edu.espe.ehamanagement.controller.Inventory;
import java.util.ArrayList;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Tasks {

    public static ArrayList countProductsInShortage(MongoCollection productsCollection){
        ArrayList products = Inventory.readAll(productsCollection, "id");
        ArrayList productsInShortage = new ArrayList();
        for(int i = 0; i < products.size(); i++){
            int id = (int) products.get(i);
            if(Double.valueOf(String.valueOf(Inventory.getValueFromProduct(productsCollection,"id",id,"quantity"))) <5){
                String productName = String.valueOf(Inventory.getValueFromProduct(productsCollection,"id",id,"name"));
                String quantity = String.valueOf(Inventory.getValueFromProduct(productsCollection,"id",id,"quantity"));
                productsInShortage.add(productName + " - >" + quantity + " units" );
            }
        }
        return productsInShortage;
    }
    
    public static ArrayList countPendingOrders(MongoCollection ordersCollection){
        ArrayList orders = Agenda.readAll(ordersCollection, "id");
        ArrayList pendingOrders = new ArrayList();
        for(int i = 0; i < orders.size(); i++){
            int id = (int) orders.get(i);
            boolean isDelivered= Boolean.valueOf(String.valueOf(Agenda.getValueFromOrder(ordersCollection,"id",id,"isDelivered")));
            if(isDelivered == false){
                String date = String.valueOf(Agenda.getValueFromOrder(ordersCollection,"id",id,"deliveryDate"));
                String client = String.valueOf(Agenda.getValueFromOrder(ordersCollection,"id",id,"clientName"));
                pendingOrders.add(date + " to: " + client);
            }
        }
        return pendingOrders;
    }
    
}