
package ec.edu.espe.ForkProducer.controller;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import ec.edu.espe.ForkProducer.model.Fork;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class FileManager {

    public static boolean openFile(boolean confirmation) {
        File file = new File("ForkData.json");
        if (file.exists()) {

            confirmation = (true);

        }
        System.out.println("File creation -->" + confirmation);

        return confirmation;
    }

    public static void saveJson(String json, ArrayList<Fork> forks) {

        Gson gson = new Gson();
        json = gson.toJson(forks);

        try ( FileWriter file = new FileWriter("ForkData.json")) {

            file.write(json);
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readJson(ArrayList<Fork> forks, String json) {

        Gson gson = new Gson();
        json = gson.toJson(forks);

        System.out.println("Gson-->" + json);

    }

    public static void deleteForks(ArrayList<Fork> forks, Fork fork, String json,Scanner sc) {
        Gson gson = new Gson();
        System.out.print("Enter the forks id to delete: ");
        int match = sc.nextInt();
        
        for (int i = 0; i < forks.size(); i++)
        {
            if (match == forks.get(i).getId())
            {
             forks.remove(i);   
            }
        }
        
        json = gson.toJson(forks);
        try ( FileWriter file = new FileWriter("ForkData.json")) {

            file.write(json);
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("||Deleteted information||");
    }
    
    public static void updateJson(ArrayList<Fork> forks, Fork fork, String json,Scanner sc) {
        
        Gson gson = new Gson();
        boolean idNotFound = true;
        
        System.out.print("Enter the forks id to update: ");
        int match = sc.nextInt();
        
        for (int i = 0; i < forks.size(); i++)
        {
            if (match == forks.get(i).getId())
            {
                changeInfo(forks, i, sc);
                idNotFound = false;
            }
        }
        
        if(idNotFound){
            System.out.println("ID not found");
        }
        
        json = gson.toJson(forks);
        try ( FileWriter file = new FileWriter("ForkData.json")) {

            file.write(json);
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("||The information changed||");
        
    }
    
    private static void changeInfo(ArrayList<Fork> flashDrives, int position,Scanner sc) {

        System.out.print("Enter the new fork material:");
        flashDrives.get(position).setMaterialFork(sc.next());
        System.out.print("Enter the new fork color:");
        flashDrives.get(position).setColorFork(sc.next());
        System.out.print("Enter the new number of forks:");
        flashDrives.get(position).setAmountFork(sc.nextInt());
        
    }

}
