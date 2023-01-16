package ec.edu.espe.bankManager.controller;

import com.google.gson.Gson;
import ec.edu.espe.bankManager.model.Account;
import java.util.ArrayList;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class AccountController {
    
    public static Account jsonToAccount(String json) {
        Account account;
        Gson gson;
        
        gson = new Gson();
        account = new Account();
        account = gson.fromJson(json, account.getClass());

        return account;
    }
    
    public static ArrayList loadAccounts(ArrayList<String> jsons) {
        ArrayList<Account> accounts;        
        accounts = new ArrayList<>();
        
        for (String json : jsons) {
            accounts.add(jsonToAccount(json));
        }
        
        return accounts;
    }
    
    public static void payBills(Account account, float amount) {
        System.out.println("pay bills");
    }
}
