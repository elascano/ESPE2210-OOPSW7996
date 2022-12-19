/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.taxes.model;

import java.time.LocalDate;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Vehicle {
    
    private int numberOfCylindrical;
    private LocalDate purchase;

    @Override
    public String toString() {
        return "Vehicle{" + "numberOfCylindrical=" + numberOfCylindrical + ", purchase=" + purchase + '}';
    }

    public Vehicle(int numberOfCylindrical, LocalDate purchase) {
        this.numberOfCylindrical = numberOfCylindrical;
        this.purchase = purchase;
    }

    /**
     * @return the cylindricalNumber
     */
    public int getNumberOfCylindrical() {
        return numberOfCylindrical;
    }

    /**
     * @param numberOfCylindrical the cylindricalNumber to set
     */
    public void setNumberOfCylindrical(int numberOfCylindrical) {
        this.numberOfCylindrical = numberOfCylindrical;
    }

    /**
     * @return the purchaseOn
     */
    public LocalDate getPurchase() {
        return purchase;
    }

    /**
     * @param purchase the purchaseOn to set
     */
    public void setPurchase(LocalDate purchase) {
        this.purchase = purchase;
    }
    
}
