/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;
import java.time.*;
/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public abstract class FarmAnimal {
    private int id;
    private String breed;
    private LocalDate bornOn;
    
    public int getAgeInMoths(){
        LocalDate now =LocalDate.now();
        int days  = 0;
        days = Period.between(bornOn,now).getDays();
        return days;
    }
   
    public abstract void feed(float amountOfFood);
    //Chicken
    

    public FarmAnimal(int id, String breed, LocalDate bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    public FarmAnimal() {
        this.id = 0;
        this.breed = "";
        this.bornOn = LocalDate.now(); 
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