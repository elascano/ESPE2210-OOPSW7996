
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */

public class ChickenFarmSimulator {
    public static void main(String[] args) throws IOException {
       
               
      
       System.out.println ("*********");
        System.out.println ("Matias Suarez");
        System.out.println ("setters and getters");
        System.out.println ("*********");
        
        //AD variableName
        
        int id;
        String name = "";
        int age;
        String color = "";
        boolean molting;
        int menu_option;
        int location;
        location = 1;
        
        //Homework
        
        Chicken chicken;
        Workbook book = new XSSFWorkbook();
        final String nombreArchivo =("Chicken Data.xlsx");
        Sheet hoja = book.createSheet("Hoja 1");
        Row primeraFila = hoja.createRow(0);
        Cell primeraCelda = primeraFila.createCell(0);
        primeraCelda.setCellValue("Id");
        Cell segundaCelda = primeraFila.createCell(1);
        segundaCelda.setCellValue("Name");
        Cell terceraCelda = primeraFila.createCell(2);
        terceraCelda.setCellValue("Color");
        Cell cuartaCelda = primeraFila.createCell(3);
        cuartaCelda.setCellValue("Age");
        Cell quitaCelda = primeraFila.createCell(4);
        quitaCelda.setCellValue("Molting");
        
        Scanner sc = new Scanner(System.in);
         do{
        System.out.println("#########################");
        System.out.println("||||Chicken farm menu||||");
        System.out.println("1.Data entry");
        System.out.println("2.Data reading");
        System.out.println("3.Exit");
        System.out.println("#########################");
        System.out.println("Enter an opinion-->");
        menu_option=sc.nextInt();
        while(menu_option<1||menu_option>3){
            System.out.println("Invalid option, please enter again-->");
              menu_option = sc.nextInt();
        }
         
          switch(menu_option){
              case 1 -> {
                  
                  System.out.println("\nPlease, fill the information below");
                  System.out.println("Enter chicken id-->");
                  id = sc.nextInt();
                  while(id<100||id>1000){
                      System.out.println("Invalid id, please enter again-->");
                      id = sc.nextInt();
                  }
                  System.out.println("Enter chicken name-->");
                  name = sc.next();
                  
                  System.out.println("Enter the age of the chicken-->");
                  age = sc.nextInt();
                  while(age<0||age>15){
                      System.out.println("Invalid age, please enter again-->");
                      age = sc.nextInt();
                  }
                  
                  System.out.println("Enter the colors of the chicken-->");
                  color = sc.next();
                  System.out.println("Is chicken molting?(True/False)-->\t");
                  molting = sc.nextBoolean();
                  
                  chicken = new Chicken(id,name,color,age,molting);
                  printChicken(chicken);
                  
                  Row secondRow = hoja.createRow(location);
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
                  location++;
                  
                }
              case 2 -> System.out.println("In maintenance");
              case 3 -> System.out.println("Thank you for using our system");
              
                  
          }
          
         }while(menu_option!=3);  
         
                  File directorioActual = new File(".");
                  String ubicacion =directorioActual.getAbsolutePath();
                  String ubicacionArchivoSalida = ubicacion.substring(0, ubicacion.length() - 1) + nombreArchivo;
                  FileOutputStream outputStream;
                  try {
                       outputStream = new FileOutputStream(ubicacionArchivoSalida);
                       book.write(outputStream);
                       book.close();
                       System.out.println("File created succefully");
                  }catch (FileNotFoundException ex){
                       System.out.println("Error do filenotfoum}");  
                  }catch (IOException ex){
                       System.out.println("Error do IOException");
             }
    }

    
    private static void printChicken(Chicken chicken) {
        System.out.println("          Chicken"+ chicken.getId() );
        System.out.println("==========================");
        System.out.println("chicken id-->     \t" + chicken.getId());
        System.out.println("chicken name-->\t" + chicken.getName());
        System.out.println("chicken age-->    \t" + chicken.getAge());
        System.out.println("chicken color-->\t" + chicken.getColor());
        System.out.println("chicken is Molting-->\t" + chicken.isIsMolting());
        System.out.println("==========================");
    }  
   
}
    
     
  