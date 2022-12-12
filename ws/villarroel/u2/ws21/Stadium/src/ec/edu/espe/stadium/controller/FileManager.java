
package ec.edu.espe.stadium.controller;

import com.google.gson.Gson;
import ec.edu.espe.stadium.model.StadiumInfo;
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
    public static void enterStadium(ArrayList<StadiumInfo> stadiumInfo, StadiumInfo stadiumData) {
        String stadiumName;
        String id;
        String capacity;
        System.out.println("===============================");
        System.out.println("      ENTER STADIUM DATA      ");
        System.out.println("===============================");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter de id: ");
        id = input.nextLine();
        input.nextLine();
        
        System.out.println("");

        System.out.println("Enter the Stadium name: ");
        stadiumName = input.nextLine();

        System.out.println("");

        System.out.println("Enter the capacity: ");
        capacity = input.nextLine();
        input.nextLine();


        stadiumInfo.add(new StadiumInfo(id, stadiumName, capacity));
        FileManager.saveData(stadiumInfo);
    }
    
    public static void saveData(ArrayList<StadiumInfo> stadiumInfo) {
        Gson gson = new Gson();
        String json = gson.toJson(stadiumInfo);
        File file = new File("StadiumInfo.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("The data was saved successfully");
        } catch (Exception e) {
            System.out.println("A problem occurred while saving the data ");
        }

    }
    
    public static ArrayList<StadiumInfo> loadData() {
        Gson gson = new Gson();

        ArrayList<StadiumInfo> stadiumInfo = new ArrayList<>();
        String jsonFile = "";
        String[] jsonStoreInfo;

        try ( Scanner scFile = new Scanner(new File("StadiumInfo.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            jsonFile = jsonFile.replace("[", "");
            jsonFile = jsonFile.replace("]", "");

            jsonStoreInfo = jsonFile.split("},");

            for (int i = 0; i < jsonStoreInfo.length; i++) {
                if (i < jsonStoreInfo.length - 1) {
                    stadiumInfo.add(gson.fromJson(jsonStoreInfo[i] + "}", StadiumInfo.class));
                } else {
                    stadiumInfo.add(gson.fromJson(jsonStoreInfo[i], StadiumInfo.class));
                }
            }

            System.out.println("Data successfully uploaded");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return stadiumInfo;
    }
    
    public static void showStadiumList(ArrayList<StadiumInfo> stadiumInfo)throws IOException, FileNotFoundException {
        FileReader stadiumRead = null;
        String dataLine;
        int counter=0;
        File file = new File("StadiumInfo.json");
        stadiumRead = new FileReader(file);
        BufferedReader BR = new BufferedReader(stadiumRead);
        while ((dataLine = BR.readLine()) != null) {
            counter++;
            System.out.println((counter) + ". " + dataLine);

        }

    }
    
    public static void modifyStadium(ArrayList<StadiumInfo> stadiumInfo) throws IOException {
        
        System.out.println("===============================");
        System.out.println("        MODIFY STADIUM           ");
        System.out.println("===============================");
        showStadiumList(stadiumInfo);
        
        Scanner scan = new Scanner(System.in);
        int idStadium;
        String stadiumIdChange; 
        String stadiumNameChange; 
        String stadiumCapacityChange; 
        
        System.out.println("Select a Store: ");
        int option;
        option=scan.nextInt();
        
        System.out.println("Which stadium do you want to modify?: ");
        idStadium = (option - 1); 

        if (stadiumInfo.size() > idStadium) {
            int optionMenu = 0;
            while (optionMenu != 4) {
                System.out.println("What attribute do you want to modify?");
                System.out.println("1. stadium Id");
                System.out.println("2. stadium Name");
                System.out.println("3. stadium capacity");
                System.out.println("4. Return");
                System.out.println("Write the option:");
                optionMenu=scan.nextInt();
                scan.nextLine();

                switch (optionMenu) {

                    case 1:
                        System.out.print("type the new stadium Id: ");
                        stadiumIdChange = scan.nextLine();
                        try {
                            stadiumInfo.get(idStadium).setId(stadiumIdChange);
                            System.out.println("The stadium was update successfully");
                            FileManager.saveData(stadiumInfo);
                        } catch (Exception e) {
                            System.out.println("The stadium was not update");
                        }
                        break;

                    case 2:
                        System.out.print("type the new stadium name: ");
                        stadiumNameChange = scan.nextLine();
                        try {
                            stadiumInfo.get(idStadium).setStadiumName(stadiumNameChange);
                            System.out.println("The stadium was update successfully");
                            FileManager.saveData(stadiumInfo);
                        } catch (Exception e) {
                            System.out.println("The stadium was not update");
                        }
                        break;

                    case 3:
                        System.out.print("type the new stadium capacity: ");
                        stadiumCapacityChange = scan.nextLine();
                        try {
                            stadiumInfo.get(idStadium).setCapcity(stadiumCapacityChange);
                            System.out.println("The Store was update successfully");
                            FileManager.saveData(stadiumInfo);
                        } catch (Exception e) {
                            System.out.println("The stadium was not update");
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
    
    public static void searchStadiumInfo(ArrayList<StadiumInfo> stadiumInfo, Scanner input) throws IOException {
        int storeIdFinder;
        int found = 0;
        System.out.println("==============================="); 
        System.out.println("        SEARCH STADIUM            ");
        System.out.println("===============================");
        if (!stadiumInfo.isEmpty()) {
            System.out.println("What is the stadium id?");
            storeIdFinder = input.nextInt();
            String StoreIdNumber = String.valueOf(storeIdFinder);
            FileReader storeRead = null;
            String dataLine;
            File file = new File("StadiumInfo.json");
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
                System.out.println("Unregistered stadium");
            }
        } else {
            System.out.println("No stadium registered yet");
        }
    }
    
    public static void removeStadium(ArrayList<StadiumInfo> stadiumInfo, Scanner scan) throws IOException {
        System.out.println("===============================");
        System.out.println("         REMOVER stadium         "); 
        System.out.println("===============================");
        showStadiumList(stadiumInfo);
        int storeNumberRemover;
        System.out.println("Which stadium do you want to remove?: ");
        storeNumberRemover=scan.nextInt();
        storeNumberRemover--;
        try {
            stadiumInfo.remove(storeNumberRemover);
            System.out.println("The stadium was remove successfully");
            FileManager.saveData(stadiumInfo);
        } catch (Exception e) {
            System.out.println("The stadium was not remove");
        }
    }
}
