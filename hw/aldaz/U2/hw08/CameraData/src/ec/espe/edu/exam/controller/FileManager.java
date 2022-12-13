/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.exam.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exam.model.Camera;
import java.io.*;
import java.util.*;

/**
 *
 * @author , Scriptal, DCCO-ESPE
 */
public class FileManager {

    public static ArrayList<Camera> read(ArrayList<Camera> cameras, String fileName) {
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<Camera>> type = new TypeToken<ArrayList<Camera>>() {
                };
                cameras = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("THE FILE DOESN'T EXIST, IT WILL BE CREATED");
        } catch (IOException ex) {
            System.out.println("THE FILE CAN'T BE READED");
        }
        return cameras;
    }


    public static void save(ArrayList<Camera> cameras, String fileName) {
        Gson gson = new Gson();
        String json = gson.toJson(cameras);

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

    public static int find(ArrayList<Camera> cameras, int id, String fileName) {

        Camera cameraIterated = new Camera();

        for (int i = 0; i < cameras.size(); i++) {
            cameraIterated = cameras.get(i);
            if (id == cameraIterated.getId()) {
                return i;
            }
        }
        return -1;
    }

    public static void delete(ArrayList<Camera> cameras, int position) {
        try {
            cameras.remove(position);
        } catch (Exception e) {
            System.out.println("THE CAMERA CAN'T BE DELETED");
        }
    }

    public static void update(ArrayList<Camera> cameras, int position) {
        try {

            Scanner sc = new Scanner(System.in);
            Camera camera;
            int id;
            String model;
            String flashlight;
            
            Camera cameraToUpdate = new Camera();
            cameraToUpdate = cameras.get(position);

            
            System.out.println("ACTUAL DATA");
            
            System.out.println("ID\t|MODEL\t\t|FLASHLIGHT\t\t|");
            printLine(cameraToUpdate);
            
            System.out.print("Enter the model of the camera: ");
            model = sc.nextLine();

            System.out.print("Enter yes or not if your camera has flashlight: ");
            flashlight = sc.nextLine();
            
            cameraToUpdate.setModel(model);
            cameraToUpdate.setFlashlight(flashlight);
            
        }catch (Exception e) {
            System.out.println("THE CAMERA DATA CAN'T BE UPDATED");
        }
    }
    
    public static void printList(ArrayList<Camera> cameras) {
        Camera cameraIterated = new Camera();

        for (int i = 0; i < cameras.size(); i++) {
            cameraIterated = cameras.get(i);
            printLine(cameraIterated);
        }
    }
    
    public static void printLine(Camera camera) {
        int id = camera.getId();
        String model = camera.getModel();
        String flashlight = camera.getFlashlight();
        System.out.println(id + "\t|" + model + "\t|" + flashlight + "\t|");

    }
    
    public static void addCamera(ArrayList<Camera> cameras) {

        Scanner sc = new Scanner(System.in);
        Camera camera;
        int id;
        String model;
        String flashlight;

            System.out.print("Enter the id of the Camera: ");
            id = sc.nextInt();
            while (validateIdExistance(id)) {
                System.out.print("The id already exists. Please put another info: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Enter the model of your camera: ");
            model = sc.nextLine();

            System.out.print("Enter yes or no if your camera has flashlight: ");
            flashlight = sc.nextLine();

            camera = new Camera(id, model, flashlight);
            
            cameras.add(camera);
        
    }

    public static boolean validateIdExistance(int id) {
        ArrayList<Camera> cameras = new ArrayList<>();
        cameras = read(cameras, "Cameras.json");
        Camera camera = new Camera();

        for (int i = 0; i < cameras.size(); i++) {
            camera = cameras.get(i);
            if (id == camera.getId()) {
                return true;
            }
        }
        return false;

    }

}
