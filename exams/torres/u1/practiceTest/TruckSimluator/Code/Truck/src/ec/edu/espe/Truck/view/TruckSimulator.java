
package ec.edu.espe.Truck.view;


import java.util.Scanner;
import ec.edu.espe.Truck.model.Truck;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class TruckSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        System.out.println("||       UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE       ||");
        System.out.println("              Carlos Alexander Torres");
        System.out.println("             Instructor: Edison Lascano");
        System.out.println("=========================================================");
        System.out.println("||           ¡WELCOME TO TRUCK SIMULATOR :)!       ||");
        
        
        Scanner scan = new Scanner(System.in);
        File file = new File("./FileOfTruck.json");
        
        truck = new Truck();
                    
        scanTruck(scan, truck);
        writeTruck(scan, file);
        printTruck(truck);
        
    }
    
     private static void scanTruck(Scanner scan, Truck truck) {
        int id;
        String brand;
        String color;
       
        System.out.println("Please complete the following information about the chicken");
        System.out.println("Truck id: ");
        try {
            id = scan.nextInt();
            truck.setId(id);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Wrong data type, please enter only integers");
            scan.nextLine();
        }

        System.out.println("truck name:");
        brand = scan.next();
        truck.setName(brand);


        System.out.println("Chicken color: ");
        color = scan.next();
        truck.setColor(color);

       

    }

    private static void printTruck(Truck truck) {
        //Print/ get values
        System.out.println("\n            ||==================================");
        System.out.println("            ||\n            ||    Truck data "+ truck.getId());
        System.out.println("            ||\n            ||----------------------------------");
        System.out.println("            ||    chicken id -->" + truck.getId());
        System.out.println("            ||    chicken name -->" + truck.getName());
        System.out.println("            ||    chicken age -->" + truck.getAge());
        System.out.println("            ||    chicken color -->" + truck.getColor());
        System.out.println("            ||    chicken is molting -->" + truck.isIsMolting());
        System.out.println("            ||===================================\n\n");
    }
    
    
    
    private static void writeTruck(Scanner scan, File file) {
        try {
            ArrayList<Truck> newTruckData = newTruck(scan);

            if (!newTruckData.isEmpty()) {
                Scanner scanFile = new Scanner(file);

                try ( FileWriter fileWriter = new FileWriter("./FileOfTruck.json");) {
                    Gson gson = new Gson();
                    String json;
                    for (Truck truck : newTruckData) {
                        json = gson.toJson(truck);
                        fileWriter.write(json + "\n");
                    }
                    System.out.println("=========================================================");
                    System.out.println("   COOL!!The truck has been registered successfully");
                    System.out.println("=========================================================");

                } catch (Exception error) {
                    System.err.println("     The file has not been written to the database");
                }
            } else {
                System.out.println("");
                System.err.println("            truck not registered in the file");
            }
        } catch (FileNotFoundException error) {
            System.err.println("            Oops, Error: file not found");
        }
    }
}
