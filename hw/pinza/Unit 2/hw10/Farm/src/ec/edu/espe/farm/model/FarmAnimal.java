package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public abstract class FarmAnimal {

    private int id;
    private String breed;
    private LocalDate bornOn;

    public int getAgeInMonths() {
        LocalDate dateNow = LocalDate.now();
        Period periodOfTime = Period.between(bornOn, dateNow);
        return periodOfTime.getMonths();
    }

    public abstract void feed(float amountOfFood);

    public FarmAnimal(int id, String breed, LocalDate bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", bornOn=" + bornOn + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getBornOn() {
        return bornOn;
    }

    public void setBornOn(LocalDate bornOn) {
        this.bornOn = bornOn;
    }

}
