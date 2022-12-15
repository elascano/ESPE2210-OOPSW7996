package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Sheep extends FarmAnimal{
    
    LocalDate lastSheering;
    float lanaGiveSheep;
    
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding a Sheep with: " + amountOfFood);
    }

    public void feed(int amountOfFood) {
        System.out.println("Feeding a Sheep with: " + amountOfFood);
    }

    public void feed(float amountOfFood, String typeOfFood){
        System.out.println("Feeding a Sheep with food: " + typeOfFood + ", amount:" + amountOfFood);
    }

    public Sheep(LocalDate lastSheering, float lanaGiveSheep, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
        this.lanaGiveSheep = lanaGiveSheep;
    }
    
    @Override
    public String toString() {
        return "Sheep{" + getId() + ", "
                + getBreed() + ", " + getBornOn()
                + ", " + "isProducingMilk = " + lastSheering + '}';
    }
    
    public void giveWool() {
        System.out.println("The sheep gave " + lanaGiveSheep + " kilos of woolen");
    }
    
}
