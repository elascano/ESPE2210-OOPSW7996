package utils;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.controller.MaterialsOrganizer;
import ec.edu.espe.ehamanagement.controller.Profile;
import ec.edu.espe.ehamanagement.model.Material;
import ec.edu.espe.ehamanagement.model.Product;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class CostsCalculator {

    public static float computeMaterialUnitCost(Material material){
        float totalCost = material.getGeneralCost();
        double quantity = material.getGeneralQuantity();
        float unitQuantity = (float) (totalCost / quantity);
        unitQuantity = roundToTwoDecimalPlaces(unitQuantity);
        System.out.println("material unit quantity ->" + unitQuantity);
        return unitQuantity;
    }

    private static float computeMaterialsCostPerProduct(MongoCollection materialsCollection, Product product) {
        ArrayList materialsListPerProduct = DictionaryConversor.convertToArrayList(product.getMaterials(), "keys");
        ArrayList materialsQuantitiesPerProduct = DictionaryConversor.convertToArrayList(product.getMaterials(), "values");
        float totalMaterialsCostPerProduct;
        ArrayList <Float> materialsUnitCosts = new ArrayList();
        ArrayList <Float> materialsQuantities = new ArrayList();
        if (!materialsListPerProduct.isEmpty()) {
            for (int i = 0; i < materialsListPerProduct.size(); i++) {
                double materialId = Double.valueOf(String.valueOf(materialsListPerProduct.get(i)));
                materialsUnitCosts.add(Float.parseFloat(String.valueOf(MaterialsOrganizer.getValueFromMaterial(materialsCollection, "id", (int) materialId, "unitCost"))));
                materialsQuantities.add(Float.valueOf(String.valueOf(materialsQuantitiesPerProduct.get(i))));
            }
        }
        totalMaterialsCostPerProduct = computeMaterialsCostPerProduct(materialsUnitCosts,materialsQuantities);
        return totalMaterialsCostPerProduct;
    }

    public static float computeMaterialsCostPerProduct(ArrayList <Float> materialsUnitCosts, ArrayList <Float> materialsQuantities ){
        float totalMaterialsCostPerProduct = 0;
        for (int i = 0; i < materialsUnitCosts.size(); i++) {
            float materialTotalCost = materialsUnitCosts.get(i)* materialsQuantities.get(i);
            totalMaterialsCostPerProduct += materialTotalCost;
        }
        return roundToTwoDecimalPlaces(totalMaterialsCostPerProduct);
    }
    
    public static float computeTotalProductProductionCost(MongoCollection materialsCollection, MongoCollection userCollection, Product product){
        float totalProductProductionCost = computeMaterialsCostPerProduct(materialsCollection, product) + computeWorkingTimeCostProduct(userCollection, product);
        return totalProductProductionCost;
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
    
    private static float computeWorkingTimeCostProduct(MongoCollection userCollection, Product product){
        int workingTime = product.getWorkingTime();
        float currentSalary = Float.valueOf(String.valueOf(Profile.getValueFromUser(userCollection, 1, "currentSalary")));
        return computeWorkingTimeCostProduct(currentSalary, workingTime);

    }
    
    public static float computeWorkingTimeCostProduct(float currentSalar, int working){
        int workingTime = working;
        float currentSalary = currentSalar;
        float workingHourCost = (float) ((currentSalary / 30) / 8);
        float workingTimeCostPerProduct = roundToTwoDecimalPlaces(workingHourCost * workingTime);
        return workingTimeCostPerProduct;
    }
}
