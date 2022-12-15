package ec.edu.espe.Farm.model;

import java.time.LocalDate;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Cow extends FarmAnimal{
    
    private boolean isProducingMilk;
    private boolean isVacunated;

    public Cow(boolean isProducingMilk, boolean isVacunated, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
        this.isVacunated = isVacunated;
    }

    @Override
    public String toString() {
       String cow = "";
        cow = "Cow{" + getId() + "," + getBreed() +
                "," + getBornOn() + "," + "isProducingMilk=" + 
                isProducingMilk + "," + "isVacunated=" + isVacunated + '}';
        return cow;
    }

    @Override
    public void feed(float amountOfFood) {}
    
    public void feed(float amountOfFood, String typeOfFood){
        System.out.println("Feeding an animal with food: " + typeOfFood + ", amount:" + amountOfFood);
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

    /**
     * @return the isVacunated
     */
    public boolean isIsVacunated() {
        return isVacunated;
    }

    /**
     * @param isVacunated the isVacunated to set
     */
    public void setIsVacunated(boolean isVacunated) {
        this.isVacunated = isVacunated;
    }
    
    
}
