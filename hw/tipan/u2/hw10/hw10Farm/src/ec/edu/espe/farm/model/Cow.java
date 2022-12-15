
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Cow extends FarmAnimal {
    
    private float isProducingMilk;
    private String illness;
    
    public Cow(float isProducingMilk,String illness, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
        this.illness = illness;
    }
    
    @Override
    public String toString() {
        String cow="";
        cow = "Cow{" + getId()+","
                + getBreed() +","+ getBornOn()+
                "," + "isProducingMilk(liters)=" + isProducingMilk + 
                "," + "illness=" + illness + '}';
        return cow;
    }
    
    /**
     * @return the isProducingMilk
     */
    public float isIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(float isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }
    
    /**
     * @return the illness
     */
    public String isIllness() {
        return illness;
    }
    
    /**
     * @param illness the illness to set
     */
    public void setIllness(String illness) {
        this.illness = illness;
    }
    
    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a Cow with an float--> " + amountOfFood);   
    }

    //overloading
    public void feed(float amountOfFood, String typeOfFood){
        System.out.println("feeding a Cow with food--> " +typeOfFood+ " , amount: "+ amountOfFood);
    }

}
