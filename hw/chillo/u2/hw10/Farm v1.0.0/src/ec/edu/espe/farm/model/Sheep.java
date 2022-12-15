package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class Sheep extends FarmAnimal{
    
    private LocalDate lastSheering;
    
    public void cutWool(){
        System.out.println("The wool of the sheep was cut");
    }
    
    //Override
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding a pig with " + amountOfFood);
    }

    //Change type of parameter    
    public void feed(int amountOfFood) {
        System.out.println("Feeding a pig with " + amountOfFood);
    }

    //overloading
    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("Feeding a pig with " + amountOfFood + " of " + typeOfFood);
    }

    public Sheep(LocalDate lastSheering, int id, String breed, LocalDate bronOn) {
        super(id, breed, bronOn);
        this.lastSheering = lastSheering;
    }

    @Override
    public String toString() {
        String sheep = "";
        sheep = "Sheep{" 
                + "id=" + getId()
                + "breed=" + getBreed()
                + "bornOn=" + getBornOn()
                + "lastSheering=" + lastSheering 
                + '}';
        return sheep;
    } 
}
