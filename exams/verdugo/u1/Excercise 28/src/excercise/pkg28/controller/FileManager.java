package excercise.pkg28.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import excercise.pkg28.model.Store;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class FileManager {
    public static void saveJsonFile(ArrayList<Store> store, String nameFile) {
        Scanner scan = new Scanner(System.in);
        String jsonStructure = new Gson().toJson(store);
        try {
            FileWriter file = new FileWriter(nameFile + ".json");

            file.write(jsonStructure);

            file.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void enterStoreData(Scanner scan, ArrayList<Store> store) {
        String name;
        int id;
        String numberOfId;
        String localName;
        Store storeInfo = new Store();
        System.out.println("====================================");
        System.out.println("          ENTER SHOPPING DATA          ");
        System.out.println("====================================");

        System.out.println("====================================");
        System.out.println("Enter the name: ");
        name = scan.nextLine();
        storeInfo.setName(name);
        System.out.println("");
        System.out.println("====================================");

        System.out.println("====================================");
        System.out.println("Enter the local name: ");
        localName = scan.nextLine();
        storeInfo.setlocalName(localName);
        System.out.println("");
        System.out.println("====================================");
        
        System.out.println("====================================");
        System.out.println("Enter the id: ");
        numberOfId = scan.nextLine();
        scan.nextLine();
        System.out.println("====================================");

        String regex = "\\d{10}";

        while (numberOfId.matches(regex) == false) {
            System.out.println(">>The number is: " + numberOfId);
            System.out.println(">>Is the above id valid? " + numberOfId.matches(regex));
            System.out.println(">>The number is must to be 10 numbers");
            
            System.out.println("====================================");
            System.out.println("Enter the id: ");
            numberOfId = scan.nextLine();
            scan.nextLine();
            System.out.println("====================================");
        }

        id = Integer.parseInt(numberOfId);
        
        storeInfo.setId(id);
        
        store.add(storeInfo);
    }
    
    public static void createJsonFile(Scanner scan, ArrayList<Store> store) {
        String fileName;
        int enter = 0;
        System.out.println(">>Ingress the name of the file you want to create: ");
        fileName = scan.next();
        do {
            enterStoreData(scan, store);
            saveJsonFile(store, fileName);
        } while (enter == 1);
    }
    
    public static ArrayList<Store> openJsonFile(ArrayList<Store> store, String nameFile) {
        Gson gson = new Gson();
        Scanner scan = new Scanner(System.in);


        try
        {
            Reader readFile = Files.newBufferedReader(Paths.get(nameFile + ".json"));
            TypeToken<ArrayList<Store>> type = new TypeToken<ArrayList<Store>>() {};
            store = gson.fromJson(readFile, type.getType());
            readFile.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println(">>ERORR!! file not Found");
        } catch (IOException ex)
        {
            System.out.println(">>JSON file is empty");
        }
        return store;
    }
    
    public static void readStore(Store store) {
        System.out.println(">>Shopping NAME ==>" + store.getName());
        System.out.println(">>Shopping LOCAL NAME ==>" + store.getlocalName());
        System.out.println(">>Shopping ID ==>" + store.getId());
    }

    public static int searchStore(Scanner scan, ArrayList<Store> store) {
        int id;
        int x = -1;
        Store storeInfo;
        System.out.println(">>Ingress the ID of the store: ");
        id = scan.nextInt();
        for (int i = 0; i < store.size(); i++) {
            storeInfo = store.get(i);
            if (id == storeInfo.getId()) {
                x = i;
                readStore(storeInfo);
            }
        }

        if (x == -1) {
            System.out.println(">>No Id recognized");
        }

        return x;
    }

    public static void updateStore(int box, ArrayList<Store> store, String nameFile){
        String name;
        int id;
        String numberOfId;
        String localName;
        Store storeInfo = new Store();
        Scanner scan = new Scanner(System.in);
        storeInfo = store.get(box);
        System.out.println("====================================");
        System.out.println("          ENTER SHOPPING DATA          ");
        System.out.println("====================================");

        System.out.println("====================================");
        System.out.println("Enter the name: ");
        name = scan.nextLine();
        storeInfo.setName(name);
        System.out.println("");
        System.out.println("====================================");

        System.out.println("====================================");
        System.out.println("Enter the local name: ");
        localName = scan.nextLine();
        storeInfo.setlocalName(localName);
        System.out.println("");
        System.out.println("====================================");
        
        System.out.println("====================================");
        System.out.println("Enter the id: ");
        numberOfId = scan.nextLine();
        scan.nextLine();
        System.out.println("====================================");

        String regex = "\\d{10}";

        while (numberOfId.matches(regex) == false) {
            System.out.println(">>The number is: " + numberOfId);
            System.out.println(">>Is the above id valid? " + numberOfId.matches(regex));
            System.out.println(">>The number is must to be 10 numbers");
            
            System.out.println("====================================");
            System.out.println("Enter the id: ");
            numberOfId = scan.nextLine();
            scan.nextLine();
            System.out.println("====================================");
        }

        id = Integer.parseInt(numberOfId);
        
        storeInfo.setId(id);
        
        saveJsonFile(store, nameFile);
    }

    public static void printStore(ArrayList<Store> store){
        Store storeInfo = new Store();
        for (int i = 0; i < store.size(); i++) {
            storeInfo = store.get(i);
            readStore(storeInfo);
        }
    }

    public static void deleteStore(ArrayList<Store> store, String nameFile){
        int box = -1;
        Scanner scan = new Scanner(System.in);
        box = searchStore(scan, store);
        if (box > -1) {
            store.remove(box);
            System.out.println(">>Data in JSON file deleted succesfully.");
        }
        saveJsonFile(store, nameFile);

    }
        
    public static void deleteJsonFile(String nameFile){
        Scanner scan = new Scanner(System.in);
        System.out.println(">>Ingress the name of the file you want to delete: ");
        nameFile = scan.next();
        try {
            FileWriter file = new FileWriter(nameFile + ".json");

            file.write("[]");

            file.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        System.out.println(">>JSON file deleted succesfully.");
    }

}
