
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Pig extends FarmAnimal{
    
    public void feed(float amountOfFood) {
    System.out.println("feeding a Pig with an int: " + amountOfFood+" kilos");
    }
    
    public void collectedMeat(int amountOfMeat) {
        System.out.println("weighing the amount of pork :"+ amountOfMeat+ "kilos");
    }

    public Pig(int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
    }

    @Override
    public String toString() {
        return "Pig{" + "id=" + getId() + ", breed=" + getBreed() + ", bornOn=" + getBornOn() + '}';
    }
    
    
    @Override
    public void collectEggs(int amountOfEggs) {}

    @Override
    public void collectedMilk(float amountOfEggs) {}

    @Override
    public void collectedWool(int amountOfWool) {}
        
}
