
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Chicken extends FarmAnimal {
    
    private boolean isMolting;
    private int layAnEgg;

    public Chicken(boolean isMolting,int layAnEgg, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        this.layAnEgg= layAnEgg;
    }

    @Override
    public String toString() {
        String chicken="";
        chicken = "Chicken{" + getId()+","
                + getBreed() +","+ getBornOn()+
                "," + "isMolting=" + isMolting +
                "," + "layAnEgg=" + layAnEgg + '}';
        return chicken;
    }
   
    
   
    //override
    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a Chicken with a float--> " + amountOfFood);
    }
    
    //overloading
    public void feed(int amountOfFood) {
        System.out.println("feeding a Chicken with an int--> " + amountOfFood);
    }
    
    //overloading
    public void feed(float amountOfFood, String typeOfFood){
        System.out.println("feeding a Chicken with food--> " +typeOfFood+ " , amount: "+ amountOfFood);
    }

 
}
