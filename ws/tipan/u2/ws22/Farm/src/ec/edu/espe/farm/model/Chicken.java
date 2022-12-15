
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Chicken extends FarmAnimal {
    
    private boolean isMolting;

    public Chicken(boolean isMolting, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }

    @Override
    public String toString() {
        String chicken="";
        chicken = "Chicken{" + getId()+","
                + getBreed() +","+ getBornOn()+
                "," + "isMolting=" + isMolting + '}';
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
    
    //override
    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a Chicken with a float " + amountOfFood);
    }
    
    //overloading
    public void feed(int amountOfFood) {
        System.out.println("feeding an animal with an int " + amountOfFood);
    }
    
    //overloading
    public void feed(float amountOfFood, String typeOfFood){
        System.out.println("feeding an animal with food--> " +typeOfFood+ " , amount: "+ amountOfFood);
    }
 
}
