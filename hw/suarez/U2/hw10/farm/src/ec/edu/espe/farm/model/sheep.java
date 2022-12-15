
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class sheep extends FarmAnimal {

    private LocalDate lastSheering;
    
    public void feed(float amountOfFood) {
    System.out.println("feeding a sheep with an int: " + amountOfFood+" kilos");
    }
    
    public void collectedWool(int amountOfWool) {
        System.out.println("shave the amount of"+amountOfWool+"meters of wool");
    }

    public sheep(LocalDate lastSheering, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
    }

    @Override
    public String toString() {
        return "sheep{" + "id=" + getId() + ", breed=" + getBreed() + ", bornOn=" + getBornOn() + "lastSheering=" + lastSheering +'}';
    }
   
    /**
     * @return the lastSheering
     */
    public LocalDate getLastSheering() {
        return lastSheering;
    }

    /**
     * @param lastSheering the lastSheering to set
     */
    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
    }
    
    public void collectEggs(int amountOfEggs) {}

    @Override
    public void collectedMilk(float amountOfEggs) {}

    @Override
    public void collectedMeat(int amountOfMeat) {}     

}

