/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaxCalculator;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class TaxCalculator {

    public static double calculateTax(double amount) {
        final double taxRate = 0.12;
        return amount * taxRate;
    }

    public static double calculateTotalWithTax(double amount) {
        return amount + calculateTax(amount);
    }
}
