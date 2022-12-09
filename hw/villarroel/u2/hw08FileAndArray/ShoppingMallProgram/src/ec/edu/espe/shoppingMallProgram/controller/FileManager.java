
package ec.edu.espe.shoppingMallProgram.controller;

import com.google.gson.Gson;
import ec.edu.espe.shoppingMallProgram.model.StoreInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class FileManager {
    
    public static void enterStore(ArrayList<StoreInfo> store, StoreInfo storeInfo) {
        String localName;
        String id;
        String storeType;
        System.out.println("===============================");
        System.out.println("      ENTER STORE DATA      ");
        System.out.println("===============================");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter de id: ");
        id = input.nextLine();
        input.nextLine();
        
        System.out.println("");

        System.out.println("Enter the Local name: ");
        localName = input.nextLine();

        System.out.println("");

        System.out.println("Enter the store type: ");
        storeType = input.nextLine();
        input.nextLine();


        store.add(new StoreInfo(id, localName, storeType));
        FileManager.saveData(store);
    }
    
    public static void saveData(ArrayList<StoreInfo> storeInfo) {
        Gson gson = new Gson();
        String json = gson.toJson(storeInfo);
        File file = new File("Storeinfo.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("The data was saved successfully");
        } catch (Exception e) {
            System.out.println("A problem occurred while saving the data ");
        }

    }
    
    public static ArrayList<StoreInfo> loadData() {
        Gson gson = new Gson();

        ArrayList<StoreInfo> storeInfo = new ArrayList<>();
        String jsonFile = "";
        String[] jsonStoreInfo;

        try ( Scanner scFile = new Scanner(new File("Storeinfo.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            jsonFile = jsonFile.replace("[", "");
            jsonFile = jsonFile.replace("]", "");

            jsonStoreInfo = jsonFile.split("},");

            for (int i = 0; i < jsonStoreInfo.length; i++) {
                if (i < jsonStoreInfo.length - 1) {
                    storeInfo.add(gson.fromJson(jsonStoreInfo[i] + "}", StoreInfo.class));
                } else {
                    storeInfo.add(gson.fromJson(jsonStoreInfo[i], StoreInfo.class));
                }
            }

            System.out.println("Data successfully uploaded");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return storeInfo;
    }
    
    public static void showStoreList(ArrayList<StoreInfo> storeInfo)throws IOException, FileNotFoundException {
        FileReader StoreRead = null;
        String dataLine;
        int counter=0;
        File file = new File("Storeinfo.json");
        StoreRead = new FileReader(file);
        BufferedReader BR = new BufferedReader(StoreRead);
        while ((dataLine = BR.readLine()) != null) {
            counter++;
            System.out.println((counter) + ". " + dataLine);

        }

    }
    
    public static void modifyStore(ArrayList<StoreInfo> storeInfo) throws IOException {
        
        System.out.println("===============================");
        System.out.println("        MODIFY STORE           ");
        System.out.println("===============================");
        showStoreList(storeInfo);
        
        Scanner scan = new Scanner(System.in);
        int idStore;
        String storeIdChange;
        String storeNameChange;
        String storeTypeChange;
        
        System.out.println("Select a Store: ");
        int option;
        option=scan.nextInt();
        
        System.out.println("Which store do you want to modify?: ");
        idStore = (option - 1);

        if (storeInfo.size() > idStore) {
            int optionMenu = 0;
            while (optionMenu != 4) {
                System.out.println("What attribute do you want to modify?");
                System.out.println("1. Store Id");
                System.out.println("2. Store Name");
                System.out.println("3. Store Type");
                System.out.println("4. Return");
                System.out.println("Write the option:");
                optionMenu=scan.nextInt();
                scan.nextLine();

                switch (optionMenu) {

                    case 1:
                        System.out.print("type the new Store Id: ");
                        storeIdChange = scan.nextLine();
                        try {
                            storeInfo.get(idStore).setId(storeIdChange);
                            System.out.println("The store was update successfully");
                            FileManager.saveData(storeInfo);
                        } catch (Exception e) {
                            System.out.println("The store was not update");
                        }
                        break;

                    case 2:
                        System.out.print("type the new Store name: ");
                        storeNameChange = scan.nextLine();
                        try {
                            storeInfo.get(idStore).setStoreName(storeNameChange);
                            System.out.println("The store was update successfully");
                            FileManager.saveData(storeInfo);
                        } catch (Exception e) {
                            System.out.println("The store was not update");
                        }
                        break;

                    case 3:
                        System.out.print("type the new Store type: ");
                        storeTypeChange = scan.nextLine();
                        try {
                            storeInfo.get(idStore).setStoreType(storeTypeChange);
                            System.out.println("The Store was update successfully");
                            FileManager.saveData(storeInfo);
                        } catch (Exception e) {
                            System.out.println("The store was not update");
                        }
                        break;

                    case 4:
                        System.out.println("Unsuccessfull Operation :d");
                        break;
                    default:
                        System.out.println("Invalid option try again");
                        break;
                }
            }
        }else{
            System.out.println("error");
        }

    }
    
    public static void searchStoreInfo(ArrayList<StoreInfo> storeInfo, Scanner input) throws IOException {
        int storeIdFinder;
        int found = 0;
        System.out.println("===============================");
        System.out.println("        SEARCH STORE            ");
        System.out.println("===============================");
        if (!storeInfo.isEmpty()) {
            System.out.println("What is the store id?");
            storeIdFinder = input.nextInt();
            String StoreIdNumber = String.valueOf(storeIdFinder);
            FileReader storeRead = null;
            String dataLine;
            File file = new File("Storeinfo.json");
            storeRead = new FileReader(file);
            BufferedReader BR = new BufferedReader(storeRead);
            while ((dataLine = BR.readLine()) != null) {
                if (dataLine.contains(StoreIdNumber) == true) {
                    System.out.println("===============================");
                    System.out.println(dataLine);
                    found++;
                }
            }
            if (found == 0) {
                System.out.println("Unregistered Store");
            }
        } else {
            System.out.println("No Store registered yet");
        }
    }
    
    public static void removeStore(ArrayList<StoreInfo> storeInfo, Scanner scan) throws IOException {
        System.out.println("===============================");
        System.out.println("         REMOVER STORE         ");
        System.out.println("===============================");
        showStoreList(storeInfo);
        int storeNumberRemover;
        System.out.println("Which Store do you want to remove?: ");
        storeNumberRemover=scan.nextInt();
        storeNumberRemover--;
        try {
            storeInfo.remove(storeNumberRemover);
            System.out.println("The Store was remove successfully");
            FileManager.saveData(storeInfo);
        } catch (Exception e) {
            System.out.println("The Store was not remove");
        }
    }
}
