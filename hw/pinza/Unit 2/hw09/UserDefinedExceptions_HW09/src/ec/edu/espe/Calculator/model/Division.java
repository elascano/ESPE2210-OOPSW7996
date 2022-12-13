/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Calculator.model;

import ec.edu.espe.Calculator.utils.DivideByZeroException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Division {

    private int dividend;
    private int divisor;
    private double quotient;
    private double remainder;

    Scanner scan = new Scanner(System.in);

    public static void dividentDifferentFromZero(int dividend) throws DivideByZeroException {
        if (dividend == 0) {
            throw new DivideByZeroException("Error, a division by zero is not possible to do");
        }
    }

    public int getDividend() {
        return dividend;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public double getQuotient() {
        return quotient;
    }

    public void setQuotient(double quotient) {
        this.quotient = quotient;
    }

    public double getRemainder() {
        return remainder;
    }

    public void setRemainder(double remainder) {
        this.remainder = remainder;
    }

    public void newDivision() {
        Division divisionOperation = new Division();
        System.out.println("Please, enter the dividend: ");
        divisionOperation.setDividend(scan.nextInt());
        System.out.println("Please, enter the divisor: ");
        divisionOperation.setDivisor(scan.nextInt());

        try {
            dividentDifferentFromZero(divisionOperation.getDivisor());
        } catch (DivideByZeroException ex) {
            Logger.getLogger(Division.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("The result is: ");
        double divisionQuotient = divisionOperation.getDividend() / divisionOperation.getDivisor();
        divisionOperation.setQuotient(divisionQuotient);
        double divisionReminder = divisionOperation.getDividend() % divisionOperation.getDivisor();
        divisionOperation.setRemainder(divisionReminder);

        System.out.println("Quotient ->" + divisionOperation.getQuotient());
        System.out.println("Reminder ->" + divisionOperation.getRemainder());
    }

}
