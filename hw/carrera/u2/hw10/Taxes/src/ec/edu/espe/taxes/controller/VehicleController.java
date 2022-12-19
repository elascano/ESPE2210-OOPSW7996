package ec.edu.espe.taxes.controller;

import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Vehicle;
import java.util.Scanner;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class VehicleController {
    public static void computeGreenTax(){
        Vehicle vehicleWithTax;
        float greenTax;
        
        vehicleWithTax = createVehicle();
        greenTax = Tax.computeGreenTax( vehicleWithTax.getCylinderCapacity(), vehicleWithTax.getYear());
        vehicleWithTax.setGreenTax(greenTax);
        System.out.println("> GREEN TAX ->"+ vehicleWithTax.getGreenTax());
    }
    
    private static Vehicle createVehicle(){
        Scanner keyboardScanner;
        keyboardScanner = new Scanner(System.in);
        int year;
        float cylinderCapacity;
        Vehicle vehicle;
        System.out.println("""
                           ----------- VEHICLE ----------
                            Enter the information below
                           """);
        System.out.print(" YEAR -> ");
        year = keyboardScanner.nextInt();
        System.out.print(" CC -> ");
        cylinderCapacity = keyboardScanner.nextFloat();
        System.out.println("-----------------------------");
        vehicle = new Vehicle(year, cylinderCapacity, 0);
        return vehicle;
    } 
}
