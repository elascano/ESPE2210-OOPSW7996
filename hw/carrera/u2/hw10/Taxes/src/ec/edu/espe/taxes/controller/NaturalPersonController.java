package ec.edu.espe.taxes.controller;

import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.NaturalPerson;
import java.util.Scanner;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class NaturalPersonController {
    public static void computeRentTax(){
        NaturalPerson personWithTax;
        float rentTax;

        personWithTax = createPerson();
        rentTax = Tax.computeRentTax(personWithTax.getAnnualSalary(), personWithTax.getPersonalExpenses(), personWithTax.getWithholdings());
        personWithTax.setRentTax(rentTax);
        System.out.print("> RENT TAX ->" + personWithTax.getRentTax());
    }
    
    private static NaturalPerson createPerson(){
        Scanner keyboardScanner;
        keyboardScanner = new Scanner(System.in);
        float annualSalary;
        float personalExpenses;
        float withholdings;
        NaturalPerson person;
        System.out.println("""
                           ----------- PERSON ----------
                            Enter the information below
                           """);
        System.out.print("ANNUAL SALARY -> ");
        annualSalary = keyboardScanner.nextFloat();
        System.out.print("PERSONAL EXPENSES -> ");
        personalExpenses = keyboardScanner.nextFloat();
        System.out.print("WITHHOLDINGS -> ");
        withholdings = keyboardScanner.nextFloat();
        System.out.println("-----------------------------");
        person = new NaturalPerson(annualSalary, personalExpenses, withholdings, 0);
        return person;
    }
}
