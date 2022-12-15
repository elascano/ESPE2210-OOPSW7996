package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Chicken extends FarmAnimal {

    private boolean isMolting;
    private boolean isReadyToBeSlaughter;

    public Chicken(boolean isMolting, boolean isReadyToSlaughter, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        this.isReadyToBeSlaughter = isReadyToSlaughter;
    }

    @Override
    public String toString() {
        String chicken = "";
        chicken = "Chicken{" + getId() + ","
                + getBreed() + "," + getBornOn() + ","
                + "isMolting=" + isMolting +","
                +"IsReadyToSlaugher? ->" +isReadyToBeSlaughter+ '}';
        return chicken;
    }

    //POLYMORPHISM   
    //override
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding a Chicken with the amount of "+amountOfFood+" gr.");
    }
    //overload
    public void feed(float amoutOfFood, String typeOfFood){
        System.out.println("Feeding the animal with -> "+typeOfFood+" with the amount of -> " +amoutOfFood+" gr.");
    }

}
