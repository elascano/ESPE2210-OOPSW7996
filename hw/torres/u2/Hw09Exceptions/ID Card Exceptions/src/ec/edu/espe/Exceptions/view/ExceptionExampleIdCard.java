package ec.edu.espe.Exceptions.view;

import ec.edu.espe.Exceptions.utils.Exceptions;
import java.util.Scanner;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class ExceptionExampleIdCard {

    public static void main(String[] args) {
        
        int provinceCode;
        provinceCode = 17;
        System.out.println("Please enter a citizenship card belonging to the province of Pichincha");
        Scanner scan = new Scanner(System.in);
        Exceptions exceptions = new Exceptions();
        exceptions.Exceptions(scan, provinceCode);

    }

    
}
