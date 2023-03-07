package ec.edu.espe.ehamanagement.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.model.Order;
import ec.edu.espe.mongodbmanager.MongoDbManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import utils.DictionaryConversor;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Agenda {
    public static ArrayList getFieldsToInsert(){
        ArrayList fields = new ArrayList();
        fields.add("id");
        fields.add("clientName");
        fields.add("description");
        fields.add("deliveryDate");
        fields.add("deliveryPlace");
        fields.add("isDelivered");
        return fields;   
    }
    public static ArrayList getValuesToInsert(Order order){
        ArrayList values = new ArrayList();
        values.add(order.getId());
        values.add(order.getClientName());
        values.add(order.getDescription());
        values.add(order.getDeliveryDate());
        values.add(order.getDeliveryPlace());
        values.add(order.getIsDelivered());
        return values;
    }
    
    private static int assignIdToOrder(MongoCollection ordersCollection){
        ArrayList <String> ordersIds = MongoDbManager.getFieldValues(ordersCollection, "id");
        if(!ordersIds.isEmpty()){
            int lastId = Integer.parseInt(String.valueOf(Collections.max(ordersIds)));
            int newId = lastId + 1;
            return newId;
        }else{
            return 1;
        }
    }
    
    public static ArrayList <Object> readAll(MongoCollection ordersCollection, String field){
        ArrayList <Object> values;
        values = MongoDbManager.getFieldValues(ordersCollection, field);
        return values;
    }
    public static boolean insertOrder(MongoCollection ordersCollection, Order order){
        int newId = assignIdToOrder(ordersCollection);
        order.setId(newId);
        ArrayList fields = getFieldsToInsert();
        ArrayList values = getValuesToInsert(order);
        HashMap orderToInsert = DictionaryConversor.convertToDictionary(fields, values);
        MongoDbManager.insertDocument(ordersCollection, orderToInsert);
        return true;
    }
    
    public static boolean deleteOrder(MongoCollection ordersCollection, int id){
        return MongoDbManager.deleteDocument(ordersCollection,"id", id);
    }
    
    public static Object getValueFromOrder(MongoCollection ordersCollection,String searchField,  Object SearchValue, String fieldToFind){
        Object foundValue;
        foundValue = MongoDbManager.getDocumentValue(ordersCollection, searchField,SearchValue, fieldToFind);
        return foundValue;
    }
    
    
    public static boolean updateOrder(MongoCollection ordersCollection, Order order){
        int id = order.getId();
        MongoDbManager.updateDocument(ordersCollection,"id", id, "clientName", order.getClientName());
        MongoDbManager.updateDocument(ordersCollection,"id", id, "deliveryDate", order.getDeliveryDate());
        MongoDbManager.updateDocument(ordersCollection,"id", id, "deliveryPlace", order.getDeliveryPlace());
        MongoDbManager.updateDocument(ordersCollection, "id",id, "description", order.getDescription());
        MongoDbManager.updateDocument(ordersCollection,"id", id, "isDelivered", String.valueOf(order.getIsDelivered()));
        return true;
    }
    public static  boolean existsOrder(MongoCollection ordersCollection, String field, Object value){
        return MongoDbManager.existsDocument(ordersCollection, field, value);
    }
    
    public static ArrayList <Order> readAgenda( MongoCollection ordersCollection){
        ArrayList <Object> ids = readAll (ordersCollection, "id");
        Order readedOrder;
        ArrayList <Order> readedOrders = new ArrayList();
        for (Object readedId: ids){
            int id = Integer.parseInt(String.valueOf(readedId));
            String clientName = String.valueOf(getValueFromOrder(ordersCollection, "id", id, "clientName"));
            String deliveryPlace = String.valueOf(getValueFromOrder(ordersCollection, "id", id, "deliveryPlace"));
            String deliveryDate = String.valueOf(getValueFromOrder(ordersCollection, "id", id, "deliveryDate"));
            String description = String.valueOf(getValueFromOrder(ordersCollection, "id", id, "description"));
            String isDelivered = String.valueOf(getValueFromOrder(ordersCollection, "id", id, "isDelivered"));
            readedOrder = new Order(id, clientName, deliveryPlace, deliveryDate, description, Boolean.parseBoolean(isDelivered)); 
            readedOrders.add(readedOrder);
        }
        return readedOrders;
    }
    
}
