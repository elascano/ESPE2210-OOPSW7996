
package ec.edu.espe.exam1q33.view;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exam1q33.model.Mouse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class Exam1_Q33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean exitMenu = false;
        int option = 0;
        ArrayList<Mouse> mouses = new ArrayList<>();
        
        while (!exitMenu)
        {

            try
            {
                System.out.println("1. Enter new mouse");
                System.out.println("2. Exit");
                System.out.println("Choose any option: ");
                option = sc.nextInt();

                switch (option)
                {
                    case 1:
                        mouses = readJson(mouses);
                        enterNewMouse(mouses);
                        addToJson(mouses);
                        System.out.println("Mouse successfully added");
                        break;
                    case 2:
                        exitMenu = true;
                        break;
                    default:
                        System.out.println("Only values between 1 and 2 are accepted");
                }
            } catch (InputMismatchException e)
            {
                System.out.println("Incorrect value");
            }
        }
        
    }

    private static void addToJson(ArrayList<Mouse> mouses) {
        File fileJson = new File("MouseList.json");
        Gson gson = new Gson();
        String json = gson.toJson(mouses);

        try
        {
            FileWriter writer = new FileWriter(fileJson);
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
        } catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
    }

    private static ArrayList<Mouse> readJson(ArrayList<Mouse> mouses) {
      
        Gson gson = new Gson();

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("MouseList.json"));
            String line = "";
            line = br.readLine();
            TypeToken<ArrayList<Mouse>> type = new TypeToken<ArrayList<Mouse>>() {};
            mouses = gson.fromJson(line, type.getType());
            br.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("File not Found");
        } catch (IOException ex)
        {
            System.out.println("Empty File");
        }
        return mouses;
    }

    private static void enterNewMouse(ArrayList<Mouse> mouses) {
        Mouse mouse = new Mouse();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the mouse id");
        mouse.setId(sc.nextInt());
        System.out.println("Enter the mouse name");
        mouse.setName(sc.next());
        System.out.println("Enter true or false if the mouse have RGB");
        mouse.setRgb(sc.nextBoolean());

        mouses.add(mouse);
    }
    
}
