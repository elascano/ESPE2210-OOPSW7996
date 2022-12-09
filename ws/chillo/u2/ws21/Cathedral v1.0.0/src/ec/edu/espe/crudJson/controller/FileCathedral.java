package ec.edu.espe.crudJson.controller;

import com.google.gson.Gson;
import ec.edu.espe.crudJson.model.Cathedral;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
        
/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class FileCathedral {

    public static void save(ArrayList<Cathedral> cathedrals, File file){
        Cathedral cathedral;
        Scanner sc;
        String name;
        int yearBuild;
        String cityWhereFind;
        
        sc = new Scanner(System.in);
        cathedral = new Cathedral();
        
        System.out.println(" ||Enter Data of the Cathedral|| ");
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("Year of Build: ");
        yearBuild = sc.nextInt();
        System.out.println("City Where it Find: ");
        cityWhereFind = sc.next();
        
        cathedral = new Cathedral(name,yearBuild,cityWhereFind);
        
        cathedrals.add(cathedral);
        saveAsFileJson(cathedral,file);
        sc.nextLine();
        
    }
    
    private static void saveAsFileJson(Cathedral cathedral, File file){
        Gson gson;
        String json;
        FileWriter fw;
        
        gson = new Gson();
        json = gson.toJson(cathedral);
        
        try {
            fw = new FileWriter(file.getAbsoluteFile(),true);
            fw.write(json + "\n");
            fw.flush();
        }catch (IOException ex){
            Logger.getLogger(FileCathedral.class.getName()).log(Level.SEVERE,null,ex);
        }  
    }
    
    public static File openFile(){
        File file = null;
        
        try{
            file = new File("./cathedralFile.json");
            if(!file.exists()){
                file.createNewFile();
            }
        } catch (IOException e){
            System.out.println("|Error opening of File1");
        }
        return file;    
    }
    
    public static void recoverJsonData(ArrayList<Cathedral> cathedrals, File file){
        Scanner scFile;
        Gson gson;
        Cathedral cathedral;
        
        gson = new Gson();
        
        try{
            scFile = new Scanner(file);
            
            while(scFile.hasNextLine()){
                cathedral = gson.fromJson(scFile.nextLine(),Cathedral.class);
                cathedrals.add(cathedral);
            }
        } catch(FileNotFoundException ex){
            Logger.getLogger(FileCathedral.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
    
    public static void printData(ArrayList<Cathedral>cathedrals){
        for(int i=0; i<cathedrals.size(); i++){
            System.out.println(cathedrals.get(i).getName() + "\t\t" + cathedrals.get(i).getYearBuild()+"\t\t"+cathedrals.get(i).getCityWhereFind());
        }
    }
}
