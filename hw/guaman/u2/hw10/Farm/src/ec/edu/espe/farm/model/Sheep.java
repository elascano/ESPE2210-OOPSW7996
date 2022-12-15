package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Sheep extends FarmAnimal {

    private LocalDate lastShering;

    public Sheep(LocalDate lastShering, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastShering = lastShering;
    }

    @Override
    public String toString() {
        return "Sheep{" + getId() + ","
                + getBreed() + "," + getBornOn()
                + "," + "lastShering=" + lastShering + '}';
    }

    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a sheep with float " + amountOfFood);
    }
    
    @Override
    public void woolgathering(int numWool){
        System.out.println(numWool + " wool stamens were collected");
    }

    /**
     * @return the lastShering
     */
    public LocalDate getLastShering() {
        return lastShering;
    }

    /**
     * @param lastShering the lastShering to set
     */
    public void setLastShering(LocalDate lastShering) {
        this.lastShering = lastShering;
    }

    @Override
    public void collectEggs(int numEggs) {
    }

    @Override
    public void orderMilk(float numLitersMilk) {
    }

    @Override
    public void obtainBeacon(float numKgBeacon) {
    }
}
