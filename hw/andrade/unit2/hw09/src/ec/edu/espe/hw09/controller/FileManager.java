
package ec.edu.espe.hw09.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.hw09.exeptions.*;
import ec.edu.espe.hw09.model.FlashDrive;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class FileManager {
    
    private static final Scanner sc = new Scanner(System.in);
    
    public static void deleteAllData(){
        File fileJson = new File("FlashDriveList.json");

        try
        {
            System.out.println("Are you sure?\n1. Yes\n2. No");
            int answer = sc.nextInt();
            while(answer < 1 || answer > 2){
                System.out.println("Incorrect value, enter again");
                answer = sc.nextInt();
            }
            
            if(answer == 1){
                FileWriter writer = new FileWriter(fileJson);
                writer.write("[]");
                writer.close();
                System.out.println("Data has been deleted");
            } else {
                System.out.println("Good decision");
            }
            
        } catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
        } catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
    }
    
    public static void editJson(ArrayList<FlashDrive> flashDrives) {
        File fileJson = new File("FlashDriveList.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(flashDrives);

        try(FileWriter writer = new FileWriter(fileJson))
        {            
            writer.write(json);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
        } catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
    }

    public static ArrayList<FlashDrive> readJson(ArrayList<FlashDrive> flashDrives) {
        Gson gson = new Gson();

        try
        {
            Reader reader = Files.newBufferedReader(Paths.get("FlashDriveList.json"));
            TypeToken<ArrayList<FlashDrive>> type = new TypeToken<ArrayList<FlashDrive>>() {};
            flashDrives = gson.fromJson(reader, type.getType());
            reader.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("File not Found");
        } catch (IOException ex)
        {
            System.out.println("Empty File");
        }
        return flashDrives;
    }

    public static void enterNewFlashDrive(ArrayList<FlashDrive> flashDrives) throws CustomEx{
        FlashDrive flashDrive = new FlashDrive();

        System.out.println("Enter the flash drive id");
        flashDrive.setId(sc.nextInt());
        if(flashDrive.getId() < 0){
            throw new CustomEx(" The id must not be negative");
        }
        
        sc.nextLine();
        System.out.println("Enter the flash drive name");
        flashDrive.setName(sc.nextLine());
        
        System.out.println("Enter the size");
        flashDrive.setSize(sc.nextInt());
        if(flashDrive.getSize() < 0){
            throw new CustomEx(" The size must not be negative");
        }
        
        flashDrives.add(flashDrive);
    }

    public static void deleteOneFlashDrive() {
        ArrayList<FlashDrive> flashDrives = new ArrayList<>();
        boolean idNotFound = true;
        
        flashDrives = readJson(flashDrives);
        System.out.print("Enter the flash drive's id to delete: ");
        int match = sc.nextInt();
        
        for (int i = 0; i < flashDrives.size(); i++)
        {
            
            if (match == flashDrives.get(i).getId())
            {
                flashDrives.remove(i);
                editJson(flashDrives);
                idNotFound = false;
                System.out.println("Flash drive data has been deleted");
            }
        }
        
        if(idNotFound){
            System.out.println("ID not found");
        }
        
    }

    public static void updateData() {
        ArrayList<FlashDrive> flashDrives = new ArrayList<>();
        boolean idNotFound = true;
        
        flashDrives = readJson(flashDrives);
        System.out.print("Enter the flash drive's id to update: ");
        int match = sc.nextInt();
        
        for (int i = 0; i < flashDrives.size(); i++)
        {
            if (match == flashDrives.get(i).getId())
            {
                changeInfo(flashDrives, i);
                idNotFound = false;
            }
        }
        
        if(idNotFound){
            System.out.println("ID not found");
        }
        
    }

    public static void printFlashDrive(FlashDrive flashDrive) {
        
        System.out.println("");
        System.out.println("id : " + flashDrive.getId());
        System.out.println("name : " + flashDrive.getName());
        System.out.println("size : " + flashDrive.getSize());
    }

    public static void printOneFlashDrive() {
        ArrayList<FlashDrive> flashDrives = new ArrayList<>();
        boolean idNotFound = true;
        
        flashDrives = readJson(flashDrives);
        System.out.print("Enter the flash drive's id: ");
        int match = sc.nextInt();
        
        for (int i = 0; i < flashDrives.size(); i++)
        {
            if (match == flashDrives.get(i).getId() && match != 0)
            {
                printFlashDrive(flashDrives.get(i));
                idNotFound = false;
            }
        }
        
        if(idNotFound){
            System.out.println("ID not found");
        }
    }

    public static void printAllFlashDrives() {
        ArrayList<FlashDrive> flashDrives = new ArrayList<>();
        FlashDrive flashDrive = new FlashDrive();
        flashDrives = readJson(flashDrives);        
        boolean flashDriveExist = true;
        
        if(flashDrives.isEmpty()){
            System.out.println("There are no flash drives");
            flashDriveExist = false;
        }
        
        if (flashDriveExist)
        {
            System.out.println("|\tID\t|\tName\t|\tSize\t|");
                    
            
            for (int i = 0; i < flashDrives.size(); i++)
            {
                flashDrive = flashDrives.get(i);
                System.out.println("|\t" + flashDrive.getId() + "\t|\t" + flashDrive.getName() + "\t|\t" + flashDrive.getSize() + "\t|\t");
            }
        }
    }

    private static void changeInfo(ArrayList<FlashDrive> flashDrives, int position) {

        System.out.println("Enter the new flash drive's id");
        flashDrives.get(position).setId(sc.nextInt());
        System.out.println("Enter the new flash drive's name");
        flashDrives.get(position).setName(sc.next());
        System.out.println("Enter the new size of flash drive");
        flashDrives.get(position).setSize(sc.nextInt());
        
        editJson(flashDrives);
        System.out.println("flash drive information changed");
    }
}