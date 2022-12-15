package ec.edu.espe.Farm.model;

import java.time.LocalDate;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Pig extends FarmAnimal{
    
    private boolean isClean;

    public Pig(boolean isClean, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isClean = isClean;
    }

    @Override
    public String toString() {
        return "Pig{" + + getId() + "," + getBreed() +
                "," + getBornOn() + "isClean=" + isClean + '}';
    }

    /**
     * @return the isClean
     */
    public boolean isIsClean() {
        return isClean;
    }

    /**
     * @param isClean the isClean to set
     */
    public void setIsClean(boolean isClean) {
        this.isClean = isClean;
    }

    @Override
    public void feed(float amountOfFood) {}

    public void feed(float amountOfFood, String typeOfFood){
        System.out.println("Feeding an animal with food: " + typeOfFood + ", amount:" + amountOfFood);
    }
    
    
}
