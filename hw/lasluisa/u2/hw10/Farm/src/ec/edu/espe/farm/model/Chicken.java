package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Chicken extends FarmAnimal {

    boolean isMolting;

    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a Chicken: " + amountOfFood);
    }

    public void feed(int amountOfFood) {
        System.out.println("feeding a Chicken: " + amountOfFood);
    }

    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("feeding a chicken with food -> " + typeOfFood + ", amount: " + amountOfFood);
    }
    
    public void layEggs(int amountOfEggs){
        System.out.println("The chicken layed: " + amountOfEggs + " eggs");
    }

    public Chicken(boolean isMolting, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }

    @Override
    public String toString() {
        String chicken = "";
        chicken = "Chicken{" + getId() + ", "
                + getBreed() + ", " + getBornOn() + ", " + "isMolting=" + isMolting + '}';
        return chicken;
    }

}
