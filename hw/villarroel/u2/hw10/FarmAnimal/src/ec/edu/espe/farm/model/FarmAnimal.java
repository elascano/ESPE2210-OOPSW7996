
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public abstract class FarmAnimal {
    private int id;
    private String breed;
    private LocalDate bornOn;
    private int age;

    
    public int getAgeInMonths(){
        LocalDate now=LocalDate.now();
        int months = Period.between(bornOn, now).getMonths();
        return months;
    }
    
    public abstract void feed(float amountOfFood);
    
    
    public FarmAnimal(int id, String breed, LocalDate bornOn,int age) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "FarmAnimal{"+"id="+getId()+", "+getBreed()+", "+"bornOn="+bornOn+"}";
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

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    
}
