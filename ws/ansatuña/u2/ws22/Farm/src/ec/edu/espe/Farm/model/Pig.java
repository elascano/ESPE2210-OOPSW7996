package ec.edu.espe.Farm.model;

import java.time.LocalDate;

/**
 *
 * @author Karla Ansatuña
 */
public class Pig extends FarmAnimal{

    public Pig(int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
    }

    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding the pig :3"+amountOfFood);
    }

    @Override
    public void collectEggs() {
    }

    @Override
    public void collectMilk() {
    }

    @Override
    public void collectChoppedMeat() {
        System.out.println("17 chopped meats collected :c");
    }

    @Override
    public void collectWool() {
    }
}
