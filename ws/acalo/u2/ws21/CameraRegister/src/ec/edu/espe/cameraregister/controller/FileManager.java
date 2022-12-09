/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.cameraregister.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.cameraregister.model.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
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
            System.out.println("\n*** THE FILE FOR THE APLICATION DOESN'T EXIST, IT WILL BE CREATED ***\n");
        } catch (IOException ex) {
            System.out.println("*** THE FILE CAN'T BE READED ***");
        }
        return cameras;
    }

    public static void create(ArrayList<Camera> cameras, String fileName) {
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

    public static int find(ArrayList<Camera> cameras, int id) {
        Camera camera = new Camera();

        for (int i = 0; i < cameras.size(); i++) {
            camera = cameras.get(i);
            if (id == camera.getId()) {
                return i;
            }
        }
        return -1;
    }

    public static void deleteOneCamera(ArrayList<Camera> cameras) {
        int idToSearch;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("..:: Insert the id of the Camera to delete: ");
            idToSearch = sc.nextInt();

            int cameraFoundPosition = find(cameras, idToSearch);

            if (cameraFoundPosition != -1) {

                cameras.remove(cameraFoundPosition);
                create(cameras, "Cameras.json");
                System.out.println("\n\n*** CAMERA DELETED SUCCESSFULLY ***\n");

            } else {
                System.out.println("..:: THE ID ENTERED DOESN'T EXIST ::..");
            }

        } catch (Exception e) {
            System.out.println("..:: THE CAMERA DIDN'T CAN BE DELETED ::..");
        }
    }

    public static void update(ArrayList<Camera> cameras) {
        Scanner sc = new Scanner(System.in);
        int idToSearch;

        try {
            System.out.print("..:: Insert the id of the Camera to update: ");
            idToSearch = sc.nextInt();

            int cameraFoundPosition = find(cameras, idToSearch);

            if (cameraFoundPosition != -1) {
                Camera camera;
                int id;
                String model;
                float mPixeles;

                Camera cameraToUpdate = new Camera();
                cameraToUpdate = cameras.get(cameraFoundPosition);

                System.out.println("***********************************************");
                System.out.println("*                  ACTUAL DATA                 *");
                System.out.println("************************************************");
                System.out.println("ID\t|MODEL\t|MEGAPIXELES|");
                printLine(cameraToUpdate);
                System.out.println("************************************************");

                System.out.println("\n************************************************");
                System.out.println("*");
                sc.nextLine();
                System.out.print("* ..:: Enter the new model of the Camera: ");
                model = sc.nextLine();

                System.out.print("* ..:: Enter the current megapixeles of Camera: ");
                mPixeles = sc.nextFloat();

                cameraToUpdate.setModel(model);
                cameraToUpdate.setMegapixeles(mPixeles);

                System.out.println("*");
                System.out.println("************************************************");
                create(cameras, "Cameras.json");
                System.out.println("\n\n*** CAMERA UPDATED SUCCESSFULLY ***\n");
            } else {
                System.out.println("..:: THE ID ENTERED DOESN'T EXIST ::..");
            }

        } catch (Exception e) {
            System.out.println("..:: THE CAMERA DIDN'T CAN BE UPDATED ::..");
        }
    }

    public static void printList(ArrayList<Camera> cameras) {
        Camera camera = new Camera();
        System.out.println("\nID\t|MODEL\t|MEGAPIXELES|");
        for (int i = 0; i < cameras.size(); i++) {
            camera = cameras.get(i);
            printLine(camera);
        }
    }

    public static void printLine(Camera camera) {
        int id = camera.getId();
        String model = camera.getModel();
        float mPixeles = camera.getMegapixeles();
        System.out.println(id + "\t|" + model + "\t|" + mPixeles + "\t|");

    }

    public static void deleteAllCameras(String fileName) {

        Scanner sc = new Scanner(System.in);
        String confirmation;
        try {
            System.out.print("..:: ¿Are you sure that you wanna delete ALL the data? (yes/no): ");
            confirmation = sc.nextLine();

            if (confirmation.equals("yes")) {

                File file = new File(fileName);
                if (file.delete()) {
                    System.out.println("..:: THE DATA HAS BEEN DELETED ::..");
                } else {
                    System.out.println("..:: THE DATA CAN'T BE DELETED ::..");
                }

            } else {
                System.out.println("..:: Thanks for thinking better :D ::..");
            }
        } catch (Exception e) {
            System.out.println("..:: ERROR TO DELETE THE DATA ::..");
        }
    }
}
