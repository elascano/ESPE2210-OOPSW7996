
package ec.edu.espe.PrinterRegistration.controller;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.PrinterRegistration.model.Printer;
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
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class FileManager {
    
       public static ArrayList<Printer> read(ArrayList<Printer> printers, String fileName) {
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<Printer>> type = new TypeToken<ArrayList<Printer>>() {
                };
                printers = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("!Creating file!");
        } catch (IOException ex) {
            System.out.println("!There is nothing to read!");
        }
        return printers;
    }
       
       public static void addprinter(ArrayList<Printer> printers,Scanner scan, String fileName) {
        Printer printer = new Printer();
        
        System.out.println("================================");
        System.out.println("          ADD PRINTER");
        System.out.println("===============================");
        System.out.println("Enter Id");
        printer.setId(scan.nextInt());
        System.out.println("Enter Brand");
        printer.setBrand(scan.next());
        System.out.println("Enter Type ");
        printer.setType(scan.next());
        printers.add(printer);
        
        Gson gson = new Gson();
        String json = gson.toJson(printers);

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(json);
            writer.close();
            System.out.println("---Printer added successfully---");

        } catch (FileNotFoundException e) {
            System.out.println("!!ERROR");
        } catch (IOException e) {
            System.out.println();
        }
    }
        public static void readPrinters(ArrayList<Printer> printers) {
        
        Printer printer = new Printer();
        for (int i = 0; i < printers.size(); i++) {
            printer = printers.get(i);
            int id = printer.getId();
            String brand = printer.getBrand();
            String type = printer.getType();
            System.out.println("===========================");
            System.out.println("         PRINTER");
            System.out.println("ID\t" + id);
            System.out.println("BRAND\t" + brand);
            System.out.println("TYPE\t" + type);

        }
        }
        
        public static void deletAllJson() {
        File file = new File("PrintersList.json");
        if (file.delete()) {
            System.out.println("-----The file has been successfully deleted----");
        } else {
            System.out.println("The file cannot be deleted");
        }
    }

   

    public static void update(ArrayList<Printer> printers, Scanner scan) {
        int Search;

        try {
            System.out.println("Insert Id");
            Search = scan.nextInt();

            int printersPosition = find(printers, Search);

            if (printersPosition != -1) {
                Printer printer;
                int id;
                String brand;
                String type;

                Printer printerUpdate = new Printer();
                printerUpdate = printers.get(printersPosition);

                System.out.println("===========================");
                System.out.println("         PRINTER");
                System.out.println("===========================");

                printLine(printerUpdate);
                System.out.println("---------------------------");
                scan.nextLine();

                System.out.print(" Enter Brand\t");
                brand = scan.nextLine();

                System.out.print(" Enter Type\t");
                type = scan.next();
                System.out.println("==========successful update============");
                printerUpdate.setBrand(brand);
                printerUpdate.setType(type);

                Gson gson = new Gson();
                String json = gson.toJson(printers);

                try {
                    FileWriter writer = new FileWriter("PrintersList.json");
                    writer.write(json);
                    writer.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace(System.out);
                } catch (IOException e) {
                    e.printStackTrace(System.out);
                }

            } else {
                System.out.println("!!!Not found enter printer first!!!");
            }
        } catch (Exception e) {
            System.out.println("ERROR!!");
        }
    }

    public static void printLine(Printer printer) {
        int id = printer.getId();
        String brand = printer.getBrand();
        String type = printer.getType();
        System.out.println("ID\t" + id);
        System.out.println("BRAND\t" + brand);
        System.out.println("TYPE\t" + type);
    }

    public static int find(ArrayList<Printer> printers, int id) {
        Printer printer = new Printer();

        for (int i = 0; i < printers.size(); i++) {
            printer = printers.get(i);
            if (id == printer.getId()) {
                return i;
            }
        }
        return -1;
    }

    public static void deletePrint(ArrayList<Printer> printers, Scanner scan) {
        int search;

        try {
            System.out.print("Insert Id printer: ");
            search = scan.nextInt();

            int printerPosition = find(printers, search);

            if (printerPosition != -1) {

                printers.remove(printerPosition);
                System.out.println("----Printer deleted successfully------- ");

                Gson gson = new Gson();
                String json = gson.toJson(printers);

                try {
                    FileWriter writer = new FileWriter("PrintersList.json");
                    writer.write(json);
                    writer.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace(System.out);
                } catch (IOException e) {
                    e.printStackTrace(System.out);
                }

            } else {
                System.out.println(" First enter data ");
            }

        } catch (Exception e) {
            System.out.println("!!ERROR!!");
        }
     
}}