package ec.edu.espe.catsAdministrator.controller;

import com.google.gson.Gson;
import ec.edu.espe.catsAdministrator.model.CatsInfo;
import ec.edu.espe.catsAdministrator.utils.CustomException;
import ec.edu.espe.catsAdministrator.utils.HelperAge;
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

    public static void enterStadium(ArrayList<CatsInfo> catInfo, CatsInfo catData) {
        String catName;
        String id;
        int age;
        System.out.println("===============================");
        System.out.println("      ENTER CAT DATA      ");
        System.out.println("===============================");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter de cat's id: ");
        id = input.nextLine();
        input.nextLine();

        System.out.println("");

        System.out.println("Enter the cat's name: ");
        catName = input.nextLine();

        System.out.println("");

        System.out.println("Enter the cat's age: ");
        age = input.nextInt();
        try {
            age = HelperAge.validAge(age, input);
        } catch (CustomException exc) {
            exc.printStackTrace();
        }

        input.nextLine();

        catInfo.add(new CatsInfo(id, catName, age));
        FileManager.saveData(catInfo);
    }

    public static void saveData(ArrayList<CatsInfo> catInfo) {
        Gson gson = new Gson();
        String json = gson.toJson(catInfo);
        File file = new File("CatInfo.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("The data was saved successfully");
        } catch (Exception e) {
            System.out.println("A problem occurred while saving the data ");
        }

    }

    public static ArrayList<CatsInfo> loadData() {
        Gson gson = new Gson();

        ArrayList<CatsInfo> catInfo = new ArrayList<>();
        String jsonFile = "";
        String[] jsonStoreInfo;

        try ( Scanner scFile = new Scanner(new File("CatInfo.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            jsonFile = jsonFile.replace("[", "");
            jsonFile = jsonFile.replace("]", "");

            jsonStoreInfo = jsonFile.split("},");

            for (int i = 0; i < jsonStoreInfo.length; i++) {
                if (i < jsonStoreInfo.length - 1) {
                    catInfo.add(gson.fromJson(jsonStoreInfo[i] + "}", CatsInfo.class));
                } else {
                    catInfo.add(gson.fromJson(jsonStoreInfo[i], CatsInfo.class));
                }
            }

            System.out.println("Data successfully uploaded");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return catInfo;
    }

    public static void showCatList(ArrayList<CatsInfo> catInfo) throws IOException, FileNotFoundException {
        FileReader stadiumRead = null;
        String dataLine;
        int counter = 0;
        File file = new File("CatInfo.json");
        stadiumRead = new FileReader(file);
        BufferedReader BR = new BufferedReader(stadiumRead);
        while ((dataLine = BR.readLine()) != null) {
            counter++;
            System.out.println((counter) + ". " + dataLine);

        }

    }

    public static void modifyCat(ArrayList<CatsInfo> catInfo) throws IOException {

        System.out.println("===============================");
        System.out.println("        MODIFY CAT           ");
        System.out.println("===============================");
        showCatList(catInfo);

        Scanner scan = new Scanner(System.in);
        int catId;
        String catIdChange;
        String catNameChange;
        int catAgeChange;
        boolean retry=false;

        System.out.println("Select a cat: ");
        int option;
        option = scan.nextInt();

        System.out.println("Which cat do you want to modify?: ");
        catId = (option - 1);

        if (catInfo.size() > catId) {
            int optionMenu = 0;
            while (optionMenu != 4) {
                System.out.println("What attribute do you want to modify?");
                System.out.println("1. cat Id");
                System.out.println("2. cat Name");
                System.out.println("3. cat Age");
                System.out.println("4. Return");
                System.out.println("Write the option:");
                optionMenu = scan.nextInt();
                scan.nextLine();

                switch (optionMenu) {

                    case 1:
                        System.out.print("type the new cat Id: ");
                        catIdChange = scan.nextLine();
                        try {
                            catInfo.get(catId).setId(catIdChange);
                            System.out.println("The cat was update successfully");
                            FileManager.saveData(catInfo);
                        } catch (Exception e) {
                            System.out.println("The cat was not update");
                        }
                        break;

                    case 2:
                        System.out.print("type the new cat name: ");
                        catNameChange = scan.nextLine();
                        try {
                            catInfo.get(catId).setCatName(catNameChange);
                            System.out.println("The cat was update successfully");
                            FileManager.saveData(catInfo);
                        } catch (Exception e) {
                            System.out.println("The cat was not update");
                        }
                        break;

                    case 3:
                        System.out.print("type the new cat Age: ");
                        catAgeChange = scan.nextInt();
                        try {
                            catAgeChange = HelperAge.validAge(catAgeChange, scan);
                        } catch (CustomException exc) {
                            exc.printStackTrace();
                            retry=true;
                        }
                        while(retry==true){
                            System.out.print("Please: re-enter the new cat Age: ");
                            catAgeChange = scan.nextInt();
                        try {
                            catAgeChange = HelperAge.validAge(catAgeChange, scan);
                            retry=false;
                        } catch (CustomException exc) {
                            exc.printStackTrace();
                            retry=true;
                        }
                        }
                        
                        try {
                            catInfo.get(catId).setAge(catAgeChange);

                            System.out.println("The cat was update successfully");
                            FileManager.saveData(catInfo);
                        } catch (Exception e) {
                            System.out.println("The cat was not updated");
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
        } else {
            System.out.println("error");
        }

    }

    public static void searchCatInfo(ArrayList<CatsInfo> catInfo, Scanner input) throws IOException {
        int catIdFinder;
        int found = 0;
        System.out.println("===============================");
        System.out.println("        SEARCH CAT            ");
        System.out.println("===============================");
        if (!catInfo.isEmpty()) {
            System.out.println("What is the cat id?");
            catIdFinder = input.nextInt();
            String catIdNumber = String.valueOf(catIdFinder);
            FileReader catRead = null;
            String dataLine;
            File file = new File("CatInfo.json");
            catRead = new FileReader(file);
            BufferedReader BR = new BufferedReader(catRead);
            while ((dataLine = BR.readLine()) != null) {
                if (dataLine.contains(catIdNumber) == true) {
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

    public static void removeCat(ArrayList<CatsInfo> catInfo, Scanner scan) throws IOException {
        System.out.println("===============================");
        System.out.println("         REMOVER CAT         ");
        System.out.println("===============================");
        showCatList(catInfo);
        int catNumberRemover;
        System.out.println("Which cat do you want to remove?: ");
        catNumberRemover = scan.nextInt();
        catNumberRemover--;
        try {
            catInfo.remove(catNumberRemover);
            System.out.println("The cat was remove successfully");
            FileManager.saveData(catInfo);
        } catch (Exception e) {
            System.out.println("The cat was not remove");
        }
    }
}
