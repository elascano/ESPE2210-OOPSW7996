package ec.edu.espe.exam1CodingSkills.controller;

import com.google.gson.Gson;
import ec.edu.espe.exam1CodingSkills.model.Coin;
import ec.edu.espe.exam1CodingSkills.view.CoinCollection;
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
    
    public void archiveCoins(File coinData, ArrayList<Coin> coins) {
        Gson gson = new Gson();
        FileWriter writer;
        PrintWriter write;
        coinData.delete();
        try {
            coinData.createNewFile();
        }catch(IOException ex){
            Logger.getLogger(CoinCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            writer = new FileWriter(coinData, true);
            write = new PrintWriter(writer);
            write.println("[");
            for (int i = 0; i < coins.size(); i++) {
                if (i==coins.size()-1){
                    String line = gson.toJson(coins.get(i));
                    write.println(line);
                }else{
                    String line = gson.toJson(coins.get(i))+",";
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
    
    public void readArchive(File coinData, ArrayList<Coin> coins) {
        Gson gson = new Gson();
        coins.clear();
        BufferedReader reader;
        if (coinData.exists()) {
            try {
                reader = new BufferedReader(new FileReader(coinData));
                String data = reader.readLine();
                while(data != null){
                    data = reader.readLine();
                    if(data != null && !data.equals("]")){
                        if (data.endsWith(",")){
                            data = data.substring(0, data.length()-1);
                        }
                        Coin coinRead = gson.fromJson(data, Coin.class);
                        coins.add(coinRead);
                    }
                }
                reader.close();
            }catch(IOException e){
                e.printStackTrace(System.out);
            }
        }
    }
}
