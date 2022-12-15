package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Chicken extends FarmAnimal {

    private boolean isMoolting;

    public void peck() {
        System.out.println("The chicken is pecking");
    }

    //Override
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding a Chicken with " + amountOfFood);
    }

    //Change type of parameter    
    public void feed(int amountOfFood) {
        System.out.println("Feeding a Chicken with " + amountOfFood);
    }

    //overloading
    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("Feeding a chicken with " + amountOfFood + " of " + typeOfFood);
    }

    public Chicken(boolean isMoolting, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMoolting = isMoolting;
    }

    @Override
    public String toString() {
        String chicken;
        chicken = "Chicken{"
                + "id=" + getId()
                + ", breed=" + getBreed()
                + ", bornOn=" + getBornOn()
                + ", isMoolting=" + isMoolting
                + '}';
        return chicken;
    }

    /**
     * @return the isMoolting
     */
    public boolean isIsMoolting() {
        return isMoolting;
    }

    /**
     * @param isMoolting the isMoolting to set
     */
    public void setIsMoolting(boolean isMoolting) {
        this.isMoolting = isMoolting;
    }

}
