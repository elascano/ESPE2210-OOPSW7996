package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Pig extends FarmAnimal{
    
    private String foodOfPig;
    
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding a Pig with: " + amountOfFood);
    }

    public void feed(int amountOfFood) {
        System.out.println("Feeding a Pig with: " + amountOfFood);
    }

    public void feed(float amountOfFood, String typeOfFood){
        System.out.println("Feeding a Pig with food: " + typeOfFood + ", amount:" + amountOfFood);
    }

    public Pig(int id, String breed, LocalDate bornOn, String foodOfPig) {
        super(id, breed, bornOn);
        this.foodOfPig = foodOfPig;
    }
    
    @Override
    public String toString() {
        return "Pig{" + getId() + ", "
                + getBreed() + ", " + getBornOn() + '}';
    }
    
    public void cookThePig() {
        System.out.println("The pig became: " + foodOfPig);
    }
    
}
