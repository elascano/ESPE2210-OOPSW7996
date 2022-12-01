package ec.edu.espe.exam.view;

//import ec.edu.espe.exam.model.Stand;
import com.google.gson.Gson;
import ec.edu.espe.exam.model.Stand;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Main {

    public static void main(String[] args) {
        showMyInfo();

        Stand stand;

        stand = EnterStandInfo();

        SaveFileJson(stand);

    }

    private static void showMyInfo() {
        System.out.println("======================================");
        System.out.println("----------------Stand---------------");
        System.out.println("======================================");
        System.out.println("-----------Stephen Drouet------------");
    }

    private static Stand EnterStandInfo() {
        Stand newStand;
        Scanner scan;
        scan = new Scanner(System.in);

        int id;
        String name;
        String ownerName;
        String producName;
        ArrayList<String> productsName;
        productsName = new ArrayList<>();

        System.out.println("Enter id:");
        id = scan.nextInt();
        System.out.println("Enter your Stand name");
        name = scan.nextLine();
        System.out.println("Enetr your name");
        ownerName = scan.nextLine();
        System.out.println("Enter first product");
        producName = scan.nextLine();
        productsName.add(producName);
        System.out.println("Enter second product");
        producName = scan.nextLine();
        productsName.add(producName);

        newStand = new Stand(id, name, ownerName, productsName);

        return newStand;

    }

    private static void SaveFileJson(Stand standInfo) {
        Gson gson = new Gson();
        String json = gson.toJson(standInfo);

        File file = new File("./stand.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("----------File was saved----------");
        } catch (Exception e) {
            System.out.println("Error: File not open or found");
        }
    }

}
