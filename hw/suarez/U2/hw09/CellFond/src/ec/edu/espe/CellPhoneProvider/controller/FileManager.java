
package ec.edu.espe.CellPhoneProvider.controller;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import ec.edu.espe.CellPhoneProvider.model.CellPhone;
import ec.edu.espe.CellPhoneProvider.utils.DataNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class FileManager {

    public static boolean openFile(boolean confirmation) {
        File file = new File("CellPhoneData.json");
        if (file.exists()) {

            confirmation = (true);

        }
        System.out.println("File creation -->" + confirmation);

        return confirmation;
    }

    public static void saveJson(String json, ArrayList<CellPhone> forks) {

        Gson gson = new Gson();
        json = gson.toJson(forks);

        try ( FileWriter file = new FileWriter("CellPhoneData.json")) {

            file.write(json);
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    public static int find(ArrayList<CellPhone> cellPhone, int id) throws DataNotFoundException {
        CellPhone cellphone = new CellPhone();

        for (int i = 0; i < cellPhone.size(); i++) {
            cellphone = cellPhone.get(i);
            if (id == cellphone.getId()) {
                return i;
            }
        }
        throw new DataNotFoundException("#### The Id: {" + id + "} is not logged in ####");
    }
    
    public static void printLine(CellPhone cell) {
        int id = cell.getId();
        String model = cell.getCellPhoneBrand();
        int NumberOfCell = cell.getNumberOfCellPhones();
        String color = cell.getColor();
        System.out.println(id + "\t|" + model + "\t|" + color + "\t|" + NumberOfCell + "\t|");

    }
    

}
 