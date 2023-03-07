package utils;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.controller.MaterialsOrganizer;
import ec.edu.espe.ehamanagement.controller.Profile;
import ec.edu.espe.ehamanagement.model.Material;
import ec.edu.espe.ehamanagement.model.Product;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class CostsCalculator {

    public static float computeMaterialUnitCost(Material material){
        float totalCost;
        double quantity;
        float unitQuantity ;
        
        totalCost = material.getGeneralCost();
        quantity = material.getGeneralQuantity();
        unitQuantity = roundToTwoDecimalPlaces((float)(totalCost / quantity));

        return unitQuantity;
    }

    private static float computeMaterialsCostPerProduct(MongoCollection materialsCollection, Product product) {
        ArrayList materialsListPerProduct;
        ArrayList materialsQuantitiesPerProduct; 
        float totalMaterialsCostPerProduct;
        ArrayList <Float> materialsUnitCosts; 
        ArrayList <Float> materialsQuantities;
        double materialId;
        
        materialsListPerProduct = DictionaryConversor.convertToArrayList(product.getMaterials(), "keys");
        materialsQuantitiesPerProduct = DictionaryConversor.convertToArrayList(product.getMaterials(), "values");
        materialsUnitCosts = new ArrayList();
        materialsQuantities = new ArrayList();
        
        if (!materialsListPerProduct.isEmpty()) {
            for (int i = 0; i < materialsListPerProduct.size(); i++) {
                materialId = Double.valueOf(String.valueOf(materialsListPerProduct.get(i)));
                materialsUnitCosts.add(Float.parseFloat(String.valueOf(MaterialsOrganizer.getValueFromMaterial(materialsCollection, "id", (int) materialId, "unitCost"))));
                materialsQuantities.add(Float.valueOf(String.valueOf(materialsQuantitiesPerProduct.get(i))));
            }
        }
        totalMaterialsCostPerProduct = computeMaterialsCostPerProduct(materialsUnitCosts,materialsQuantities);
        return totalMaterialsCostPerProduct;
    }

    public static float computeMaterialsCostPerProduct(ArrayList <Float> materialsUnitCosts, ArrayList <Float> materialsQuantities ){
        float totalMaterialsCostPerProduct;
        totalMaterialsCostPerProduct = 0;
        float materialTotalCost;
        
        for (int i = 0; i < materialsUnitCosts.size(); i++) {
            materialTotalCost = materialsUnitCosts.get(i)* materialsQuantities.get(i);
            totalMaterialsCostPerProduct += materialTotalCost;
        }
        return roundToTwoDecimalPlaces(totalMaterialsCostPerProduct);
    }
    
    
    
    private static float computeWorkingTimeCostProduct(MongoCollection userCollection, Product product){
        int workingTime;
        float currentSalary; 
        float workingTimeCost;
        
        workingTime = product.getWorkingTime();
        currentSalary = Float.valueOf(String.valueOf(Profile.getValueFromUser(userCollection, 1, "currentSalary")));
        workingTimeCost = computeWorkingTimeCostProduct(currentSalary, workingTime);
        
        return workingTimeCost;
    }
    
    public static float computeWorkingTimeCostProduct(float currentSalary, int working){
        int workingTime;
        float workingHourCost;
        float workingTimeCostPerProduct; 
        
        workingTime = working;
        workingHourCost = (float) ((currentSalary / 30) / 8);
        workingTimeCostPerProduct = workingHourCost * workingTime;
        
        return roundToTwoDecimalPlaces(workingTimeCostPerProduct);
    }
    
    public static float computeTotalProductProductionCost(MongoCollection materialsCollection, MongoCollection userCollection, Product product){
        float materialsCostPerProduct;
        float workingTimeCostPerProduct;
        float totalProductProductionCost;
        
        materialsCostPerProduct =  computeMaterialsCostPerProduct(materialsCollection, product);
        workingTimeCostPerProduct = computeWorkingTimeCostProduct(userCollection, product);
        totalProductProductionCost = computeTotalProductProductionCost(materialsCostPerProduct, workingTimeCostPerProduct);
        
        return roundToTwoDecimalPlaces(totalProductProductionCost);
    }

    public static float computeTotalProductProductionCost(float materialsCostPerProduct, float workingTimeCostPerProduct){
        float totalProductProductionCost;
        
        totalProductProductionCost = materialsCostPerProduct+ workingTimeCostPerProduct;
        
        return roundToTwoDecimalPlaces(totalProductProductionCost);
    }
    
    private static float roundToTwoDecimalPlaces(float number){
        if (Float.isNaN(number) || Float.isInfinite(number)) {
            throw new IllegalArgumentException("Número inválido: " + number);
        } else {
            BigDecimal bd = new BigDecimal(number);
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            double roundedNumber = bd.doubleValue();
            float convertedNumber = Float.parseFloat(String.valueOf(roundedNumber));
            return convertedNumber;
        }
    }
}
