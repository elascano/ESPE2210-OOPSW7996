package fashionstore.model;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class ClothModel {
    public static ArrayList main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        ArrayList modellist = new ArrayList();
        int numberclothmodel;
        String name, color, type;
        
        System.out.println("\t--Information About Cloth Model--"); 
        System.out.println("Number of the Cloth Model:");
        numberclothmodel = sc.nextInt();
        System.out.println("Name of the Cloth Model:");
        name = sc.next();
        System.out.println("Color of the Cloth Model:");
        color = sc.next();
        System.out.println("Type of the Cloth Model");
        type = sc.next();

        modellist.add("Number: " + numberclothmodel);
        modellist.add("Name: " + name); 
        modellist.add("Color: " + color); 
        modellist.add("Type: " + type);
        
        System.out.println(modellist);
        Gson gson = new Gson();
        String json = gson.toJson(modellist);
        File file = new File("clothmodel.json");
        try ( FileWriter fw = new FileWriter(file);) {            
            fw.write(json);   
            System.out.println(" ___________________________________ ");
            System.out.println("|             STATUS                |");
            System.out.println("| Information saved in a JSON file  |");
            System.out.println("|               :)                  |");
            System.out.println("|          Check the folder         |");
            System.out.println("|___________________________________|");
        } catch (Exception e){
            System.out.println(" ________________________________________");
            System.out.println("|             ¡ STATUS !                 |");
            System.out.println("|    Error the file is not saved         |");
            System.out.println("|                :(                      |");
            System.out.println("|              SOLUTION                  |");
            System.out.println("| Check the path where the file is saved |");
            System.out.println("|________________________________________|");

             }
        return modellist;
        }
    }
