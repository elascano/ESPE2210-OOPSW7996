package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Pig extends FarmAnimal {

    private boolean isProducingButter;

    public Pig(boolean isProducingButter, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingButter = isProducingButter;
    }

    @Override
    public String toString() {
        String pig = "";
        pig = "Pig{" + getId() + ","
                + getBreed() + "," + getBornOn() + ","
                +"IsProducingButter? ->" +isProducingButter+ '}';
        return pig;
    }

    //override
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding the Pig with the amount of "+amountOfFood+" lb.");
    }
    //overload
    public void feed(float amoutOfFood, String typeOfFood){
        System.out.println("Feeding the Pig with -> "+typeOfFood+" with the amount of -> " +amoutOfFood+" lb.");
    }

}
