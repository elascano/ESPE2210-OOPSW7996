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
public class Pig extends FarmAnimal {

    private boolean IsReadyToBeSlaughtered;

    public Pig(int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
    }

    public Pig(boolean IsReadyToBeSlaughtered, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.IsReadyToBeSlaughtered = IsReadyToBeSlaughtered;
    }

    @Override
    public String toString() {
        return "Pig{" + getId() + ","
                + getBreed() + "," + getBornOn()  
                + "," + "IsReadyToBeSlaughtered = " + IsReadyToBeSlaughtered + '}';
    }

    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding a Pig with " + amountOfFood);
    }

    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("Feeding a Pig with food -->" + typeOfFood + ", amount: " + amountOfFood);
    }

    /**
     * @return the IsReadyToBeSlaughtered
     */
    public boolean isIsReadyToBeSlaughtered() {
        return IsReadyToBeSlaughtered;
    }

    /**
     * @param IsReadyToBeSlaughtered the IsReadyToBeSlaughtered to set
     */
    public void setIsReadyToBeSlaughtered(boolean IsReadyToBeSlaughtered) {
        this.IsReadyToBeSlaughtered = IsReadyToBeSlaughtered;
    }

}
