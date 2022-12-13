package excercise.pkg28.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import excercise.pkg28.model.Printer;
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
    public static void saveJsonFile(ArrayList<Printer> printer, String nameFile) {
        Scanner scan = new Scanner(System.in);
        String jsonStructure = new Gson().toJson(printer);
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
    
    public static void enterPrinterData(Scanner scan, ArrayList<Printer> printer) {
        String name;
        int id;
        String numberOfId;
        String type;
        Printer printerInfo = new Printer();
        System.out.println("====================================");
        System.out.println("          ENTER PRINT DATA          ");
        System.out.println("====================================");

        System.out.println("====================================");
        System.out.println("Enter the name: ");
        name = scan.nextLine();
        printerInfo.setName(name);
        System.out.println("");
        System.out.println("====================================");

        System.out.println("====================================");
        System.out.println("Enter the type of the printer: ");
        type = scan.nextLine();
        printerInfo.setType(type);
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
        
        printerInfo.setId(id);
        
        printer.add(printerInfo);
    }
    
    public static void createJsonFile(Scanner scan, ArrayList<Printer> printer) {
        String fileName;
        int enter = 0;
        System.out.println(">>Ingress the name of the file you want to create: ");
        fileName = scan.next();
        do {
            enterPrinterData(scan, printer);
            saveJsonFile(printer, fileName);
        } while (enter == 1);
    }
    
    public static ArrayList<Printer> openJsonFile(ArrayList<Printer> printer, String nameFile) {
        Gson gson = new Gson();
        Scanner scan = new Scanner(System.in);


        try
        {
            Reader readFile = Files.newBufferedReader(Paths.get(nameFile + ".json"));
            TypeToken<ArrayList<Printer>> type = new TypeToken<ArrayList<Printer>>() {};
            printer = gson.fromJson(readFile, type.getType());
            readFile.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println(">>ERORR!! file not Found");
        } catch (IOException ex)
        {
            System.out.println(">>JSON file is empty");
        }
        return printer;
    }
    
    public static void readPrinter(Printer printer) {
        System.out.println(">>Printer NAME ==>" + printer.getName());
        System.out.println(">>Printer TYPE ==>" + printer.getType());
        System.out.println(">>Printer ID ==>" + printer.getId());
    }

    public static int searchPrinter(Scanner scan, ArrayList<Printer> printer) {
        int id;
        int x = -1;
        Printer printerInfo;
        System.out.println(">>Ingress the ID of the printer: ");
        id = scan.nextInt();
        for (int i = 0; i < printer.size(); i++) {
            printerInfo = printer.get(i);
            if (id == printerInfo.getId()) {
                x = i;
                readPrinter(printerInfo);
            }
        }

        if (x == -1) {
            System.out.println(">>No Id recognized");
        }

        return x;
    }

    public static void updatePrinter(int box, ArrayList<Printer> printer, String nameFile){
        String name;
        int id;
        String numberOfId;
        String type;
        Printer printerInfo = new Printer();
        Scanner scan = new Scanner(System.in);
        printerInfo = printer.get(box);
        System.out.println("====================================");
        System.out.println("          ENTER PRINT DATA          ");
        System.out.println("====================================");

        System.out.println("====================================");
        System.out.println("Enter the name: ");
        name = scan.nextLine();
        printerInfo.setName(name);
        System.out.println("");
        System.out.println("====================================");

        System.out.println("====================================");
        System.out.println("Enter the type of the printer: ");
        type = scan.nextLine();
        printerInfo.setType(type);
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
            System.out.println(">>The number is must to be 10 numbers.");
            
            System.out.println("====================================");
            System.out.println("Enter the id: ");
            numberOfId = scan.nextLine();
            scan.nextLine();
            System.out.println("====================================");
        }

        id = Integer.parseInt(numberOfId);
        
        printerInfo.setId(id);
        
        saveJsonFile(printer, nameFile);
    }

    public static void printPrinter(ArrayList<Printer> printer){
        Printer printerInfo = new Printer();
        for (int i = 0; i < printer.size(); i++) {
            printerInfo = printer.get(i);
            readPrinter(printerInfo);
        }
    }

    public static void deletePrinter(ArrayList<Printer> printer, String nameFile){
        int box = -1;
        Scanner scan = new Scanner(System.in);
        box = searchPrinter(scan, printer);
        if (box > -1) {
            printer.remove(box);
            System.out.println(">>Data deleted succesfully.");
        }
        saveJsonFile(printer, nameFile);

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
