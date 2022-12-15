package ec.edu.espe.farm.model;

import java.time.*;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public abstract class FarmAnimal {

    private int id;
    private String breed;
    private LocalDate bornOn;

    public int getAgeInMonth(LocalDate bornOn) {
        LocalDate now = LocalDate.now();
        int months = 0;
        months = Period.between(bornOn, now).getMonths();
        return months;
    }

    public abstract void feed(float amountOfFood);

    public FarmAnimal(int id, String breed, LocalDate bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + getId() + ", breed=" + getBreed() + ", bornOn=" + getBornOn() + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the bornOn
     */
    public LocalDate getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(LocalDate bornOn) {
        this.bornOn = bornOn;
    }

}
