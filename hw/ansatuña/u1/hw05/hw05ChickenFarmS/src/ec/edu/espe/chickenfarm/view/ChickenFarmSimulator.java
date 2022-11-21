package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
 */
    
public class ChickenFarmSimulator {


    
      private static void header() {
        System.out.println("===================");
        System.out.println("Karla Ansatuña");
        System.out.println("Setters and Getters");
        System.out.println("===================");
        System.out.println("=***Wellcome***=");
        System.out.println("=**To Chicken Farm Simulator**=");
        System.out.println("    (^ o ^)   ");
    }
    private static void printChickenData(Chicken chicken) {
 
        System.out.println("======================");
        System.out.println("-chicken id-->" + chicken.getId());
        System.out.println("-chicken name-->" + chicken.getName());
        System.out.println("-chicken age-->" + chicken.getAge());
        System.out.println("-chicken color-->" + chicken.getColor());
        System.out.println("-chicken is Molting-->" + chicken.isIsMolting());
        System.out.println("======================");
    }
    private static void choiceVerifier(int choice){
    
        while(choice<1||choice>3){
            Scanner sc = new Scanner(System.in);
            System.out.println("Invalid option, please enter again-->");
            choice = sc.nextInt();
        }
    }
   
    
    public static void main(String[] args) {
        
        int id;
        String name;
        String color;
        int age;
        boolean molting;
        int choice;
        int count;
        count = 1;
        int locationOfLine;
        locationOfLine=1;
        
        Workbook book = new XSSFWorkbook();
        final String nameOfFile =("Chicken Data.xlsx");
          org.apache.poi.ss.usermodel.Sheet hoja = book.createSheet("Hoja 1");
        Row firstLine = hoja.createRow(0);
        Cell createdfirstCell = firstLine.createCell(0);
        createdfirstCell.setCellValue("Id");
        Cell createdsecondCell = firstLine.createCell(1);
        createdsecondCell.setCellValue("Name");
        Cell createdthirdCell = firstLine.createCell(2);
        createdthirdCell.setCellValue("Color");
        Cell createdfourthCell = firstLine.createCell(3);
        createdfourthCell.setCellValue("Age");
        Cell createdfifthCell = firstLine.createCell(4);
        createdfifthCell.setCellValue("Molting");
                
        header();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("What would you like to do today?");
            System.out.println("======================");
            System.out.println("1.Enter a chicken data");
            System.out.println("2.Read the chicken file");
            System.out.println("3.Exit");
            System.out.println("======================");
            System.out.println("Please choose one-->");
            choice = sc.nextInt();
            choiceVerifier(choice);
            
        switch (choice) {
            case 1 -> {
        
                Chicken chickenForUser;
                chickenForUser = new Chicken();
                System.out.println("|||||||||||||||||||||||||");
                //System.out.println("chicken is of class-->" + chicken.getClass());
                System.out.println("*What's the chicken id?-->\t");
                id = sc.nextInt();
                while (id < 100 || id > 1000) {
                    System.out.println("Invalid ID, please write again-->");
                    id = sc.nextInt();
                }
                System.out.println("*What's the name of the chicken?-->\t");
                name = sc.next();
                System.out.println("*How old is the chicken?-->\t");
                age = sc.nextInt();
                while (age < 0 || age > 15) {
                    System.out.println("Invalid age, please write again-->");
                    age = sc.nextInt();
                }
                System.out.println("*What's the color of the chicken?-->\t");
                color = sc.next();

                System.out.println("*Is chicken molting?(true or false)-->\t");
                molting = sc.nextBoolean();
                System.out.println("|||||||||||||||||||||||||");
                System.out.println("-------------------------");
                chickenForUser.setId(id);
                chickenForUser.setName(name);
                chickenForUser.setAge(age);
                chickenForUser.setColor(color);
                chickenForUser.setIsMolting(molting);
 
                System.out.println("======================");
                System.out.println("Chicken Information No." + count);
                count++;
                chickenForUser= new Chicken(id,name,color,age,molting);
                printChickenData(chickenForUser);
                Row secondRow = hoja.createRow(locationOfLine);
                  Cell firstCell = secondRow.createCell(0);
                  firstCell.setCellValue(id);
                  Cell secondCell = secondRow.createCell(1);
                  secondCell.setCellValue(name);
                  Cell thirdCell = secondRow.createCell(2);
                  thirdCell.setCellValue(color);
                  Cell quarterCell = secondRow.createCell(3);
                  quarterCell.setCellValue(age);
                  Cell fifthCell = secondRow.createCell(4);
                  fifthCell.setCellValue(molting);
                  locationOfLine++;
                System.out.println("-------------------------");
                
              }
            case 2 -> {
                System.out.println("|||||||||||||||||||||||||");
                System.out.println("In maintenance...");
                System.out.println("|||||||||||||||||||||||||");
            }
            
            case 3 -> {
                System.out.println("-------------------------");
                System.out.println("We hope to see you soon");
                System.out.println("Thanks for using our program!");
                System.out.println("-------------------------");
            }

        }

        } while (choice !=3);
        File directorioActual = new File(".");
        String ubicacion = directorioActual.getAbsolutePath();
        String ubicacionArchivoSalida = ubicacion.substring(0, ubicacion.length() - 1) + nameOfFile;
        FileOutputStream outputStream;
        try {
            outputStream = new FileOutputStream(ubicacionArchivoSalida);
            book.write(outputStream);
            book.close();
            System.out.println("File created succefully");
        } catch (FileNotFoundException ex) {
            System.out.println("Error --> do filenotfoum}");
        } catch (IOException ex) {
            System.out.println("Error --> do IOException");
        }
  }      
}                 
