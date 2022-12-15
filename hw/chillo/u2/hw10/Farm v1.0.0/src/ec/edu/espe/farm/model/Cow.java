package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class Cow extends FarmAnimal{
    
    private boolean isProducingMilk;
    
    public void countLitersMilk(float litersMilk){
        System.out.println("Today I milk " + litersMilk + "liters");
    }

    public Cow(boolean isProducingMilk, int id, String breed, LocalDate bronOn) {
        super(id, breed, bronOn);
        this.isProducingMilk = isProducingMilk;
    }
    
    //Override
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding a Chicken with " + amountOfFood);
    }

    //Change type of parameter    
    public void feed(int amountOfFood) {
        System.out.println("Feeding a Chicken with " + amountOfFood);
    }

    //overloading
    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("Feeding a chicken with " + amountOfFood + " of " + typeOfFood);
    }

    @Override
    public String toString() {
        String cow= "";
        cow = "Cow{" 
            + "id=" + getId()
            + "breed=" + getBreed()
            + "bornOn=" + getBornOn()
            + "isProducingMilk=" + isProducingMilk + '}';
        return cow;
    }
    
    
    
}
