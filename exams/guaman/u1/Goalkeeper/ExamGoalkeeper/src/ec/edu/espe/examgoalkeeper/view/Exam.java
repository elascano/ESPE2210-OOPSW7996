package ec.edu.espe.examgoalkeeper.view;

import com.google.gson.Gson;
import ec.edu.espe.examgoalkeeper.model.Goalkeeper;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Exam {

    public static void main(String[] args) {
        System.out.println("=====Alexander Guaman====");
        System.out.println("=======Exam Unit 1=======");

        Goalkeeper goalkeeper;
        goalkeeper = new Goalkeeper();
        ArrayList<Goalkeeper> goalkeepers = new ArrayList();

        Scanner scan;
        scan = new Scanner(System.in);
        String name;
        String id;
        float height;

        try {
            System.out.print("Type id: ");
            id = scan.nextLine();
            System.out.print("Type name: ");
            name = scan.nextLine();
            System.out.print("Type height: ");
            height = scan.nextFloat();
            goalkeepers.add(new Goalkeeper(id, name, height));
        } catch (Exception e) {
            System.out.println("Error");
        }

        try {
            saveData(goalkeepers);
            System.out.println("Saved Data");
        } catch (Exception e) {
            System.out.println("Error Data was not saved");
        }

    }

    public static void saveData(ArrayList<Goalkeeper> chickens) {
        Gson gson = new Gson();
        String json = gson.toJson(chickens);
        File file = new File("./goalkeepers.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println("A problem occurred while saving the data ");
        }

    }

}
