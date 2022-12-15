/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Sheep extends FarmAnimal {
    private LocalDate lastSheering;
    private boolean baby;

    public Sheep(LocalDate lastSheering, boolean baby, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
        this.baby = baby;
    }

    @Override
    public void feed(float amountOfFood) {
    }
    public void feed(int amountOfFood) {
    }
    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("Sheep feed --> "+ typeOfFood + ", amount: "+ amountOfFood);
    }
    public void pregnat(){
        System.out.println("Sheep breeding?  "+ baby);
    }
    
    
}