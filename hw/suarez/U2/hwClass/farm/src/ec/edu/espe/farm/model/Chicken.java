
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Chicken extends FarmAnimal {

    private boolean isMolting;

    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a Chicken with: " + amountOfFood);
    }

    public void feed(int amountOfFood) {
        System.out.println("feeding a Chicken with an int: " + amountOfFood);
    }
    
    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("feeding an animal with food ->" + typeOfFood + "  amount: " + amountOfFood);
    }

    @Override
    public void collectEggs(int amountOfEggs) {
        System.out.println("number of eggs collected: " + amountOfEggs);

    }

    public Chicken(boolean isMolting, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }

    @Override
    public String toString() {
        String chicken;
        chicken = "Chicken{" + getId() + "," + getBreed()
                + "," + getBornOn() + " isMolting= " + isMolting + '}';
        return (chicken);
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

    public void collectedMilk(float amountOfEggs) {}

    @Override
    public void collectedMeat(int amountOfMeat) {}

    @Override
    public void collectedWool(int amountOfWool) {}      
}
