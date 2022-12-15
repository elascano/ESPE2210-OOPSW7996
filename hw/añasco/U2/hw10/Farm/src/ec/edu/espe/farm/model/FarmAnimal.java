package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.time.Period;

/*
@author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public abstract class FarmAnimal {
    protected int id;
    private String breed;
    private LocalDate bornOn;
    
    public long getAgeInMonths(){
        LocalDate now = LocalDate.now();
        long months = 0;
        months = Period.between(bornOn, now).toTotalMonths();
        return months;
    }
    
    public abstract void feed (float amountOfFood);

    public FarmAnimal(int id, String breed, LocalDate bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", bordOn=" + bornOn + '}';
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
