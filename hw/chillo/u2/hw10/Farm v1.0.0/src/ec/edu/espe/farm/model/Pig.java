package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class Pig extends FarmAnimal {
    
    public Pig(int id, String breed, LocalDate bronOn) {
        super(id, breed, bronOn);
    }
    
    public void seller(){
        System.out.println("The pig was sold");
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

    @Override
    public String toString() {
        String pig = "";
        pig =  "Pig{" 
            + "id=" + getId() 
            + "breed=" + getBreed()
            + "bornOn=" + getBornOn() 
            + '}';
        return pig;
    } 
}
    