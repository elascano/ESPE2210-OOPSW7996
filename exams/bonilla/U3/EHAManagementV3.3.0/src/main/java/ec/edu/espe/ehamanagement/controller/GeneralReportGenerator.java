package ec.edu.espe.ehamanagement.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.model.GeneralReport;
import ec.edu.espe.mongodbmanager.MongoDbManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import utils.DictionaryConversor;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class GeneralReportGenerator {
    public static ArrayList getFieldsToInsert(){
        ArrayList fields = new ArrayList();
        fields.add("id");
        fields.add("type");
        fields.add("date");
        fields.add("OrdersIds");
        fields.add("ProductsIds");
        return fields;   
    }
    public static ArrayList getValuesToInsert(GeneralReport report){
        ArrayList values = new ArrayList();
        values.add(report.getId());
        values.add(report.getType());
        values.add(report.getDate());
        values.add(report.getOrdersIds());
        values.add(report.getProductsIds());
        return values;
    }
    
    public static boolean insertReport( MongoCollection reportsCollection , GeneralReport report){
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
