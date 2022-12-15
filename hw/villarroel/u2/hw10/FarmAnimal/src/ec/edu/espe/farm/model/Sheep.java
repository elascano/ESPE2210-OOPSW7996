
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Sheep extends FarmAnimal{

    private boolean isShorn;
    private LocalDate lastShering;

    public Sheep(boolean isShorn, LocalDate lastShering, int id, String breed, LocalDate bornOn, int age) {
        super(id, breed, bornOn, age);
        this.isShorn = isShorn;
        this.lastShering = lastShering;
    }
    
    public static boolean shear(boolean isShorn){
        if(isShorn==true)
            System.out.println("The sheep is already shorn ");
        else
            isShorn=true;
        
        return isShorn;
      
    }
    
    @Override
    public String toString() {
        return "cow{" + getId() + ", " + getBreed() + ", " + getBornOn() + ", " + "last Shering = " + lastShering+ ", is Shorn = " + isShorn + "}";
    }
    
   
    
    public void feed(float amountOfFood,String typeOfFood){
        System.out.println("Feeding a sheep with food --> " + typeOfFood + ", amount: " + amountOfFood);
    }

    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding the Animal : " + amountOfFood);
    }

    /**
     * @return the isShorn
     */
    public boolean isIsShorn() {
        return isShorn;
    }

    /**
     * @param isShorn the isShorn to set
     */
    public void setIsShorn(boolean isShorn) {
        this.isShorn = isShorn;
    }

    /**
     * @return the lastShering
     */
    public LocalDate getLastShering() {
        return lastShering;
    }

    /**
     * @param lastShering the lastShering to set
     */
    public void setLastShering(LocalDate lastShering) {
        this.lastShering = lastShering;
    }
    
    
    
}
