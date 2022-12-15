/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Hw10Farm.model;

import java.time.LocalDate;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Cow extends FarmAnimal {
    private boolean isProducingMilk;
    private boolean isPregnat;

    public Cow(boolean isProducingMilk, boolean isPregnat, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
        this.isPregnat = isPregnat;
    }
    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeeding a Cow whith  a float"+ amountOfFood);
    }
    public void feed(int amountOfFood) {
        System.out.println("feeeding a Cow whith an int "+ amountOfFood);
    }
    //overLoading
    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("feeeding a Cow --> "+ typeOfFood + ", amount: "+ amountOfFood);
    }
    
    public void pregnat(){
        System.out.println("The cow is Pregnat?  "+ isPregnat);
    }
    
}
