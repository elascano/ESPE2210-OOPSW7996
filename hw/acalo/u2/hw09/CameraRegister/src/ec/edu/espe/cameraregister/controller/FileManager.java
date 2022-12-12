/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.cameraregister.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.cameraregister.model.*;
import ec.edu.espe.cameraregister.utils.DataNotFoundException;
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

    public static int find(ArrayList<Camera> cameras, int id) throws DataNotFoundException {
        Camera camera = new Camera();

        for (int i = 0; i < cameras.size(); i++) {
            camera = cameras.get(i);
            if (id == camera.getId()) {
                return i;
            }
        }
        throw new DataNotFoundException("..:: THE ID: {" + id + "} DOESN'T EXIST ::..");
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
}
