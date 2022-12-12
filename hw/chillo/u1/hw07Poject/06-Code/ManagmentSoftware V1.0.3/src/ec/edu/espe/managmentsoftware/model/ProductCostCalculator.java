/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.managmentsoftware.model;
import java.util.ArrayList;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class ProductCostCalculator {
    
private static float calculateMaterialsCostPerProduct(Product product){
    ArrayList<Material> materialListPerProduct = product.getMaterials();
    Material materialFromFile;
    float materialCost;
    float totalMaterialsCostPerProduct = 0;
    for(Material material: materialListPerProduct ){
        materialFromFile = GeneralMaterialList.searchMaterial(material.getId());
        materialCost = (materialFromFile.getCost()/materialFromFile.getGeneralQuantity())*materialFromFile.getUnitQuantity();
        totalMaterialsCostPerProduct += materialCost;
        }
    return totalMaterialsCostPerProduct;
}
private static float calculateWorkingTimeCostPerProduct(Product product){
    int workingTime = product.getWorkingTime();
    User foundUser = Registration.searchUser();
    float currentSalary = foundUser.getCurrentSalary();
    float workingHourCost = (float) ((currentSalary/30)/8);
    float workingTimeCostPerProduct = workingHourCost * workingTime;
    return workingTimeCostPerProduct;
} 
public static float calculateTotalProductProductionCost(Product product){
    float totalProductProductionCost = calculateMaterialsCostPerProduct(product) + calculateWorkingTimeCostPerProduct(product);
    return totalProductProductionCost;
}
}
