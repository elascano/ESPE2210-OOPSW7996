package ec.edu.espe.ws21.controller;

import com.google.gson.Gson;
import ec.edu.espe.ws21.model.Cup;
import ec.edu.espe.ws21.view.CupCollection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class FileManager {
    
    public void archiveCups(File cupData, ArrayList<Cup> cups) {
        Gson gson = new Gson();
        FileWriter writer;
        PrintWriter write;
        cupData.delete();
        try {
            cupData.createNewFile();
        }catch(IOException ex){
            Logger.getLogger(CupCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            writer = new FileWriter(cupData, true);
            write = new PrintWriter(writer);
            write.println("[");
            for (int i = 0; i < cups.size(); i++) {
                if (i==cups.size()-1){
                    String line = gson.toJson(cups.get(i));
                    write.println(line);
                }else{
                    String line = gson.toJson(cups.get(i))+",";
                    write.println(line);
                }
            }
            write.println("]");
            write.close();
            writer.close();
        }catch(FileNotFoundException e){
            e.printStackTrace(System.out);
        }catch(IOException e){
            e.printStackTrace(System.out);
        }
    }
    
    public void readArchive(File cupData, ArrayList<Cup> cups) {
        Gson gson = new Gson();
        cups.clear();
        BufferedReader reader;
        if (cupData.exists()) {
            try {
                reader = new BufferedReader(new FileReader(cupData));
                String data = reader.readLine();
                while(data != null){
                    data = reader.readLine();
                    if(data != null && !data.equals("]")){
                        if (data.endsWith(",")){
                            data = data.substring(0, data.length()-1);
                        }
                        Cup cupRead = gson.fromJson(data, Cup.class);
                        cups.add(cupRead);
                    }
                }
                reader.close();
            }catch(IOException e){
                e.printStackTrace(System.out);
            }
        }
    }
}
