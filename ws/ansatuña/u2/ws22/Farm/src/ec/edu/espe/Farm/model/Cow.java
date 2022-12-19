
package ec.edu.espe.Farm.model;

import java.time.LocalDate;

/**
 *
 * @author Karla Ansatuña
 */
public class Cow extends FarmAnimal{
private boolean isProducingMilk;
    public Cow(boolean isProducingMilk,int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
    }
    @Override
    public String toString() {
        String cow="";
        cow="Cow{" +getId()+","
                +getBreed()+","+getBornOn()+"," 
                +"isProducingMilk="+isProducingMilk+"}";
        return cow;
    }
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding a cow :D"+amountOfFood);
    }

    @Override
    public void collectEggs() {
    }

    @Override
    public void collectMilk() {
        System.out.println("15 bottles of milk collected!!");
    }

    @Override
    public void collectChoppedMeat() {
    }

    @Override
    public void collectWool() {
    }
}
