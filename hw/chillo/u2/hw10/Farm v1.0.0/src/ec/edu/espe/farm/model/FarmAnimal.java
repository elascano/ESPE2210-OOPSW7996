package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public abstract class FarmAnimal {
    private int id;
    private String breed;
    private LocalDate bornOn;
    
    public int getAgeInMonths(){
        int ageInMonths;
        LocalDate toDay = LocalDate.now();
        Period period = Period.between(bornOn, toDay);
        ageInMonths = period.getMonths() + period.getYears()*12;
        
        return ageInMonths;
    }
    
    //Override
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

    public FarmAnimal(int id, String breed, LocalDate bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", bronOn=" + bornOn + '}';
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
