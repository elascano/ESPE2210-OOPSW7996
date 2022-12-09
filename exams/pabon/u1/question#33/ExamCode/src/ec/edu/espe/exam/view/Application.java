
package ec.edu.espe.exam.view;

import com.google.gson.Gson;
import ec.edu.espe.exam.model.Scissors;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class Application {

    public static void main(String[] args) {
        int option = 0;

        Scanner scan;
        Scissors scissor;
        ArrayList<Scissors> scissors;

        scan = new Scanner(System.in);     
        scissors = Json();

        while (option != 2) {
            System.out.println("         \nM E N U          ");
            System.out.println("==========================");
            System.out.println("|     1. Add Scissor     |");
            System.out.println("|     2. Exit            |");
            System.out.println("==========================");

            System.out.println("\nPlease, choose an option: ");
            try {
                option = scan.nextInt();
            } catch (Exception e) {
                option = 0;
            }
            scan.nextLine();
            Collections.sort(scissors);

            switch (option) {
                case 1:
                    scissor = addScissor();
                    if (scissor != null) {
                        scissors.add(scissor);
                        Collections.sort(scissors);  
                        fileJson(scissors);
                        }
                break;    
              
                case 2:
                break;                    
               }
            }
         }

    private static Scissors addScissor() {
        Scissors newScissor = new Scissors();
        int id;
        int size;
        String brand;
        String color;

        Scanner sc = new Scanner(System.in);

            System.out.println("- Type Scissor Brand: ");
            brand = sc.nextLine();
            System.out.println("- Type Scissor ID: ");
            id = sc.nextInt();
            System.out.println("- Type Scissor size (cm): ");
            size = sc.nextInt();
            sc.nextLine();
            System.out.println("- Type Scissor color: ");
            color = sc.nextLine();

            newScissor.setId(id);
            newScissor.setBrand(brand);
            newScissor.setSize(size);
            newScissor.setColor(color);
        return newScissor;
    }
    
    private static ArrayList<Scissors> Json() {
        Gson gson = new Gson();        
        ArrayList<Scissors> scissors = new ArrayList<>();
        String fileJson = "";
        String[] scissorsJson;
        
        try ( Scanner scanFile = new Scanner(new File("./scissors.json"))) {
            while (scanFile.hasNextLine()) {
                fileJson += scanFile.nextLine();
            }
            
            fileJson = fileJson.replace("[","");
            fileJson = fileJson.replace("]","");
            scissorsJson = fileJson.split("},");
            
            for (int i = 0; i < scissorsJson.length; i++) {
                if (i < scissorsJson.length - 1) {
                    scissors.add(gson.fromJson(scissorsJson[i] + "}", Scissors.class));
                } else {
                    scissors.add(gson.fromJson(scissorsJson[i], Scissors.class));
                }
            }  
            Collections.sort(scissors);
        } catch (Exception e) {
          System.out.println(e);
        }
        return scissors;
    }
    
    private static void fileJson(ArrayList<Scissors> scissors) {
        Gson gson = new Gson();
        String json = gson.toJson(scissors);
        
        File file = new File("./scissors.json");
        try ( FileWriter fw = new FileWriter(file);) {            
            fw.write(json);   
            
            System.out.println("\n==Saved successfully==");
        } catch (Exception e) {
        } 
    }
}
