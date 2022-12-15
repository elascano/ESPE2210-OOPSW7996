package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Cow extends FarmAnimal {

    private boolean isProducingMilk;

    public Cow(boolean isProducingMilk, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public String toString() {
        return "Cow{" + getId() + ","
                + getBreed() + "," + getBornOn()
                + "," + "isProducingMilk=" + isProducingMilk + '}';
    }

    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a cow with float " + amountOfFood);
    }

    @Override
    public void orderMilk(float numLitersMilk) {
        System.out.println(numLitersMilk + " liters of milk were ordered");
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

    @Override
    public void collectEggs(int numEggs) {
    }

    @Override
    public void obtainBeacon(float numKgBeacon) {
    }
    
    @Override
    public void woolgathering(int numWool) {
    }

}
