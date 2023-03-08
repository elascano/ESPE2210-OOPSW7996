package ec.edu.espe.SingletonGUI.controller;

import com.google.gson.Gson;
import ec.edu.espe.SingletonGUI.model.USTax;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.bson.Document;
import utils.DbManager;

/*
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */

public class TaxCalculatorController {
    public static float calculateTaxPerProduct(float price, float taxPercentage){
    
    float iva = price * (taxPercentage/100);
    
    return iva;
    }
    
    public static float salesTotal(float price, float taxPerProduct) {
        float total;
        float roundedTotal;
        
        total = price + taxPerProduct;
        roundedTotal = (float) (Math.round(total * 100.0) / 100.0);
        
        return roundedTotal;
    }   
    
    public static void detectWrongStringInput(char c, Frame frame){
        if((c != KeyEvent.VK_BACK_SPACE) && (!(Character.isAlphabetic(c)))
        &&(c != KeyEvent.VK_SPACE)){      
            
            JOptionPane.showMessageDialog(frame, c + 
            " is not accepted here.","warning imput data",
            JOptionPane.WARNING_MESSAGE);
        } 
    } 
    
    public static void detectWrongMoneyFormat(char c, Frame frame){
        if((c != KeyEvent.VK_BACK_SPACE) && !(Character.isDigit(c)) && 
           (c != KeyEvent.VK_SPACE) && (c != KeyEvent.VK_PERIOD)){
            JOptionPane.showMessageDialog(frame, c + " is not accepted here.",
                    "warning imput data",JOptionPane.WARNING_MESSAGE);
        } 
    } 
    
    public static float getStateTax(String state){
        float stateTaxPercentage;
        
        DbManager dbManager = new DbManager();
        String uri = "mongodb+srv://programmer:database@oop.1fqy266.mongodb.net/?retryWrites=true&w=majority";
        dbManager.connect(uri, "Singleton");
        
        Document foundDocument = dbManager.find("USTax", "state", state);
        String json = foundDocument.toJson();
        
        Gson gson = new Gson();
        
        USTax usTax = gson.fromJson(json, USTax.class);
        stateTaxPercentage = usTax.getIvaPercentage();
    
        return stateTaxPercentage;
    }
}
