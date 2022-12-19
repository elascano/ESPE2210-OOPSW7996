package ec.edu.espe.Farm.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author Karla Ansatuña
 */
public abstract class FarmAnimal {

    private int id;
    private String breed;
    private LocalDate bornOn;
    public String age;

    public FarmAnimal(int id, String breed, LocalDate bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    public abstract void feed(float amountOfFood);

    public abstract void collectEggs();
    public abstract void collectMilk();
    public abstract void collectChoppedMeat();
    public abstract void collectWool();
    
    public static void ageInMonths(LocalDate startDate, LocalDate endDate) {
        Period age = Period.between(startDate, endDate);
        System.out.println("The age in months of the animal is >" + age.getMonths());
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
