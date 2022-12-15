package ec.edu.espe.Farm.model;

import java.time.LocalDate;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Sheep extends FarmAnimal{
    
    private boolean isShear;
    private boolean isWoolly;
    private LocalDate lastSheering; 
    
    @Override
    public void feed(float amountOfFood) {}
    
    public void feed(float amountOfFood, String typeOfFood){
        System.out.println("Feeding the sheep with food: " + typeOfFood + ", amount: " + amountOfFood);
    }

    @Override
    public String toString() {
        String sheep = "";
        sheep = "Sheep{" + getId() + "," + getBreed() + "," + 
                getBornOn() + "," + "isShear=" + isShear + 
                "," + "isWoolly=" + isWoolly + "," + "lastSheering=" 
                + lastSheering + '}';
        return sheep;
    }
    
    public Sheep(LocalDate lastSheering, boolean isShear, boolean isWoolly, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isShear = isShear;
        this.isWoolly = isWoolly;
        this.lastSheering = lastSheering;
    }

    /**
     * @return the isShear
     */
    public boolean isIsShear() {
        return isShear;
    }

    /**
     * @param isShear the isShear to set
     */
    public void setIsShear(boolean isShear) {
        this.isShear = isShear;
    }

    /**
     * @return the isWoolly
     */
    public boolean isIsWoolly() {
        return isWoolly;
    }

    /**
     * @param isWoolly the isWoolly to set
     */
    public void setIsWoolly(boolean isWoolly) {
        this.isWoolly = isWoolly;
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
}
