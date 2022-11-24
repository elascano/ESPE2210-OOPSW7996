/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
//import static ec.edu.espe.chickenfarm.controller.FilesControl.*;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.*;
import java.util.*;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    
    public static void main(String[] args) {
        var fileName = "chickens.json";
        var fileToLoadName = "chickensLoad.json";
        int id;
        
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
        
        //Using data from Keyboard
        Scanner scan = new Scanner(System.in);

        System.out.println("\t========================");
        System.out.println("\t     Cristian Acalo");
        System.out.println("\t Chicken Farm Simulator");
        System.out.println("\t========================");
        
        int menuOption;
        try {
            //Principal Menu
            do {
                System.out.println("\n***************************************");
                System.out.println("*                MENU                 *");
                System.out.println("***************************************");
                System.out.println("1.\tAdd a chicken");
                System.out.println("2.\tSearch a chicken");
                System.out.println("3.\tPrint actual chickens");
                //System.out.println("4.\tLoad data from a csv");
                System.out.println("0.\tExit\n");
                System.out.print("===> Select an option: ");

                menuOption = scan.nextInt();

                switch (menuOption) {
                    case 1 -> {
                        chicken = addChicken();
                        System.out.println(chicken);
                        if (chicken != null) {
                            System.out.println(chicken);
                            chickens.add(chicken);
                            
                            Collections.sort(chickens, new Comparator<Chicken>() {
                                @Override
                                public int compare(Chicken c1, Chicken c2) {
                                    return Integer.valueOf(c1.getId()).compareTo(c2.getId());
                                }
                            });
                            System.out.println(chicken);
                            System.out.println("..:: CHICKEN ADDED ::..");
                            writeJson(chickens, fileName);
                        }
                    }
                    case 2 -> {
                        try {
                            System.out.print("..:: Enter chicken: ");
                            id = scan.nextInt();
                            searchChicken(fileName,id);
                        } catch (Exception e) {
                            System.out.println("..:: PLEASE ENTER A VALID DATA :::..");
                        }
                    }
                    case 3 -> readFile(fileName);
                    //case 4 -> /loadFile(fileToLoadName);
                    case 0 -> System.out.println("\n..:: YOU HAVE SUCCESSFULLY EXTED ::..\n");
                    default -> System.out.println("\n*** Invalidated option, try again ***\n");
                }
            } while (menuOption != 0);
            
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("\n..:: NO VALID DATA, CLOSING PROGRAM... ::..");
        }
        
    }

    static Chicken addChicken() {
        Scanner scan = new Scanner(System.in);
        var fileName = "chickens.json";
        
        Chicken newChicken = new Chicken();
        
        int id;
        String name = new String("");
        int age;
        String color = new String("");
        String moltingReadable = new String ("");
        boolean molting=false;
        
        try {
            System.out.print("..:: Enter chicken id: ");
            id = scan.nextInt();
            System.out.print("..:: Enter chicken name: ");
            name = scan.next();
            System.out.print("..:: Enter chicken color: ");
            color = scan.next();
            System.out.print("..:: Enter chicken age: ");
            age = scan.nextInt();
            System.out.print("..:: Enter chicken molting (yes/no): ");
            moltingReadable = scan.next();
            if ("yes".equals(moltingReadable.toLowerCase())) {
                molting = true;
            } else if ("no".equals(moltingReadable.toLowerCase())) {
                molting = false;
            }
            newChicken = new Chicken(id, name, color, age, molting);
            
            printChicken(newChicken);
            
        } catch (Exception e) {
            System.out.println("\n..:: PLEASE ENTER A VALID DATA ::..\n");
            return null;
        }
        return newChicken;
   }
    
    private static void printChicken(Chicken chicken) {
        System.out.println("\n\n***********************************************");
        System.out.println("           Chicken " + chicken.getId() + " Information");
        System.out.println("***********************************************");
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken molting \t--> " + chicken.isIsMolting());
        System.out.println("***********************************************");
    }
    
    public static void writeJson(ArrayList<Chicken> chickens, String fileName) {
        File file = new File(fileName);
        file.delete();
        
        File fileOverwritten = new File(fileName);
        
        Gson gson = new Gson();
        String dataJson = gson.toJson(chickens);
        
        try {
            //PrintWriter output = new PrintWriter(new FileWriter(file,true));
            FileWriter output = new FileWriter(fileOverwritten);
            output.write(dataJson);
            
            output.close();
            System.out.println("\n\n..:: File has been written! ::..\n");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void readFile(String fileName) {
        File file = new File(fileName);
        
        String[] data;
        try {
            var input = new BufferedReader(new FileReader(file));
            var line = input.readLine();
            
            
            System.out.println("\nID\t|NAME\t|COLOR\t|AGE\t|MOLTING\t|");
            
            while (line != null) {
                
                line = lineConstructor(line);
                data = line.split(",");
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

    private static String lineConstructor(String line) {
        line = line.replace("[{","");
        line = line.replace("}]","");
        line = line.replace("},{","\n");
        line = line.replace("\"id\":","");
        line = line.replace("\"name\":","");
        line = line.replace("\"color\":","");
        line = line.replace("\"age\":","");
        line = line.replace("\"isMolting\":","");
        line = line.replace("\"","");
        return line;
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
        System.out.println();
    }
    
    public static void searchChicken(String fileName, int id) {
        File file = new File(fileName);
        String idToCompare = id+"";
        String[] data;
        try {
            var input = new BufferedReader(new FileReader(file));
            var line = input.readLine();
            
            line = lineConstructor(line);
            System.out.println("\nID\t|NAME\t|COLOR\t|AGE\t|MOLTING\t|");
            
            while (line != null) {
                
                data = line.split(",");
                if(idToCompare.equals(data[0])){
                    printLine(data);
                }
                line = input.readLine();
                line = lineConstructor(line);
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}