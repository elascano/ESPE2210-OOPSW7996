
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Pig extends FarmAnimal{
    
    private int poop;

    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding the Animal : " + amountOfFood);
    }
    public void feed(float amountOfFood,String typeOfFood){
        System.out.println("Feeding a pig with food --> " + typeOfFood + ", amount: " + amountOfFood);
    }
    
    
    @Override
    public String toString() {
        return "Pig{" + getId() + ", " + getBreed() + ", " + getBornOn() + ", " + "poop Produced = " + poop+ "}";
    }

    public Pig(int poop, int id, String breed, LocalDate bornOn, int age) {
        super(id, breed, bornOn, age);
        this.poop = poop;
    }
    
    public float poopProduced(float food){
        float poop;
        poop=(food*3)/4;
        return poop;
    }
    

    /**
     * @return the poop
     */
    public int getPoop() {
        return poop;
    }

    /**
     * @param poop the poop to set
     */
    public void setPoop(int poop) {
        this.poop = poop;
    }
    
    
}
