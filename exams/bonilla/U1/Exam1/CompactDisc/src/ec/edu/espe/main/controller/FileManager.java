package ec.edu.espe.main.controller;

import com.google.gson.Gson;
import ec.edu.espe.main.model.CompactDisc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {
    private ArrayList<CompactDisc> arrCompactDiscs;
    ArrayList<String> arr=new ArrayList<>();
    File file;

    public FileManager(File file)
    {
        this.file = file;
        this.arrCompactDiscs=new ArrayList<>();
        readFile();
    }
    
    public void save(CompactDisc compactDisc) {
        Gson gson = new Gson();
        FileWriter fileWriter;
        PrintWriter printWriter;
        arrCompactDiscs.add(compactDisc);
        
        String readGson = gson.toJson(compactDisc);
        if (!file.exists()) {
            try {
                file.createNewFile();
                fileWriter = new FileWriter(file, true);
                printWriter = new PrintWriter(fileWriter);
                printWriter.write(readGson);
                printWriter.write("\n");
                printWriter.close();
                fileWriter.close();

            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {

                fileWriter = new FileWriter(file, true);
                printWriter = new PrintWriter(fileWriter);
                printWriter.write(readGson);
                printWriter.write("\n");
                printWriter.close();
                fileWriter.close();

            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    public String readFile()
    {
        String texto="";
        
        if(file.exists())
        {
            CompactDisc compactDisc = null;
            try 
            {
                BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
                String saveJson="";
                String bfRead;
                while((bfRead=bufferedReader.readLine())!= null)
                {
                    saveJson+=bfRead;
                    saveJson+="\n";
                    arr.add(saveJson);
                   
                }
                

                 
                 
                bufferedReader.close();
                texto=saveJson;
            } catch (Exception e) {
            }
        }
        else
        {
            System.out.print("Archivo no disponible");
        }
        return texto;
    }
    public void crearCopiaYleer()
    {
       // ArrayList<String> copia = readFile(file);
        //arr.remove(0).equals();
        for(int i=0; i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }
        
    }
    public void borrarArchivo(File file)
    {
        file.delete();
        //arrCompactDiscs=null;
    }
    
    
    
}
