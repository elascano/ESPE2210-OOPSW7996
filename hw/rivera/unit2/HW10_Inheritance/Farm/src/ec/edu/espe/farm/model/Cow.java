package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Cow extends FarmAnimal{
    
    private boolean isProducingMilk;
    private float milkGaveCow;
    
    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feeding a Cow with: " + amountOfFood);
    }

    public void feed(int amountOfFood) {
        System.out.println("Feeding a Cow with: " + amountOfFood);
    }

    public void feed(float amountOfFood, String typeOfFood){
        System.out.println("Feeding a Cow with food: " + typeOfFood + ", amount:" + amountOfFood);
    }

    public Cow(boolean isProducingMilk, float milkGaveCow, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
        this.milkGaveCow = milkGaveCow;
    }

    @Override
    public String toString() {
        return "Cow{" + getId() + ", "
                + getBreed() + ", " + getBornOn()
                + ", " + "isProducingMilk=" + isProducingMilk + '}';
    }
    
    public void giveMilk(){
        System.out.println("The cow gave " + milkGaveCow + "liters of milk");
    }
    
}
