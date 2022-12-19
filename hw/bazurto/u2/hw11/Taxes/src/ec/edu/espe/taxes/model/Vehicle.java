/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.taxes.model;

import java.time.LocalDate;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Vehicle {
    private int ccNumber;
    private LocalDate shopData;

    public Vehicle(int ccNumber, LocalDate shopData) {
        this.ccNumber = ccNumber;
        this.shopData = shopData;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "ccNumber=" + ccNumber + ", shopData=" + shopData + '}';
    }
    

    /**
     * @return the ccNumber
     */
    public int getCcNumber() {
        return ccNumber;
    }

    /**
     * @param ccNumber the ccNumber to set
     */
    public void setCcNumber(int ccNumber) {
        this.ccNumber = ccNumber;
    }

    /**
     * @return the shopData
     */
    public LocalDate getShopData() {
        return shopData;
    }

    /**
     * @param shopData the shopData to set
     */
    public void setShopData(LocalDate shopData) {
        this.shopData = shopData;
    }
    
}
