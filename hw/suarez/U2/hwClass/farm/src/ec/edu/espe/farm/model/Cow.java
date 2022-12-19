
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Cow extends FarmAnimal {
    
    private boolean isProducingMilk;

    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a Cow with: " + amountOfFood);
    }
    
    public void collectedMilk(float amountOfMilk) {
        System.out.println("amount of milk :" + amountOfMilk + "liters");
    }

    public Cow(boolean isProducingMilk, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public String toString() {
        return "Cow{ " + getId() + "," + getBreed()
                + "," + getBornOn() + " isProducingMilk= " + isProducingMilk + '}';
    }

    /**
     * @return the isProducingMilk
     */
    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }

    public void collectEggs(int amountOfEggs) {}
    
    public void collectedMeat(int amountOfMeat) {}

    @Override
    public void collectedWool(int amountOfWool) {}
}
