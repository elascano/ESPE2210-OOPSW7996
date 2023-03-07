package ec.edu.espe.ehamanagement.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.model.InventoryReport;
import ec.edu.espe.ehamanagement.model.Product;
import ec.edu.espe.mongodbmanager.MongoDbManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import utils.DictionaryConversor;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class InventoryReportGenerator{
    public static ArrayList getFieldsToInsert(){
        ArrayList fields = new ArrayList();
        fields.add("id");
        fields.add("type");
        fields.add("date");
        fields.add("stockProductsIds");
        fields.add("shortagProductsIds");
        return fields;   
    }
    public static ArrayList getValuesToInsert(InventoryReport report){
        ArrayList values = new ArrayList();
        values.add(report.getId());
        values.add(report.getType());
        values.add(report.getDate());
        values.add(report.getStockProductsIds());
        values.add(report.getShortageProductsIds());
        return values;
    }
    public static ArrayList <Product> filterProducts(ArrayList <Product> readedProducts, String type){
        ArrayList <Product> stockProducts = new ArrayList();
        ArrayList <Product> shortageProducts = new ArrayList();
        for(Product product: readedProducts){
            if(product.getQuantity() < 5){
                shortageProducts.add(product);
            }else{
                stockProducts.add(product);
            }
        }
        if (type.equals("stock")){
            return stockProducts;
        }else if(type.equals("shortage")){
            return shortageProducts;
        }else{
            return null;
        } 
    }
    public static boolean insertReport( MongoCollection reportsCollection ,  InventoryReport report){
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
