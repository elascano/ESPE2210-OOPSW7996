
package correctionForExam.view;

import correctionForExam.model.FlashDriver;
import java.util.Scanner;

/**
 *
 * @author Karla Ansatuña
 */
public class CorrectionForExam {

    public static void main(String[] args) {
        int choice=0;
        boolean option=false;
        Scanner sc = new Scanner(System.in);
        do{
            menu();
            choice=sc.nextInt();
            switch(choice){
        
            case 1 ->{
            
        }
        case 2 ->{
            option=true;
        }
            }
        }while(!option);
    }
    public static void menu() {
        System.out.println("===================");
        System.out.println("=====Welcome User=====");
        System.out.println("Please choose an option");
        System.out.println("1. Enter a flash driver (also in a Json) >");
        System.out.println("2. Exit the program >");
        System.out.println("==========>");
    }
    
    public static void insertingFlashDriver(ArrayList<FlashDriver> flashDrivers) {
        FlashDriver flashDriver=new ArrayList();
        
        System.out.println("Write the color of the Flash Driver >");
        
    }
    private static ArrayList<FlashDriver> readFile(ArrayList<FlashDriver> sdCards) throws JsonSyntaxException {
        String json = "";
        Gson gson = new Gson();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("sdCards.json"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                json = line;
                TypeToken<ArrayList<SdCard>> type = new TypeToken<ArrayList<SdCard>>() {
                };
                sdCards = gson.fromJson(json, type);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExamU1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExamU1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sdCards;
    }

    private static void exportJsonFile(ArrayList<SdCard> sdCards) {
        String json = new Gson().toJson(sdCards);
        try {
            FileWriter orderRecord = new FileWriter("sdCards.json");
            orderRecord.write(json);
            orderRecord.close();
        } catch (IOException ex) { //Exception
            Logger.getLogger(ExamU1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
