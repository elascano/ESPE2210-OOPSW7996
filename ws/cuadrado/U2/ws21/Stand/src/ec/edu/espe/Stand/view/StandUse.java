package ec.edu.espe.Stand.view;
import com.google.gson.Gson;
import static ec.edu.espe.Stand.controller.FileManager.read;
import ec.edu.espe.Stand.model.Stand;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alejandro Cuadrado
 */
public class StandUse {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        int option;
        ArrayList<Stand> Stand = new ArrayList<>();
        String fileName = "Stand.json";
        while (!exit) {
            menu();
            try {
                System.out.println("please select an option :3");
                option = scan.nextInt();
                switch (option) {
                    case 1:
                        Stand = read(Stand, "Standinfo.json");
                        addStand(Stand, scan, fileName);
                        break;
                    case 2:
                        readStands(Stand);
                        break;

                    case 3:
                        System.out.println("It's in option 3");
                        update(Stand, scan);
                        break;
                    case 4:
                        System.out.println("It's in option 3");
                        do {
                            System.out.println("----------------------------------");
                            System.out.println("             remove it       ");
                            System.out.println("-----------------------------------");
                            System.out.println("1.delete one stand ... :3");
                            System.out.println("2.delete stans ... :3");
                            System.out.println("3.return");
                            try {
                                System.out.println("put an option ");
                                option = scan.nextInt();
                                switch (option) {
                                    case 1 -> {
                                    }

                                    case 2 -> {
                                    }

                                    case 3 -> {
                                    }
                                    default -> System.out.println("Non existent option");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("incorrect data");
                                scan.next();
                            }
                        } while (option != 3);
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("error, please select another option");
                }
            } catch (InputMismatchException e) {
                System.out.println("please numbers");
                scan.next();
            }
        }
    }
    private static void menu() {
        System.out.println("Alejandro Cuadrado");
        System.out.println("***---------------------------***");
        System.out.println("           Stand Menu            ");
        System.out.println("***---------------------------***");
        System.out.println("1. Create a Stand");
        System.out.println("2. Read Stands");
        System.out.println("3. Update Stand");
        System.out.println("4. delete Stand");
        System.out.println("5. exit");
    }
    public static void update(ArrayList<Stand> stands, Scanner scan) {
        int Search;
        try {
            System.out.print("please insert id:");
            Search = scan.nextInt();
            int printersPosition = find(stands, Search);

            if (printersPosition != -1) {
                Stand stand = null;
                int id;
                String name;
                String owner;
                Stand StandUpdate = new Stand();
                Stand Update = stands.get(printersPosition);
                System.out.println("***---------------------***");
                System.out.println("         Stand");
                System.out.println("***---------------------***");
                printLine(StandUpdate);
                System.out.print(" enter Stand");
                String Stand = scan.nextLine();
                System.out.print(" Enter Name");
                String Name = scan.nextLine();
                StandUpdate.setStand(stand);
                StandUpdate.setname(Name);

                Gson gson = new Gson();
                String json = gson.toJson(stands);

                try {
                    FileWriter writer = new FileWriter("Standinfo.json");
                    writer.write(json);
                    writer.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace(System.out);
                } catch (IOException e) {
                    e.printStackTrace(System.out);
                }
            } else {
                System.out.println("22");
            }
        } catch (Exception e) {
            System.out.println("111");
        }
    }
     public static void printLine(Stand printer) {
       int id = printer.getId();
                String stand = printer.getStand();
                String type = printer.getowner();
                System.out.println("ID\t" + id);
        String name = null;
                System.out.println("Name\t" + name);
        String owner = null;
                System.out.println("TYPE\t" + owner);
    }
     public static int find(ArrayList<Stand> stands, int id) {
        Stand printer = new Stand();

        for (int i = 0; i < stands.size(); i++) {
            printer = stands.get(i);
            if (id == printer.getId()) {
                return i;
            }
        }
        return -1;
    }

    private static void addStand(ArrayList<Stand> Stand, Scanner scan, String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void readStands(ArrayList<Stand> Stand) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}    

