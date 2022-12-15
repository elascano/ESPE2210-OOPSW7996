/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Cow extends FarmAnimal{
    
    private boolean isProducingMilk;
    private boolean isVaccinated;

    public Cow( boolean isProducingMilk,boolean isVaccinated,int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
        this.isVaccinated = isVaccinated ;
    }

    @Override
    public String toString() {
        return "Cow{" + getId() + ","
                + getBreed() + "," + getBornOn() + ","
                + " isMolting = " + " isProducingMilk = " + isProducingMilk + ","+ " isVaccinated = " + isVaccinated + '}';
    }

    @Override
    public void feed (float amountOfFood){
        System.out.println("Feeding a Cow with "+ amountOfFood);
    }
    
    
    
    public void feed (float amountOfFood, String typeOfFood){
        System.out.println("Feeding a Cow with food -->" + typeOfFood + ", amount: "+ amountOfFood );
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
     * @return the isVaccinated
     */
    public boolean isIsVaccinated() {
        return isVaccinated;
    }

    /**
     * @param isVaccinated the isVaccinated to set
     */
    public void setIsVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }
    
}
