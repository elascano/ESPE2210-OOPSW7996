package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Sheep extends FarmAnimal {

    LocalDate lastSheering;

    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a sheep");
    }
    
    public void shearWool(float amountOfWool){
        System.out.println("Wool sheared from the sheep: " + amountOfWool);
    }

    public Sheep(LocalDate lastSheering, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
    }

}
