package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Cow extends FarmAnimal {

    private boolean isProducingMilk;
    private boolean isWearingIdentificationTag;

    public Cow(boolean isProducingMilk, boolean isWearingIdentificationTag, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
        this.isWearingIdentificationTag = isWearingIdentificationTag;
    }
    

    @Override
    public String toString() {
        String cow = "";
        cow = "Cow{" + getId() + ","
                + getBreed() + "," + getBornOn() + ","
                + "isProducingMilk? ->" + isProducingMilk +","
                +"IsWearingIdentificationTag? ->" +isWearingIdentificationTag+ '}';
        return cow;
    }

    //override
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding the Cow with the amount of "+amountOfFood+" lb.");
    }
    //overload
    public void feed(float amoutOfFood, String typeOfFood){
        System.out.println("Feeding the Cow with -> "+typeOfFood+" with the amount of -> " +amoutOfFood+" lb.");
    }

}
