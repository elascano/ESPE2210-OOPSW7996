package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Chicken extends FarmAnimal {

    private boolean isMolting;

    //override
    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a chicken with float " + amountOfFood);
    }

    //overlading
    public void feed(int amountOfFood) {
        System.out.println("feeding a chicken whith int " + amountOfFood);
    }

    //overlading
    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("feeding a animal with food --> " + typeOfFood + ", amount: " + amountOfFood);
    }

    public Chicken(boolean isMolting, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }

    @Override
    public String toString() {
        String chicken;
        chicken = "Chicken{" + getId() + ","
                + getBreed() + "," + getBornOn()
                + "," + "isMolting=" + isMolting + '}';
        return chicken;
    }

    @Override
    public void collectEggs(int numEggs) {
        System.out.println(numEggs + " eggs were collected ");
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    @Override
    public void orderMilk(float numLitersMilk) {
    }
    
    @Override
    public void obtainBeacon(float numKgBeacon) {
    }
    
    @Override
    public void woolgathering(int numWool) {
    }

}
