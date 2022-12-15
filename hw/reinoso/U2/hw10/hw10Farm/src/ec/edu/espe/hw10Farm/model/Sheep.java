
package ec.edu.espe.hw10Farm.model;

import java.time.LocalDate;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class Sheep extends FarmAnimal {
    private LocalDate lastSheering;
    private boolean hasBaby;

    public Sheep(LocalDate lastSheering, boolean hasBaby, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
        this.hasBaby = hasBaby;
    }

    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeeding a Sheep whith  a float"+ amountOfFood);
    }
    public void feed(int amountOfFood) {
        System.out.println("feeeding a Sheep whith an int "+ amountOfFood);
    }
    //overLoading
    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("feeeding a Sheep --> "+ typeOfFood + ", amount: "+ amountOfFood);
    }
    public void pregnat(){
        System.out.println("The sheep has a Baby?  "+ hasBaby);
    }
}