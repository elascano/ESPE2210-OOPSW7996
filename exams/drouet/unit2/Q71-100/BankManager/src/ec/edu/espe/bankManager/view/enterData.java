package ec.edu.espe.bankManager.view;

import com.google.gson.Gson;
import ec.edu.espe.bankManager.controller.DBManager;
import ec.edu.espe.bankManager.model.Account;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class enterData {
    
    public static void main(String[] args) {
        DBManager dbm = new DBManager();
        
        dbm.connect("mongodb+srv://oop22:oop22@cluster0.cd2tjad.mongodb.net/test", "Bank");
        Account account;
        account = new Account(4, "Diego", 75.5F);
        Gson gson = new Gson();
        String str = gson.toJson(account);
        dbm.createDocument("bank", str);
        
    }
    
}
