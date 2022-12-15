package ec.edu.espe.hw10Farm.model;

import java.time.LocalDate;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class Pig extends FarmAnimal{
    private float weightOfPig;

    public Pig(float weightOfPig, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.weightOfPig = weightOfPig;
    }


    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeeding a Pig whith  a float"+ amountOfFood);
    }
    public void feed(int amountOfFood) {
        System.out.println("feeeding a Pig whith an int "+ amountOfFood);
    }
    //overLoading
    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("feeeding a Pig --> "+ typeOfFood + ", amount: "+ amountOfFood);
    }
    
    public void weigh(){
        System.out.println("The weight Of Pig is --> "+ weightOfPig);
    }
}
