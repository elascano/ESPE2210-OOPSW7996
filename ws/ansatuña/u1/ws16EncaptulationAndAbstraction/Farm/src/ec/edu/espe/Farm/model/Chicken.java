
package ec.edu.espe.Farm.model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Karla Ansatuña
 */
public class Chicken extends FarmAnimal{
    private boolean isMolting;

    public Chicken(boolean isMolting, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }

    @Override
    public String toString() {
        String chicken="";
        chicken="Chicken{" +getId()+","
                +getBreed()+","+getBornOn()+"," 
                +"isMolting=" + isMolting + '}';
        return chicken;
    }

    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding a chicken :D"+amountOfFood);
    }

    @Override
    public void collectEggs() {
        System.out.println("it layed 14 eggs!");
    }

    @Override
    public void collectMilk() {
    }

    @Override
    public void collectChoppedMeat() {
    }

    @Override
    public void collectWool() {
    }
}
