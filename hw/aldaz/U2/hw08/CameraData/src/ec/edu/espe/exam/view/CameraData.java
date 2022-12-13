/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exam.model.Camera;
import static ec.espe.edu.exam.controller.FileManager.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author , Scriptal, DCCO-ESPE
 */
public class CameraData {

    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        ArrayList<Camera> actualCamerasData = new ArrayList<>();
        int idToSearch;

        do {
            actualCamerasData = read(actualCamerasData, "Cameras.json");

            System.out.println("------------------------------------------------");
            System.out.println("-                 Cameras Data                 -");
            System.out.println("------------------------------------------------");
            System.out.println("\t\t1.Insert a new camera             ");
            System.out.println("\t\t2.Find cameras                ");
            System.out.println("\t\t3.Delete a camera               ");
            System.out.println("\t\t4.Update cameras             ");
            System.out.println("\t\t5.Print cameras                ");
            System.out.println("\t\t6.Exit                          ");
            System.out.println("-----------------------------------------------");
            System.out.print("Select just one option ======> ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    addCamera(actualCamerasData);
                    save(actualCamerasData, "Cameras.json");
                    System.out.println("\n\nCAMERAS ADDED CORRECTLY\n");
                }

                case 2 -> {

                    System.out.print("Insert the id of the Camera to search: ");
                    idToSearch = sc.nextInt();
                    int cameraFound = find(actualCamerasData, idToSearch, "Cameras.json");
                    if (cameraFound != -1) {
                        System.out.println("\nID\t|MODEL\t\t|FLASHLIGHT\t\t|");
                        printLine(actualCamerasData.get(cameraFound));
                    } else {
                        System.out.println("THE ID ENTERED DOESN'T EXIST");
                    }
                }

                case 3 -> {

                    System.out.print("Insert the id of the Camera that you want to delete: ");
                    idToSearch = sc.nextInt();

                    int cameraFound = find(actualCamerasData, idToSearch, "Cameras.json");
                    delete(actualCamerasData, cameraFound);
                    save(actualCamerasData, "Cameras.json");

                }

                case 4 -> {

                    System.out.print("Insert the id of the camera that do you want to update: ");
                    idToSearch = sc.nextInt();

                    int cameraFound = find(actualCamerasData, idToSearch, "Cameras.json");
                    update(actualCamerasData, cameraFound);
                    save(actualCamerasData, "Cameras.json");

                }

                case 5 -> {
                    System.out.println("\nID\t|MODEL\t\t|FLASHLIGHT\t\t|");
                    printList(actualCamerasData);
                }

                case 6 -> {
                    System.out.println("YOU HAVE EXITED");
                }

                default -> {
                    System.out.println("INVALID OPTION");
                }
            }
        } while (option != 6);
    }
}
