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
public class Pig extends FarmAnimal{
    private float pigWeight;

    public Pig(float pigWeight, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.pigWeight = pigWeight;
    }


    @Override
    public void feed(float amountOfFood) {
    }
    public void feed(int amountOfFood) {
    }
    //overLoading
    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("Pig food --> "+ typeOfFood + ", amount: "+ amountOfFood);
    }
    
    public void weigh(){
        System.out.println("Pig Weight --> "+ pigWeight);
    }
}
