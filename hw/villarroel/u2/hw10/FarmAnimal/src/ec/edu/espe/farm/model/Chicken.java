
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Chicken extends FarmAnimal {

    private boolean isMolting;
    
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding the Animal : " + amountOfFood);
    }
    
    public void feed(float amountOfFood,String typeOfFood){
        System.out.println("Feeding a chicken with food --> " + typeOfFood + ", amount: " + amountOfFood);
    }
    
    
    public Chicken(boolean isMolting,int id, String breed, LocalDate bornOn, int age) {
        super(id, breed, bornOn, age);
        this.isMolting = isMolting;
    }
    
    public int putEgg(int egg){
        egg++;
        return egg;
    }
    
    

    @Override
    public String toString() {
        return "Chicken{" + getId() + ", " + getBreed() + ", " + getBornOn() + ", " + "isMolting = " + isMolting + "}";
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

    



}
