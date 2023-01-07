
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Pig extends FarmAnimal{ 
    
    private String pork;
    

    public Pig(String pork, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.pork = pork;
    }

    @Override
    public String toString() {
        String pig="";
        pig = "Pig{" + getId()+","
                + getBreed() +","+ getBornOn()+
                "," + "pork=" + pork + '}';
        return pig;
    }
    
    /**
     * @return the isMolting
     */
    public String Pork() {
        return pork;
    }

    /**
     * @param pork the pork to set
     */
    public void setPork(String pork) {
        this.pork = pork;
    }
    
    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a Pig with an float--> " + amountOfFood);
    
    }

    //overloading
    public void feed(float amountOfFood, String typeOfFood){
        System.out.println("feeding a Pig with food--> " +typeOfFood+ " , amount: "+ amountOfFood);
    }

    
}
