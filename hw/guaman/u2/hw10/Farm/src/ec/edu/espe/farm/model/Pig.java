package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Pig extends FarmAnimal {

    public Pig(int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
    }

    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a pig with float " + amountOfFood);

    }
    
    @Override
    public void obtainBeacon(float numKgBeacon) {
        System.out.println(numKgBeacon + " kg of beacon was obtained");
    }

    @Override
    public void collectEggs(int numEggs) {
    }
    
    @Override
    public void orderMilk(float numLitersMilk) {
    }

    @Override
    public void woolgathering(int numWool) {
    }
    

}
