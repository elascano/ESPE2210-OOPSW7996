package ec.edu.espe.SingletonGUI.controller;

import ec.edu.espe.SingletonGUI.model.Usser;
import utils.DbManager;
import com.google.gson.Gson;
import ec.edu.espe.SingletonGUI.view.FrmLogIn;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class LogInController {
    public Usser confirmUsser(Usser usser){
        Usser confirmedUsser = new Usser();
        
        DbManager dbManager = new DbManager();
        String uri = "mongodb+srv://programmer:database@oop.1fqy266.mongodb.net/?retryWrites=true&w=majority";
        dbManager.connect(uri, "Singleton");
  
        Document foundDocument = dbManager.find("Ussers", "usserName", 
                usser.getUsserName());
        
        if(foundDocument == null){
            FrmLogIn frmLogIn = new FrmLogIn();
            JOptionPane.showMessageDialog(frmLogIn, "Not matching usser found");
            confirmedUsser = null;
        }else{
            Gson gson = new Gson();
            String json = foundDocument.toJson();
            Usser foundUsser = gson.fromJson(json, Usser.class);
            confirmedUsser = compare(usser, foundUsser);
        }
        
        return confirmedUsser;
    }
    public Usser compare(Usser usser, Usser foundUsser){
        if(usser.getPassword().equals(foundUsser.getPassword())){
            return foundUsser;
        }else{
            FrmLogIn frmLogIn = new FrmLogIn();
            JOptionPane.showMessageDialog(frmLogIn, "The password is incorrect.");
            return null;
        }   
    }
}
