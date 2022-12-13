/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.mouseData.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.mouseData.model.Mouse;
import ec.edu.espe.mouseData.utils.IdNotFoundException;
import java.io.*;
import java.util.*;

/**
 *
 * @author , Scriptal, DCCO-ESPE
 */
public class FileManager {

    public static ArrayList<Mouse> read(ArrayList<Mouse> mice, String fileName) {
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<Mouse>> type = new TypeToken<ArrayList<Mouse>>() {
                };
                mice = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("THE FILE DOESN'T EXIST, IT WILL BE CREATED");
        } catch (IOException ex) {
            System.out.println("THE FILE CAN'T BE READED");
        }
        return mice;
    }


    public static void save(ArrayList<Mouse> mice, String fileName) {
        Gson gson = new Gson();
        String json = gson.toJson(mice);

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static int find(ArrayList<Mouse> mice, int id) throws IdNotFoundException {
        Mouse mouse = new Mouse();

        for (int i = 0; i < mice.size(); i++) {
            mouse = mice.get(i);
            if (id == mouse.getId()) {
                return i;
            }
        }
        throw new IdNotFoundException("THE ID NUMBER: {" + id + "} IT'S NOT EXISTANT IN OUR DATA, PLEASE SELECT OTHER :C");
    }
    
    public static int find(ArrayList<Mouse> mice, int id, String fileName) {

        Mouse mouseIterated = new Mouse();

        for (int i = 0; i < mice.size(); i++) {
            mouseIterated = mice.get(i);
            if (id == mouseIterated.getId()) {
                return i;
            }
        }
        return -1;
    }

    public static void delete(ArrayList<Mouse> mice, int position) {
        try {
            mice.remove(position);
        } catch (Exception e) {
            System.out.println("THE MOUSE CAN'T BE DELETED");
        }
    }

    public static void update(ArrayList<Mouse> mice, int position) {
        try {

            Scanner sc = new Scanner(System.in);
            Mouse mouse;
            int id;
            String name;
            String type;
            
            Mouse mouseToUpdate = new Mouse();
            mouseToUpdate = mice.get(position);

            
            System.out.println("ACTUAL DATA");
            
            System.out.println("ID\t|NAME\t\t|TYPE\t\t|");
            printLine(mouseToUpdate);
            
            System.out.print("Enter the name of the mouse: ");
            name = sc.nextLine();

            System.out.print("Enter the type of mouse: ");
            type = sc.nextLine();
            
            mouseToUpdate.setName(name);
            mouseToUpdate.setType(type);
            
        }catch (Exception e) {
            System.out.println("THE MOUSE DATA CAN'T BE UPDATED");
        }
    }
    
    public static void printList(ArrayList<Mouse> mice) {
        Mouse mouseIterated = new Mouse();

        for (int i = 0; i < mice.size(); i++) {
            mouseIterated = mice.get(i);
            printLine(mouseIterated);
        }
    }
    
    public static void printLine(Mouse mouse) {
        int id = mouse.getId();
        String name = mouse.getName();
        String type = mouse.getType();
        System.out.println(id + "\t|" + name + "\t|" + type + "\t|");

    }
    
    public static void addMouse(ArrayList<Mouse> mice) {

        Scanner sc = new Scanner(System.in);
        Mouse mouse;
        int id;
        String name;
        String type;

            System.out.print("Enter the id of the Mouse: ");
            id = sc.nextInt();
            while (validateIdExistance(id)) {
                System.out.print("The id already exists. Please put another info: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Enter the name of the Mouse: ");
            name = sc.nextLine();

            System.out.print("Enter the type of Mouse: ");
            type = sc.nextLine();

            mouse = new Mouse(id, name, type);
            
            mice.add(mouse);
        
    }

    public static boolean validateIdExistance(int id) {
        ArrayList<Mouse> mice = new ArrayList<>();
        mice = read(mice, "Mice.json");
        Mouse mouse = new Mouse();

        for (int i = 0; i < mice.size(); i++) {
            mouse = mice.get(i);
            if (id == mouse.getId()) {
                return true;
            }
        }
        return false;

    }

}
