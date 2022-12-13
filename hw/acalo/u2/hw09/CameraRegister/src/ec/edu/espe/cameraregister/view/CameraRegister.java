/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.cameraregister.view;

import static ec.edu.espe.cameraregister.controller.FileManager.*;
import ec.edu.espe.cameraregister.utils.DataNotFoundException;
import ec.edu.espe.cameraregister.model.Camera;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class CameraRegister {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int option;
        Scanner sc = new Scanner(System.in);
        ArrayList<Camera> actualCamerasData = new ArrayList<>();
        String fileName = "Cameras.json";

        do {
            actualCamerasData = read(actualCamerasData, "Cameras.json");

            System.out.println("\n************************************************");
            System.out.println("*                                              *");
            System.out.println("*        Welcome to the CAMERA Register        *");
            System.out.println("*                                              *");
            System.out.println("************************************************");
            System.out.println("*\t\t1.Insert new Camera             *");
            System.out.println("*\t\t2.Find a Camera                 *");
            System.out.println("*\t\t3.Print Cameras                 *");
            System.out.println("*\t\t0.Exit                          *");
            System.out.println("************************************************");
            System.out.print("Select an option ======> ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    addCamera(actualCamerasData);
                    create(actualCamerasData, fileName);
                    System.out.println("\n\n*** CAMERA ADDED SUCCESSFULLY ***\n");
                }

                case 2 -> {
                    findOneCamera(actualCamerasData);
                }

                case 3 ->
                    printList(actualCamerasData);

                case 0 ->
                    System.out.println("*** YOU HAVE EXITED SUCCESSFULLY ***");

                default ->
                    System.out.println("*** INVALID OPTION ***");
            }
        } while (option != 0);
    }

    private static void findOneCamera(ArrayList<Camera> actualCamerasData) {
        int idToSearch;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("\n..:: Insert the id of the Camera to search: ");
            idToSearch = sc.nextInt();

            try {
                int cameraFoundPosition = find(actualCamerasData, idToSearch);
                System.out.println("\nID\t|MODEL\t|MEGAPIXELES|");
                printLine(actualCamerasData.get(cameraFoundPosition));
            } catch (DataNotFoundException ex) {
                System.out.println("Error: ");
                System.out.println(ex.getMessage());
            }

        } catch (Exception e) {
            System.out.println("..:: INCORRECT DATA, TRY AGAIN ::..");
        }
    }

    public static void addCamera(ArrayList<Camera> cameras) {

        Scanner sc = new Scanner(System.in);
        Camera camera;
        int id;
        String name;
        float type;

        try {
            System.out.println("\n************************************************");
            System.out.println("*");
            System.out.print("* ..:: Enter the id of the Camera: ");
            id = sc.nextInt();
            while (validateIdExistance(id)) {
                System.out.print("* ..:: The id already exists. Please enter again: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("* ..:: Enter the model of the Camera: ");
            name = sc.nextLine();

            System.out.print("* ..:: Enter the megapixeles of Camera: ");
            type = sc.nextFloat();

            camera = new Camera(id, name, type);
            System.out.println("*");
            System.out.println("************************************************");
            cameras.add(camera);
        } catch (Exception e) {
            System.out.println("*** INVALID DATA, PLEASE INSERT AGAIN ***");
        }
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
