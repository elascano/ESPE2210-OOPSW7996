package utils;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.model.Product;
import ec.edu.espe.mongodbmanager.MongoDbManager;
import java.util.ArrayList;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class CostCalculator {
    private static float computeMaterialUnitCost(int id){
        String uri = "mongodb+srv://oop:oop@cluster0.og4urrq.mongodb.net/?retryWrites=true&w=majority";
        String dataBase = "ManagementSoftware";
        String collection = "Materials";
        MongoCollection materialsCollection =  MongoDbManager.connectToCollection(uri, dataBase, collection);
        float totalCost = Float.parseFloat(MongoDbManager.findValue(materialsCollection, id, "cost").replaceAll(" ", ""));
        int quantity = Integer.parseInt(MongoDbManager.findValue(materialsCollection, id, "quantity").replaceAll(" ", ""));
        float unitQuantity = Math.round(totalCost/quantity);
        MongoDbManager.update(materialsCollection, id, "unitCost", unitQuantity);
        return unitQuantity;
    }
    
    private static float computeMaterialsCostPerProduct(Product product){
        ArrayList<Integer> materialsListPerProduct = product.getMaterialsIds();
        ArrayList<Float> materialsQuantitiesPerProduct = product.getMaterialsQuantities();
        float totalMaterialsCostPerProduct = 0;
        for(int i = 0; i< materialsListPerProduct.size(); i++){
            int materialId = materialsListPerProduct.get(i);
            float materialUnitCost = computeMaterialUnitCost(materialId);
            float materialQuantity =  materialsQuantitiesPerProduct.get(i);
            float materialTotalCost = materialUnitCost * materialQuantity;
            totalMaterialsCostPerProduct += materialTotalCost;
            }
        return totalMaterialsCostPerProduct;
    }
    
    private static float computeWorkingTimeCostPerProduct(Product product){
        int workingTime = product.getWorkingTime();
        float currentSalary = 400.0F; //this value must come from database
        float workingHourCost = (float) ((currentSalary/30)/8);
        float workingTimeCostPerProduct = workingHourCost * workingTime;
        return workingTimeCostPerProduct;
    } 
    
    public static void calculateTotalProductProductionCost(Product product){
        float totalProductProductionCost = computeMaterialsCostPerProduct(product) + computeWorkingTimeCostPerProduct(product);
        String uri = "mongodb+srv://oop:oop@cluster0.og4urrq.mongodb.net/?retryWrites=true&w=majority";
        String dataBase = "ManagementSoftware";
        String collection = "Products";
        MongoCollection productsCollection =  MongoDbManager.connectToCollection(uri, dataBase, collection);
        MongoDbManager.update(productsCollection, product.getId(), "cost", totalProductProductionCost);
    }
}
