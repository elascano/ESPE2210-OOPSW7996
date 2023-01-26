package ec.edu.espe.bankManager.controller;

import com.google.gson.Gson;
import ec.edu.espe.bankManager.model.Bank;
import java.util.ArrayList;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class BankController {
    
    public static Bank jsonToBank(String json) {
        Bank account;
        Gson gson;
        
        gson = new Gson();
        account = new Bank();
        account = gson.fromJson(json, account.getClass());

        return account;
    }
    
    public static ArrayList loadBanks(ArrayList<String> jsons) {
        ArrayList<Bank> accounts;        
        accounts = new ArrayList<>();
        
        for (String json : jsons) {
            accounts.add(jsonToBank(json));
        }
        
        return accounts;
    }
    
}
