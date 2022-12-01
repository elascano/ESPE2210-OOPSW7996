package espe.edu.shoppingmallprogram.view;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import java.util.Scanner;
import espe.edu.newpackage.model.Store;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class ShoppingMallProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Store> store = new ArrayList<Store>();

        Store storeInfo = new Store();
        Scanner input = new Scanner(System.in);

        boolean repeat = true;
        int position[] = new int[1];
        position[0] = 0;
        int option;

        while (repeat == true) {

            System.out.println("Menu");
            System.out.println("1.Store ingress");
            System.out.println("2.Close");
            System.out.println("Save Json");

            System.out.println("Ingress the number option:");
            option = input.nextInt();

            switch (option) {
                case 1:
                    enterStore(store, storeInfo,position);
                    System.out.println("");
                    position[0]++;
                    break;
                case 2:
                    repeat=false;
                    break;
            }

        }
        saveStoreJson(store);
    }

    public static void enterStore(ArrayList<Store> store, Store storeInfo, int position[]) {
        String localName;
        int id;
        String nameOwner;
        long phoneNumber;
        String numberOfPhone;
        boolean repeatOwner;
        System.out.println("===============================");
        System.out.println("      ENTER STORE DATA      ");
        System.out.println("===============================");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter de id: ");
        id = input.nextInt();

        System.out.println("Enter the owner name");
        nameOwner = input.nextLine();

        System.out.println("Enter the Local name");
        localName = input.nextLine();

        System.out.println("");

        System.out.println("");

        repeatOwner = false;
        System.out.println("Enter the phone number");
        numberOfPhone = input.nextLine();
        input.nextLine();

        String regex = "\\d{10}";

        while (numberOfPhone.matches(regex) == false) {
            System.out.println("The number is: " + numberOfPhone);
            System.out.println("Is the above phone number valid? " + numberOfPhone.matches(regex));
            System.out.println("");
            System.out.println("Enter the phone number");
            numberOfPhone = input.nextLine();
            input.nextLine();
        }

        storeInfo = new Store(id, localName, nameOwner, numberOfPhone);
        store.add(store.size(), storeInfo);
    }
    public static void saveStoreJson(ArrayList<Store> store){
        File taxiDriverFile = new File("Storeinfo.json");
        Gson gson = new Gson();
        JsonArray storeInfo = new JsonArray();

        for (int i = 0; i < store.size(); i++) {
            gson.toJsonTree(store.get(i));
            storeInfo.add(gson.toJsonTree(store.get(i)));
        }
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(taxiDriverFile, false));
            writer.print(storeInfo);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
