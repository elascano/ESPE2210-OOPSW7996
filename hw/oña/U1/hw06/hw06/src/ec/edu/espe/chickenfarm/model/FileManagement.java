/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.model;
import java.io.*;


/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class FileManagement {
    private String id;
    private String name;
    private String color;
    private String age;
    private String isMolting;

    public FileManagement(){
        id="";
        name="";
        color="";
        age="";
        isMolting="";
    }

    public FileManagement(String id, String name, String color, String age, String isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the isMolting
     */
    public String isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(String isMolting) {
        this.isMolting = isMolting;
    }
    
    public static void createFile(String fileName) {
        File archive = new File(fileName);
        try {
            PrintWriter exit = new PrintWriter(archive);
            exit.close();
            System.out.println("The file is created");
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        }      
    }
 public static void writeFile(String fileName , String contents) {
        File archive = new File(fileName);
        try {
            PrintWriter exit = new PrintWriter(new FileWriter(archive, true));
            
            exit.println(contents);
            exit.close();
            System.out.println("It was written to the file");
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
 } 
 public static void readFile(String fileName) {
        File archive = new File(fileName);
        try {
            BufferedReader entry = new BufferedReader(new FileReader(archive));
            String lectura = entry.readLine();
            while(lectura!=null){
                System.out.println(lectura);
                lectura = entry.readLine();
            }
            entry.close();
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }   
    }
 public static void deletefile(String fileName) {
        File archive = new File(fileName);
        archive.delete();
        System.out.println("Se elimino el archivo");  
    }
}
