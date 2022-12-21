package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.controller.NaturalPersonController;
import ec.edu.espe.taxes.controller.ProductController;
import ec.edu.espe.taxes.controller.VehicleController;


/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class SalesTax {
    public static void main(String[] args) { 
        System.out.println("NAHIR CARRERA HW10");
        System.out.println("\nCALCULATE IVA (PRODUCT)");
        ProductController.computeIvaTax();
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("\nCALCULATE RENT TAX (NATURAL PERSON)");
        NaturalPersonController.computeRentTax();
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("\nCALCULATE GREEN TAX (VEHICLE)");
        VehicleController.computeGreenTax();
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
