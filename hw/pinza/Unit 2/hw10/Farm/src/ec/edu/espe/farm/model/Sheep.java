package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Sheep extends FarmAnimal {

    private LocalDate lastSheering;
    private boolean isReadyToShear;

    public Sheep(LocalDate lastSheering, boolean isReadyToShear, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
        this.isReadyToShear = isReadyToShear;
    }


    public LocalDate getLastSheering() {
        return lastSheering;
    }

    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
    }

    public boolean isIsReadyToShear() {
        return isReadyToShear;
    }

    public void setIsReadyToShear(boolean isReadyToShear) {
        this.isReadyToShear = isReadyToShear;
    }
    
    @Override
    public String toString() {
        String sheep = "";
        sheep = "Sheep{" + getId() + ","
                + getBreed() + "," + getBornOn() + ","
                + "isReadyToShear? ->" + isReadyToShear +","
                +"lastSheeringDate ->" +lastSheering+ '}';
        return sheep;
    }

    //override
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding the Sheep with the amount of "+amountOfFood+" lb.");
    }
    //overload
    public void feed(float amoutOfFood, String typeOfFood){
        System.out.println("Feeding the Sheep with -> "+typeOfFood+" with the amount of -> " +amoutOfFood+" lb.");
    }

}
