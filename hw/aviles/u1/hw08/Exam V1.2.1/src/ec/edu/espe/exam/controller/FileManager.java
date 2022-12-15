package ec.edu.espe.exam.controller;
import com.google.gson.Gson;
import ec.edu.espe.exam.model.Pencil;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class FileManager {

    public static int chooseOption(int option) {
        Scanner readOption = new Scanner(System.in);
        boolean posibleToContinue;
        do {
            try {
                posibleToContinue = false;
                System.out.println("Choose an option: ");
                option = readOption.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Error, please introduce a real number");
                readOption.next();
                posibleToContinue = true;
            }
        } while (posibleToContinue);
        return (option);
    }

     public static ArrayList<Pencil> readJson(ArrayList<Pencil> pencils) throws FileNotFoundException, IOException{
        String line;
        Gson gson = new Gson();
        Pencil pencil;
        pencil = new Pencil();
         BufferedReader fileReader = new BufferedReader(new FileReader("pencilFile.json"));
         
         for(int i=1;(line = fileReader.readLine()) != null;i++){
             if(i%2==0){                   
                 pencil = gson.fromJson(line, Pencil.class);
                 pencils.add(pencil);
             }    
         }
            fileReader.close();
            return (pencils);
        }

    
    public static ArrayList<Pencil> addPencil(ArrayList<Pencil> pencils) {
        Scanner readData = new Scanner(System.in);
        boolean posibleToContinue;
        int id=0;
        float weight=0;
        float length=0;
        Pencil pencil;
        pencil = new Pencil();
        System.out.println("\n\n//////////////////////////////////");
        System.out.println("==================================");
        System.out.println("    Enter data for the new pencil.  ");
        System.out.println("==================================\n");
        do {
            try {
                posibleToContinue = false;
                System.out.println("Enter Id: ");
                id = readData.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("==================================\n");
                System.out.println("Error, please introduce a real number.");
                readData.next();
                posibleToContinue = true;
            }
        } while (posibleToContinue);
        do {
            try {
                posibleToContinue = false;
                System.out.println("Enter weight: ");
                weight = readData.nextFloat();
            } catch (InputMismatchException ex) {
                System.out.println("==================================\n");
                System.out.println("Error, please introduce a number.");
                readData.next();
                posibleToContinue = true;
            }
        } while (posibleToContinue);
        do {
            try {
                posibleToContinue = false;
                System.out.println("Enter length: ");
                length = readData.nextFloat();
            } catch (InputMismatchException ex) {
                System.out.println("==================================\n");
                System.out.println("Error, please introduce a number.");
                readData.next();
                posibleToContinue = true;
            }
        } while (posibleToContinue);
        pencil.setId(id);
        pencil.setWeight(weight);
        pencil.setLength(length);
        pencils.add(pencil);
        System.out.println("//////////////////////////////////");
        System.out.println("Data saved");
        System.out.println("//////////////////////////////////\n\n");
        return (pencils);
    }
    
    public static int findPencil(ArrayList<Pencil> pencils) {
        int option = 0;
        int position = -1;
        Scanner readOption = new Scanner(System.in);
        Scanner readId = new Scanner(System.in);
        boolean posibleToContinue;
        int id = 0;
        int idFound;
        boolean inexistenceId = true;
        
        do {
            System.out.println("\n\n//////////////////////////////////");
            do {
                try {
                    posibleToContinue = false;
                    System.out.println("Enter the Id of the Pencil to delete.");
                    id = readId.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("==================================\n");
                    System.out.println("Error, please introduce a real number.");
                    readId.next();
                    posibleToContinue = true;
                }
            } while (posibleToContinue);

            for (int i = 0; i < pencils.size(); i++) {
                idFound = pencils.get(i).getId();
                if (id == idFound) {
                    position = i;
                    inexistenceId = false;
                }
            }
            
            
            
            if (inexistenceId == true) {
                System.out.println("The id does not exist.");
                do {
                    System.out.println("\n==================================");
                    System.out.println("Want to try again?");
                    System.out.println("1. YES");
                    System.out.println("2. No");
                    System.out.println("==================================\n");

                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Choose an option: ");
                            option = readOption.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("==================================\n");
                            System.out.println("Error, please introduce a real number");
                            readOption.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);
                    switch (option) {
                        case 1:
                            id = 0;
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("==================================\n");
                            System.out.println("Incorect option");
                            break;
                    }
                } while (option != 2 && option!=1);
                

            } else {
                option = 2;
            }
        } while (option == 1);
        return (position);
    }

    public static ArrayList<Pencil> deletePencil(int position, ArrayList<Pencil> pencils) {
        pencils.remove(pencils.get(position));
        System.out.println("//////////////////////////////////");
        System.out.println("Pencil eliminated");
        System.out.println("//////////////////////////////////\n\n");
        return (pencils);
    }
    
    public static ArrayList<Pencil> updatePencil(int position, ArrayList<Pencil> pencils) {
        int option = 0;
        boolean posibleToContinue;
        Scanner read = new Scanner(System.in);
        int id=0;
        float weight=0;
        float length=0;
        do {
            System.out.println("\n\n//////////////////////////////////");
            System.out.println("==============================");
            System.out.println("What do you want to modify: ");
            System.out.println("1. Id");
            System.out.println("2. Weight");
            System.out.println("3. Length");
            System.out.println("4. Confirm new data");
            System.out.println("==============================");
            do {
                try {
                    posibleToContinue = false;
                    System.out.println("Choose an option: ");
                    option = read.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("==================================\n");
                    System.out.println("Error, please introduce a real number");
                    read.next();
                    posibleToContinue = true;
                }
            } while (posibleToContinue);
            System.out.println("\n==================================\n");
            switch (option) {
                case 1:
                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Enter new Id: ");
                            id = read.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("==================================\n");
                            System.out.println("Error, please introduce a real number");
                            read.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);
                    pencils.get(position).setId(id);
                    break;
                case 2:
                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Enter weight: ");
                            weight = read.nextFloat();
                        } catch (InputMismatchException ex) {
                            System.out.println("==================================\n");
                            System.out.println("Error, please introduce a number.");
                            read.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);
                    pencils.get(position).setWeight(weight);
                    break;
                case 3:
                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Enter length: ");
                            length = read.nextFloat();
                        } catch (InputMismatchException ex) {
                            System.out.println("==================================\n");
                            System.out.println("Error, please introduce a number.");
                            read.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);
                    pencils.get(position).setLength(length);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("==================================\n");
                    System.out.println("Invalid Option");
                    break;
            }
        }while(option!=4);
        System.out.println("//////////////////////////////////");
        System.out.println("Pencil updated");
        System.out.println("//////////////////////////////////\n\n");
        return (pencils);
    }
    
    
    public static void printPencils(ArrayList<Pencil> pencils) {
        int id=0;
        float weight=0;
        float length=0;
        System.out.println("\n\n//////////////////////////////////");
        System.out.println("Pencils data");
        System.out.println("|ID\t|WEIGHT\t|LENGTH\t|");
        for(int i=0;i<pencils.size();i++){
            id=pencils.get(i).getId();
            weight=pencils.get(i).getWeight();
            length=pencils.get(i).getLength();
            System.out.println("|"+id+"\t|"+weight+"\t|"+length+"\t|");
        }
        System.out.println("//////////////////////////////////\n\n");
    }
    
    
    
    
    public static void writeJson(ArrayList<Pencil> pencils) throws IOException {
        Gson gson = new Gson();
        String json;
        FileWriter fileWriter = new FileWriter("pencilFile.json");
        fileWriter.write("[\n");
        for (int i = 0; i < pencils.size(); i++) {
            json = gson.toJson(pencils.get(i));
            if(i!=pencils.size()-1){
                json = json + "\n,\n";
            }
            fileWriter.write(json);
        }
        fileWriter.write("\n]");
        fileWriter.close();
        System.out.println("//////////////////////////////////");
        System.out.println("Pencils data sved in JSON file");
        System.out.println("//////////////////////////////////\n\n");
    }
    
    
}
