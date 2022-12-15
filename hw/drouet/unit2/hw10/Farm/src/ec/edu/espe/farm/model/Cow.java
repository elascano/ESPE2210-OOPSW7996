package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Cow extends FarmAnimal {

    private boolean isProducingMilk;        

    public float milk() {
        float amountOfMilk = 0;
        float max = 40;
        float min = 15;
        
        if(isProducingMilk) {
            amountOfMilk = (float) (Math.random() * ((max - min) + 1)) + min;
        }        

        return amountOfMilk;
    }
    
    //Override
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding a cow with " + amountOfFood);
    }

    //Change type of parameter    
    public void feed(int amountOfFood) {
        System.out.println("Feeding a cow with " + amountOfFood);
    }

    //overloading
    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("Feeding a cow with " + amountOfFood + " of " + typeOfFood);
    }

    public Cow(boolean isProducingMilk, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public String toString() {
        String cow;
        cow = "Cow{"
                + "id=" + getId()
                + ", breed=" + getBreed()
                + ", bornOn=" + getBornOn()
                + ", isProducingMilk=" + isProducingMilk
                + '}';
        return cow;
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
