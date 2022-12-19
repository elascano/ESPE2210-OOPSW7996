package ec.edu.espe.Farm.model;

import java.time.LocalDate;

/**
 *
 * @author Karla Ansatuña
 */
public class Sheep extends FarmAnimal{
    private LocalDate lastSheering;

    public Sheep(LocalDate lastSheering, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
    }
        @Override
    public String toString() {
        String sheep="";
        sheep="Sheep{" +getId()+","
                +getBreed()+","+getBornOn()+"," 
                +"lastSheering=" + lastSheering + '}';
        return sheep;
    }
    @Override
    public void feed(float amountOfFood) {
         System.out.println("Feeding a sheep :D"+amountOfFood);
    }

    @Override
    public void collectEggs() {
    }

    @Override
    public void collectMilk() {
    }

    @Override
    public void collectChoppedMeat() {
    }

    @Override
    public void collectWool() {
        System.out.println("8 meters of wool collected");
    }
}
