/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Sheep extends FarmAnimal {

    private LocalDate lastSheering;
    private boolean isReadyToShear;

    public Sheep(LocalDate lastSheering, boolean isReadyToShear, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
        this.isReadyToShear = isReadyToShear;
    }

    @Override
    public String toString() {
        return "Sheep{" + getId() + ","
                + getBreed() + "," + getBornOn()+ ","
                + "lastSheering=" + lastSheering + "," + " isReadyToShear=" + "," + isReadyToShear + '}';
    }

    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding a Pig with " + amountOfFood);
    }

    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("Feeding a Pig with food -->" + typeOfFood + ", amount: " + amountOfFood);
    }

   

    /**
     * @return the lastSheering
     */
    public LocalDate getLastSheering() {
        return lastSheering;
    }

    /**
     * @param lastSheering the lastSheering to set
     */
    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
    }

    /**
     * @return the isReadyToShear
     */
    public boolean isIsReadyToShear() {
        return isReadyToShear;
    }

    /**
     * @param isReadyToShear the isReadyToShear to set
     */
    public void setIsReadyToShear(boolean isReadyToShear) {
        this.isReadyToShear = isReadyToShear;
    }

}
