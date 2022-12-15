package ec.edu.espe.Exceptions.utils;

import ec.edu.espe.Exceptions.model.Helper;
import java.util.Scanner;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Exceptions {
    
    public void Exceptions(Scanner scan, int provinceCode) {
        int idCard;
        try {
            idCard = scan.nextInt();
            try {
                Helper helper = new Helper();

                helper.validateIdCard(provinceCode, idCard);
                System.out.println("Your identity card if it belongs to the province of Pichincha");

            } catch (CustomException e) {
                System.err.println("Can't register the Id Card, because :" + e.getMessage());
            }
        } catch (java.util.InputMismatchException e) {
            System.err.println("Can't register the Id Card, because you have entered a String data or long integer");
        }
    }
}
