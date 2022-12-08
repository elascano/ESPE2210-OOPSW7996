
package excercise.pkg28.model;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class Printer {
    
    public static ArrayList<Printer> readFileJsonPrinter() {
        ArrayList<Printer> taxiDriver = new ArrayList<Printer>();
        Gson gson = new Gson();
        JsonArray printerJsArray = new JsonArray();
        File printerInfo = new File("printerInfo.json");
        ArrayList<Printer> printer = null;
        if(isFileEmpty(printerInfo) == false){
            try {
                BufferedReader reader = new BufferedReader(new FileReader(printerInfo));
                String line = "";
                String json = "";
                while ((line = reader.readLine()) != null) {
                    json += line;
                }

                printerJsArray = gson.fromJson(json, JsonArray.class);

                for (int i = 0; i < printerJsArray.size(); i++) {
                    printer.add(i, gson.fromJson(printerJsArray.get(i), Printer.class));
                }
                reader.close();
            } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            } catch (IOException ex) {
            ex.printStackTrace(System.out);
            }
        }    
        return printer;
    }
     public static boolean isFileEmpty(File file) {
        return file.length() == 0;
    }
    public static void enterPrinterData(ArrayList<Printer> printerInfo, Printer printer, int position[]) {
        String name;
        long id;
        String numberOfId;
        String type;
        System.out.println("===============================");
        System.out.println("      ENTER PRINT DATA      ");
        System.out.println("===============================");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name");
        name = input.nextLine();

        System.out.println("");
        
        System.out.println("Enter the type of the printer ");
        type = input.nextLine();

        System.out.println("");
        
            System.out.println("Enter the id");
            numberOfId = input.nextLine();
            input.nextLine();

            String regex = "\\d{10}";

            while (numberOfId.matches(regex) == false) {
                System.out.println("The number is: " + numberOfId);
                System.out.println("Is the above id valid? " + numberOfId.matches(regex));
                System.out.println("");
                System.out.println("Enter the id");
                numberOfId = input.nextLine();
                input.nextLine();
            }

            id = Long.parseLong(numberOfId);
      }
    
    public static void savePrinterFileJson(ArrayList<Printer> printer) {

        File printerFile = new File("printerInfo.json");
        Gson gson = new Gson();
        JsonArray printerInfo = new JsonArray();

        for (int i = 0; i < printer.size(); i++) {
            gson.toJsonTree(printer.get(i));
        }
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(printerFile, false));
            writer.print(printerInfo);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
