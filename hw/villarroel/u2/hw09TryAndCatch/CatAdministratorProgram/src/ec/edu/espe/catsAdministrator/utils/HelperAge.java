
package ec.edu.espe.catsAdministrator.utils;

import java.util.Scanner;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class HelperAge {
    public static int validAge(int age,Scanner scan) throws CustomException{
        
        
        while(age<0 || age>20){
            System.out.println("The age you entered is not valid, please re-enter the age:");
            age=scan.nextInt();
            if(age<0 || age>20)
                   throw new CustomException("The age is not valid.");
        }
        
        
        
        return age;
    }
}
