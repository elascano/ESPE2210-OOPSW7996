/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SingletonInGUI.controller;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class ComputeCaliTaxes {

    private static ComputeCaliTaxes instance;

    private ComputeCaliTaxes() {

    }

    public static ComputeCaliTaxes getInstance() {
        if (instance == null) {
            instance = new ComputeCaliTaxes();
        }
        return instance;
    }

    public double computeTaxes(double price) {

        double californiaTaxes = 0.133;
        double totalPrice;

        totalPrice = (californiaTaxes * price)+price;

        return totalPrice;

    }

}
