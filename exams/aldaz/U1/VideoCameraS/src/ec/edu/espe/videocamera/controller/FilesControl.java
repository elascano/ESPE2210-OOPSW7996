/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.videocamera.controller;

import ec.edu.espe.videocamera.model.VideoCamera;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class FilesControl {
    
    public static void editFile(String fileName, VideoCamera camera) {
        File file = new File(fileName);
        
        try {
            FileWriter output = new FileWriter(fileName);
            Gson gson = new Gson();
            
            String cameraJson = gson.toJson(camera);
            output.write(cameraJson);
            
            output.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    /**
     *
     * @param fileName
     * @param id
     */
    public static void searchCameraFile(String fileName,int id) {
        File file = new File(fileName);
        String[] data;
        String idToString=id+"";
        try {
            var input = new BufferedReader(new FileReader(file));
            var line = input.readLine();
            System.out.println("\nvideo\t|name\t|duration|\t|");
            while (line != null) {
                data = line.split(";");
                
                if (idToString.equals(data[0])) {
                    printLine(data);
                    System.out.println();
                }
                line = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void readFile(String fileName){
        File file = new File(fileName);
        String[] data;
        try {
            var input = new BufferedReader(new FileReader(file));
            var line = input.readLine();
            System.out.println("\nvideo\t|name\t|duration|\t|");
            while (line != null) {
                data = line.split(";");
                printLine(data);
                line = input.readLine();
                System.out.println();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void printLine(String[] data) {        
        //for-each use
        for (String fact : data) {
            if ("true".equals(fact)) {
                fact="Yes";
            }else if("false".equals(fact)){
                fact="No";
            }
            System.out.print(fact + "\t|");
        }
    }
    
    public static void loadFile(String fileToLoadName) {
        File fileToLoad = new File(fileToLoadName);
        String[] data;
        try {
            var input = new BufferedReader(new FileReader(fileToLoad));
            var line = input.readLine();
            String fileName = "cameraroll.json";
            boolean molting=false;
            while (line != null) {
                VideoCamera camera;
                
                data = line.split(";");
                camera = new VideoCamera(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), molting);
                editFile(fileName, camera);
                line = input.readLine();
            }
            input.close();
            System.out.println("\nTHE INFORMATION FROM FILE HAS ADDED CORRECTLY\n");
        } catch (FileNotFoundException ex) {
            System.out.println("\nTHE FILE THAT YOU ARE TRYING TO SEARCH DOESN'T EXIST\n");
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            System.out.println("\nTHE FILE THAT YOU ARE SEARCHING DOES NOT EXIST\n");
            ex.printStackTrace(System.out);
        }
    }

    private static class Gson {

        public Gson() {
        }

        private String toJson(VideoCamera camera) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
