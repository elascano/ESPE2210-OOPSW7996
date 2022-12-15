package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Chicken extends FarmAnimal{
    
    boolean isMolting;
    int counterEggs;

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
    
    //Constructor
    public Chicken(boolean isMolting, int counterEggs, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        this.counterEggs = counterEggs;
    }

    @Override
    public String toString() {
        String chicken = "";
        chicken = "Chicken{" + getId() + ", "
                + getBreed() + ", " + getBornOn()
                + ", " + "isMolting = " + isMolting + '}';
        
        return chicken;
    }
    
    public void layAnEgg(){
        System.out.println("The eggs that the chicken laid: " + counterEggs);
    }
    
}
