
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Cow extends FarmAnimal{
    
    private boolean isProducingMilk;

    
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding the Animal : " + amountOfFood);
    }
    
    public void feed(float amountOfFood,String typeOfFood){
        System.out.println("Feeding a cow with food --> " + typeOfFood + ", amount: " + amountOfFood);
    }
    
    public Cow(int id, String breed, LocalDate bornOn, int age) {
        super(id, breed, bornOn, age);
    }

    public Cow(boolean isProducingMilk, int id, String breed, LocalDate bornOn, int age) {
        super(id, breed, bornOn, age);
        this.isProducingMilk = isProducingMilk;
    }
    
    public void milkProduction(int milk){
        System.out.println("Milk prodduced = " + milk);
    }

    
    public void feer(float amountOfFood){
        System.out.println("Feeding the cow");
    }
    
    
    
    @Override
    public String toString() {
        return "cow{" + getId() + ", " + getBreed() + ", " + getBornOn() + ", " + "isProducingMilk = " + isProducingMilk+ "}";
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


    
}
