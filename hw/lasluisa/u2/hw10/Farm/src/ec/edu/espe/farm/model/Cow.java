package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Cow extends FarmAnimal {

    boolean isProducingMilk;

    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a cow");
    }

    public void takeMilk(float amountOfMilk) {
        System.out.println("The amount of milk extracted is: " + amountOfMilk);
    }

    public Cow(boolean isProducingMilk, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public String toString() {
        String cow = "";
        cow = "Cow{" + getId() + ", "
                + getBreed() + ", " + getBornOn() + ", " + "isProducingMilk=" + isProducingMilk + '}';
        return cow;
    }

}
