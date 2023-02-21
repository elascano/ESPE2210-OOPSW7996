package ec.edu.espe.Singleton.view;
import ec.edu.espe.Singleton.controller.USTaxController;
import ec.edu.espe.Singleton.model.USTax;
import java.util.Scanner;

/**
 *
 * @author Leonardo Yaranga, ProgressTeam, DCOO-ESPE
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("     *****hw20Singleton*****");
        System.out.println("*****Leonardo Yaranga OOP 7996*****");
        System.out.println("");
        USTax tax = USTax.getInstance(); //UTAH iva
        tax.modifyTax(0.0485F);
        USTax tax1 = USTax.getInstance();
tax1.modifyTax(0.045F);
 System.out.println("UTAHTax==>" + tax.getTaxValue());

        System.out.println("Enter the value of the product");
        Scanner inputData = new Scanner(System.in);

        float value = inputData.nextFloat();
        System.out.println("UTAHTax==>" + tax.getTaxValue());

        System.out.println("Value with UTAHTax ==>" + USTaxController.salesTotal(value,tax1.getTaxValue()));
    }

}
