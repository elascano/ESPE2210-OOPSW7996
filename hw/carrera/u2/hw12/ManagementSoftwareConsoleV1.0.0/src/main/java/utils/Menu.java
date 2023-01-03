
package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Menu {
    public static int printProductOptions(){
    int choosenOption;
    String productMenu = """
                  ______________________________________________________
                 /                                                     / 
             (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                  /''''''''''''''''''''''''''''''''''''''''''''''''''''''/
                 (       "ENTRE HILOS & ALGODON" MANAGMENT SOFTWARE     (
                  )                   PRODUCTS MENU                      )
                 (    -------------------      ----------------------   (
                  )  |      1. ADD       |    |       2.SEARCH       |   )
                      -------------------      ----------------------   (
                  )                                                      )
                 (    -------------------      ----------------------   (
                  )  | 3. PRODUCTS LIST  |    |        4.DELETE      |   )
                 (    -------------------      ----------------------   ( 
                  )                                                      )
                 (    -------------------      ----------------------   (
                  )  |    5. UPDATE      |    |     6.TOTAL COSTS    |   )
                 (    -------------------      ----------------------   (
                 (    -----------------------------------------------   (
                  )  |                    7. EXIT                    |   )
                 (    -----------------------------------------------   (
                 / ''''''''''''''''''''''''''''''''''''''''''''''''''''''/    
             (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                  /______________________________________________________/
                                 WHAT DO YOU WANT TO DO? 
           """;
        System.out.println(productMenu);
        choosenOption = getChoosenOption();
        return choosenOption;
    }
    
    public static int printUpdateOptions(){
        int choosenOption;
        String updateMenu = """
                  ______________________________________________________
                 /                                                     / 
             (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                  /''''''''''''''''''''''''''''''''''''''''''''''''''''''/
                 (       "ENTRE HILOS & ALGODON" MANAGMENT SOFTWARE     (
                  )                       UPDATE                         )
                 (    -------------------      ----------------------   (
                  )  |     1. NAME       |    |     2.DESCRIPTION    |   )
                      -------------------      ----------------------   (
                  )               --------------------------             )
                 (               |         3. COST          |           (
                  )               --------------------------             )
                  )               --------------------------             )
                 (               |       4. MATERIALS       |           (
                  )               --------------------------             )
                  )               --------------------------             )
                 (               |      5. WORKING TIME     |           (
                  )               --------------------------             )
                  )               --------------------------             )
                 (               |       6. QUANTITY        |           (
                  )               --------------------------             )
                 / ''''''''''''''''''''''''''''''''''''''''''''''''''''''/    
             (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                  /______________________________________________________/
                                 WHAT DO YOU WANT TO UPDATE? 
           """;
        System.out.println(updateMenu);
        choosenOption = getChoosenOption();
        return choosenOption;
    }
    
    private static int getChoosenOption(){
        int choosenOption;
        Scanner scannerKeyboard = new Scanner(System.in);
        try{
            choosenOption = scannerKeyboard.nextInt();
            return choosenOption;
        }catch (InputMismatchException error){
            System.out.println("Enter a valid number");
            choosenOption = 0;
            return choosenOption;
        }
    }
}
