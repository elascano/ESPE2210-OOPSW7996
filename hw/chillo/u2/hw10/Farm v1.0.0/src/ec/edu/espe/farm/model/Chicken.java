package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class Chicken extends FarmAnimal{
    
    private boolean isMolting;
    
    public void color(String colorChicken){
        System.out.println("Color of Chicken is " + colorChicken);
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

    public Chicken(boolean isMolting, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }

    @Override
    public String toString() {
        String chicken = "";
        chicken = "Chicken{"
                + "id=" + getId()
                + ", breed=" + getBreed()
                + ", bornOn=" + getBornOn()
                + ", isMoolting=" + isMolting
                + '}';
        return chicken;
    }
}
