
package ec.edu.espe.cellphoneregister.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.cellphoneregister.model.*;
import ec.edu.espe.cellphoneregister.utils.DataNotFoundException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class FileManager {

    public static ArrayList<CellPhone> read(ArrayList<CellPhone> cellphone, String fileName) {
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<CellPhone>> type = new TypeToken<ArrayList<CellPhone>>() {
                };
                cellphone = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("\n THE FILE FOR THE APLICATION DOESN'T EXIST, IT WILL BE CREATED 2"
                    + "\n");
        } catch (IOException ex) {
            System.out.println("THE FILE CAN'T BE READED");
        }
        return cellphone;
    }
    
    public static void create(ArrayList<CellPhone> cellphone, String fileName) {
        Gson gson = new Gson();
        String json = gson.toJson(cellphone);

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

    public static int find(ArrayList<CellPhone> cellphone, int id) throws DataNotFoundException {
        CellPhone cellphones = new CellPhone();

        for (int i = 0; i < cellphone.size(); i++) {
            cellphones = cellphone.get(i);
            if (id == cellphones.getId()) {
                return i;
            }
        }
        throw new DataNotFoundException("THE ID: " + id + " DOESN'T EXIST");
    }
    
    public static void printList(ArrayList<CellPhone> cellphone) {
        CellPhone cellphones = new CellPhone();
        System.out.println("\nID\t|MODEL\t|COLOR|");
        for (int i = 0; i < cellphone.size(); i++) {
            cellphones = cellphone.get(i);
            printLine(cellphones);
        }
    }
    
    public static void printLine(CellPhone cellphones) {
        int id = cellphones.getId();
        String model = cellphones.getModel();
        String color = cellphones.getColor();
        System.out.println(id + "\t|" + model + "\t|" + color + "\t|");

    }
}


