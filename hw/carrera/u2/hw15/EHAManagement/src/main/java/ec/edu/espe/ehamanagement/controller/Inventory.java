package ec.edu.espe.ehamanagement.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.model.Product;
import ec.edu.espe.mongodbmanager.MongoDbManager;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Inventory {
    public static void insertProduct(MongoCollection productsCollection, Product product){
        ArrayList keys = Product.getAttributesNames();
        ArrayList values = Product.getAttributes(product);
        MongoDbManager.insert(productsCollection, keys, values);
    }
    
    public static int assignIdToProduct(MongoCollection collection){
        ArrayList products = MongoDbManager.read(collection);
        if(!products.isEmpty()){
            int lastId = (int) Collections.max(products);
            int newId = lastId + 1;
            return newId;
        }else{
            return 1;
        }
    }
    
}
