/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class Cow extends FarmAnimal {
    private boolean isProducingMilk;

    public Cow(boolean isProducingMilk, boolean isPregnant, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }
    @Override
    public void feed(float amountOfFood) {
    }
    public void feed(int amountOfFood) {
    }
    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("Cow  --> "+ typeOfFood + ", amount: "+ amountOfFood);
    }
    
    
}