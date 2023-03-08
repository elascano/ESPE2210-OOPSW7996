package ec.edu.espe.SingletonGUI.controller;

import java.awt.Frame;
import javax.swing.JOptionPane;
import utils.DbManager;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class ChangeTaxController {
    public static void changeTax(String state, String newTaxPercentage, Frame frame){
        DbManager dbManager = new DbManager();
        String uri = "mongodb+srv://programmer:database@oop.1fqy266.mongodb.net/?retryWrites=true&w=majority";
        
        dbManager.connect(uri, "Singleton");
        
        Boolean isUpdated = dbManager.update("USTax", "state", state, 
        "ivaPercentage", newTaxPercentage);
        
        if (isUpdated == true){
            JOptionPane.showMessageDialog(frame, "The tax was successfuly changed.");
        
        }else{
            JOptionPane.showMessageDialog(frame, 
            "An error occurred while attempting to find or update the document");
        }
    }
}
