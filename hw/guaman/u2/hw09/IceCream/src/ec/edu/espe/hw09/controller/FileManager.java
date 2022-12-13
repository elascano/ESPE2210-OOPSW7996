package ec.edu.espe.hw09.controller;

import com.google.gson.Gson;
import ec.edu.espe.hw09.model.IceCream;
import ec.edu.espe.hw09.utils.CustomException;
import ec.edu.espe.hw09.utils.Helper;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class FileManager {

    public static void save(ArrayList<IceCream> iceCreams) {
        Gson gson = new Gson();
        String json = gson.toJson(iceCreams);
        File file = new File("./icecreams.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("The data was saved successfully");
        } catch (Exception e) {
            System.out.println("A problem occurred while saving the data ");
        }

    }

    public static ArrayList<IceCream> read() {
        Gson gson = new Gson();

        ArrayList<IceCream> iceCreams = new ArrayList<>();
        String jsonFile = "";
        String[] jsonIceCreams;

        try ( Scanner scFile = new Scanner(new File("./icecreams.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            jsonFile = jsonFile.replace("[", "");
            jsonFile = jsonFile.replace("]", "");

            jsonIceCreams = jsonFile.split("},");

            for (int i = 0; i < jsonIceCreams.length; i++) {
                if (i < jsonIceCreams.length - 1) {
                    iceCreams.add(gson.fromJson(jsonIceCreams[i] + "}", IceCream.class));
                } else {
                    iceCreams.add(gson.fromJson(jsonIceCreams[i], IceCream.class));
                }
            }

            System.out.println("Data successfully uploaded");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return iceCreams;
    }

    public static void showAllIceCreams(ArrayList<IceCream> iceCreams) {
        for (int iceCreamNumber = 0; iceCreamNumber < iceCreams.size(); iceCreamNumber++) {
            System.out.println((iceCreamNumber + 1) + ". " + iceCreams.get(iceCreamNumber));
        }

    }

    public static void addNewIceCream(ArrayList<IceCream> iceCreams) {
        String id;
        String flavor;
        Scanner scan = new Scanner(System.in);
        String addOtherIceCream = "";
        Helper h = new Helper();

        do {
            try {

                System.out.println("\n\tNEW ICE-CREAM");
                System.out.print("Enter the ice cream id: ");
                flavor = scan.nextLine();
                System.out.print("Enter the ice cream flavor: ");
                id = scan.nextLine();
                iceCreams.add(new IceCream(flavor, id));

                try {
                    System.out.print("Do you want to add a new IceCream: (y/n) ");
                    addOtherIceCream = scan.next();
                    h.validateAddAnother(addOtherIceCream);
                    scan.nextLine();
                } catch (CustomException e) {
                    System.out.println("cannot run due to: "
                            + e.getMessage());

                }

            } catch (Exception e) {
                System.out.println("Invalid data entered");
            }

        } while ("y".equals(addOtherIceCream.toLowerCase()));
        FileManager.save(iceCreams);
    }
    
    public static void delete(ArrayList<IceCream> iceCreams) {

        int iceCreamNumber;
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Which Ice-Cream do you want to remove?: ");
        System.out.print("Choose an option: ");
        try {
            iceCreamNumber = sc.nextInt()-1;
        } catch (Exception e) {
            iceCreamNumber = 0;
        }
        sc.nextLine();
        
        try {
            iceCreams.remove(iceCreamNumber);
            System.out.println("The Ice-Cream was remove successfully");
            FileManager.save(iceCreams);
        } catch (Exception e) {
            System.out.println("The Ice-Cream was not remove");
        }
    }
}
