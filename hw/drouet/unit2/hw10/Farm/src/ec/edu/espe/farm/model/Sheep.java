package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Sheep extends FarmAnimal {

    private LocalDate lastSheering;

    public float shear() {
        float amountOfWool;
        float max = 3;
        float min = 1;
        
        amountOfWool = (float) (Math.random() * ((max - min) + 1)) + min;

        return amountOfWool;
    }

    //Override - sobreescritura
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding a sheep with " + amountOfFood);
    }

    //Change type of parameter    
    public void feed(int amountOfFood) {
        System.out.println("Feeding a sheep with " + amountOfFood);
    }

    //overloading - sobrecarga
    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("Feeding a sheep with " + amountOfFood + " of " + typeOfFood);
    }

    public Sheep(LocalDate lastSheering, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
    }

    @Override
    public String toString() {
        String sheep;
        sheep = "Sheep{"
                + "id=" + getId()
                + ", breed=" + getBreed()
                + ", bornOn=" + getBornOn()
                + ", lastSheering=" + lastSheering
                + '}';
        return sheep;
    }

    /**
     * @return the lastSheering
     */
    public LocalDate getLastSheering() {
        return lastSheering;
    }

    /**
     * @param lastSheering the lastSheering to set
     */
    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
    }
}
