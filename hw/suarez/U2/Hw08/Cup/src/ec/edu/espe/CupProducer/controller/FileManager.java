
package ec.edu.espe.CupProducer.controller;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import ec.edu.espe.CupProducer.model.Cup;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class FileManager {

    public static boolean openFile(boolean confirmation) {
        File file = new File("CupData.json");
        if (file.exists()) {

            confirmation = (true);

        }
        System.out.println("File creation -->" + confirmation);

        return confirmation;
    }

    public static void closeFile() {
   

    }

    public static void saveJson(String jsonCup) {

        try ( FileWriter file = new FileWriter("CupData.json")) {

            file.write(jsonCup);
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String readJson(ArrayList<Cup> cups,String json) {
      
        Gson gson = new Gson();

        json = gson.toJson(cups);
        
        return json;
    }

}
