package ec.edu.espe.Farm.model;

import java.time.LocalDate;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Chicken extends FarmAnimal{
    
    private boolean isMolting;
    private boolean layAnEgg;
    
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding a Chicken with: " + amountOfFood);
    }
    
    public void feed(int amountOfFood) {
        System.out.println("Feeding a Chicken with: " + amountOfFood);
    }
    
    public void feed(float amountOfFood, String typeOfFood){
        System.out.println("Feeding an animal with food: " + typeOfFood + ", amount:" + amountOfFood);
    }

    public Chicken(boolean isMolting, boolean layAnEgg, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        this.layAnEgg = layAnEgg;
    }


    @Override
    public String toString() {
        String chicken = "";
        chicken = "Chicken{" + getId() + ","
                + getBreed() + "," + getBornOn() + "," + 
                "isMolting=" + isIsMolting() + "," + "layAnEgg=" + isLayAnEgg() + '}';
        return chicken;
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

    /**
     * @return the layAnEgg
     */
    public boolean isLayAnEgg() {
        return layAnEgg;
    }

    /**
     * @param layAnEgg the layAnEgg to set
     */
    public void setLayAnEgg(boolean layAnEgg) {
        this.layAnEgg = layAnEgg;
    }

}
