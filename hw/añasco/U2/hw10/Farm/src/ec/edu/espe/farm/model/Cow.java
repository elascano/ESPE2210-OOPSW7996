/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;


import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Cow extends FarmAnimal{
    
    private boolean isProducingMilk;

    public Cow(boolean isProducingMilk, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a Cow with " + amountOfFood + " lb");
    }

    @Override
    public String toString() {
        return "Cow{id: " + id + ", breed: " + getBreed() + ", birth date: " + getBornOn() + ", isProducingMilk: " + isProducingMilk + '}';
    }
    
    public void getAmountOfMilk(){
        if(isProducingMilk==true){
            System.out.println("The amount of milk in liters are: " + Math.random());
        }else{
            System.out.println("The cow is not currently avaliable to produce milk. ");
        }
    }
}
