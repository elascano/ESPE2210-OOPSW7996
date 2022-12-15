package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Pig extends FarmAnimal {

    public Pig(int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
    }

    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a pig");
    }

    public void birthOfPiglets(int amountOfBornPiglets) {
        System.out.println("Piglets born : " + amountOfBornPiglets);
    }

    @Override
    public String toString() {
        String pig = "";
        pig = "pig{" + getId() + ", "
                + getBreed() + ", " + getBornOn() + ", " + '}';
        return pig;
    }

}
