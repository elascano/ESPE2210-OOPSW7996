package ec.edu.espe.ehamanagement.controller;

import com.mongodb.client.MongoCollection;
import utils.MongoConnection;
import ec.edu.espe.ehamanagement.model.Product;
import ec.edu.espe.mongodbmanager.MongoDbManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import utils.CostsCalculator;
import utils.DictionaryConversor;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Inventory implements Observer{
    private static  MongoCollection materialsCollection;
    private static MongoCollection userCollection;
    private final MaterialsOrganizer materialsOrganizer;
    
    public Inventory(MaterialsOrganizer materialsOrganizer) {
        this.materialsOrganizer = materialsOrganizer;
        this.materialsOrganizer.registerObserver(this);
    }
    
    @Override
    public  void update(JPanel frame) {
        JOptionPane.showMessageDialog(frame, "Inventory is going to be updated too", "Inventory update", JOptionPane.INFORMATION_MESSAGE); 
    }
    
    private static ArrayList getFieldsToInsert(){
        ArrayList fields = new ArrayList();
        fields.add("id");
        fields.add("name");
        fields.add("cost");
        fields.add("description");
        fields.add("materialsIds");
        fields.add("materialsQuantities");
        fields.add("workingTime");
        fields.add("quantity");
        return fields;   
    }
    
    private static ArrayList getValuesToInsert(Product product){
        ArrayList values = new ArrayList();
        values.add(product.getId());
        values.add(product.getName());
        values.add(product.getProductionCost());
        values.add(product.getDescription());
        ArrayList materialsIds = DictionaryConversor.convertToArrayList(product.getMaterials(), "keys");
        ArrayList materialsQuantities = DictionaryConversor.convertToArrayList(product.getMaterials(), "values");
        values.add(materialsIds);
        values.add(materialsQuantities);
        values.add(product.getWorkingTime());
        values.add(product.getQuantity());
        return values;
    }
    

    public static boolean insertProduct( MongoCollection productsCollection ,Product product){
        product.setId(assignIdToProduct(productsCollection));
        ArrayList fields = getFieldsToInsert();
        ArrayList values = getValuesToInsert(product);
        HashMap productToInsert = DictionaryConversor.convertToDictionary(fields, values);
        MongoDbManager.insertDocument(productsCollection, productToInsert);
        return true;
    }
    
    public static int assignIdToProduct(MongoCollection productsCollection){
        ArrayList products = MongoDbManager.getFieldValues(productsCollection, "id");
        if(!products.isEmpty()){
            int lastId = (int) Collections.max(products);
            int newId = lastId + 1;
            return newId;
        }else{
            return 1;
        }
    }
    
    public static boolean deleteProduct(MongoCollection productsCollection, int id){
        return MongoDbManager.deleteDocument(productsCollection, "id", id);
    }
    
    public static Object getValueFromProduct(MongoCollection productsCollection,String searchField, Object searchValue, String fieldToFind){
        Object foundValue;
        foundValue = MongoDbManager.getDocumentValue(productsCollection, searchField,searchValue, fieldToFind);
        return foundValue;
    }
    
    public static ArrayList readAll(MongoCollection productsCollection, String field){
        ArrayList productsIds;
        productsIds = MongoDbManager.getFieldValues(productsCollection, field);
        return productsIds;
    }
    
    public static boolean updateProduct(MongoCollection productsCollection, Product product){
        int id = product.getId();
        MongoDbManager.updateDocument(productsCollection, "id",id, "name", product.getName());
        MongoDbManager.updateDocument(productsCollection, "id",id, "cost", product.getProductionCost());
        MongoDbManager.updateDocument(productsCollection, "id",id, "description", product.getDescription());
        MongoDbManager.updateDocument(productsCollection, "id",id, "quantity", product.getQuantity());
        MongoDbManager.updateDocument(productsCollection,"id", id, "workingTime", product.getWorkingTime());
        MongoDbManager.updateDocument(productsCollection,"id",id, "materialsIds", product.getMaterials().keySet());
        MongoDbManager.updateDocument(productsCollection,"id",id, "materialsQuantities", product.getMaterials().values());
        return true;
    }
    
    public static  boolean existsProduct(MongoCollection productsCollection, String field, Object value){
        return MongoDbManager.existsDocument(productsCollection, field, value);
    }
    
    public static ArrayList <Product> readInventory( MongoCollection productsCollection){
        ArrayList <Object> ids = readAll(productsCollection, "id");
        Product readedProduct;
        ArrayList <Product> readedProducts = new ArrayList();
        MongoConnection mongoConnection = MongoConnection.getInstance();
        for (Object readedId: ids){
            int id = Integer.parseInt(String.valueOf(readedId));
            String name = String.valueOf(getValueFromProduct( productsCollection,"id",  id, "name"));
            Float productionCost = Float.valueOf(String.valueOf(getValueFromProduct(productsCollection,"id", id, "cost")));
            String description = String.valueOf(getValueFromProduct(productsCollection,"id", id, "description"));
            ArrayList materialsIds = (ArrayList<Object>)(getValueFromProduct(productsCollection,"id", id, "materialsIds"));
            ArrayList materialsQuantities = (ArrayList<Object>)(getValueFromProduct(productsCollection,"id", id, "materialsQuantities"));
            HashMap materials = DictionaryConversor.convertToDictionary(materialsIds, materialsQuantities);
            int workingTime = Integer.parseInt(String.valueOf(getValueFromProduct( productsCollection, "id", id, "workingTime")));
            int quantity = Integer.parseInt(String.valueOf(getValueFromProduct( productsCollection, "id", id, "quantity")));
            
            readedProduct = new Product(id,  name, productionCost, description, materials, workingTime, quantity);
            
            materialsCollection = mongoConnection.getCollection("Materials"); 
            userCollection = mongoConnection.getCollection("User"); 
            float calculatedCost;
            calculatedCost = CostsCalculator.computeTotalProductProductionCost(materialsCollection, userCollection, readedProduct);
            readedProduct.setProductionCost(calculatedCost);
            readedProducts.add(readedProduct);

        }
        return readedProducts;
    }


        

    
}
