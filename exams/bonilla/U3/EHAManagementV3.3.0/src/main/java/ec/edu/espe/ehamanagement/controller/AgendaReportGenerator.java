package ec.edu.espe.ehamanagement.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.model.AgendaReport;
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
public class AgendaReportGenerator {
    public static ArrayList getFieldsToInsert(){
        ArrayList fields = new ArrayList();
        fields.add("id");
        fields.add("type");
        fields.add("date");
        fields.add("pendignOrdersIds");
        fields.add("completedOrdersIds");
        return fields;   
    }
    public static ArrayList getValuesToInsert(AgendaReport report){
        ArrayList values = new ArrayList();
        values.add(report.getId());
        values.add(report.getType());
        values.add(report.getDate());
        values.add(report.getPendingOrdersIds());
        values.add(report.getCompletedOrdersIds());
        return values;
    }
    
    public static ArrayList <Order> filterOrders(ArrayList <Order> readedOrders, String type){
        ArrayList <Order> pendingOrders = new ArrayList();
        ArrayList <Order> completedOrders = new ArrayList();
        for(Order order: readedOrders){
            if(order.getIsDelivered()){
                completedOrders.add(order);
            }else{
                pendingOrders.add(order);
            }
        }
        if (type.equals("pending")){
            return pendingOrders;
        }else if(type.equals("completed")){
            return completedOrders;
        }else{
            return null;
        } 
    }
    public static boolean insertReport( MongoCollection reportsCollection , AgendaReport report){
        report.setId(assignIdToReport(reportsCollection));
        ArrayList fields = getFieldsToInsert();
        ArrayList values = getValuesToInsert(report);
        HashMap reportToInsert = DictionaryConversor.convertToDictionary(fields, values);
        MongoDbManager.insertDocument(reportsCollection, reportToInsert);
        return true;
    }
    
    public static int assignIdToReport(MongoCollection reportsCollection){
        ArrayList reports = MongoDbManager.getFieldValues(reportsCollection, "id");
        if(!reports.isEmpty()){
            int lastId = (int) Collections.max(reports);
            int newId = lastId + 1;
            return newId;
        }else{
            return 1;
        }
    }    

}
