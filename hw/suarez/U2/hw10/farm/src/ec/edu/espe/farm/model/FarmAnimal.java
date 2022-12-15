    
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public abstract class FarmAnimal {
    
    private int id;
    private String breed;
    private LocalDate bornOn;
    
    public int getAgeInMonths(){
       LocalDate now = LocalDate.now();
       int months =0;
       months = Period.between(bornOn,now).getMonths();
        return months;
    }
    public abstract void feed(float amountOfFood);
    
    public abstract void collectEggs(int amountOfEggs);
    
    public abstract void collectedMilk(float amountOfMilk);
    
    public abstract void collectedMeat(int amountOfMeat);

    public abstract void collectedWool(int amountOfWool);
    
    public FarmAnimal(int id, String breed, LocalDate bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", bornOn=" + bornOn + '}';
    }
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the bornOn
     */
    public LocalDate getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(LocalDate bornOn) {
        this.bornOn = bornOn;
    }
    
    
}
