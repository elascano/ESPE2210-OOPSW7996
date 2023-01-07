
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Sheep extends FarmAnimal{
    
    private LocalDate lastSheering;
    private float isProduceWool; 
    
    public Sheep(LocalDate lastSheering,float isProduceWool, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
        this.isProduceWool = isProduceWool;
    }
    
    @Override
    public String toString() {
        String sheep="";
        sheep = "Sheep{" + getId()+","
                + getBreed() +","+ getBornOn()+
                "," + "lastSheering=" + lastSheering +
                "," + "isProduceWool(kg)=" + isProduceWool +'}';
        return sheep;
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
    
    /**
     * @return the lastSheering
     */
    public float getIsProduceWool() {
        return isProduceWool;
    }

    /**
     * @param isProduceWool the isProduceWool to set
     */
    public void setIsProduceWool(float isProduceWool) {
        this.isProduceWool = isProduceWool;
    }
    
    //override
    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a Sheep with an float--> " + amountOfFood);
    
    }

    //overloading
    public void feed(float amountOfFood, String typeOfFood){
        System.out.println("feeding a Sheep with food--> " +typeOfFood+ " , amount: "+ amountOfFood);
    }
    
}
