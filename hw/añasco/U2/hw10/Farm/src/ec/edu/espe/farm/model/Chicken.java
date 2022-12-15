package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Chicken extends FarmAnimal{
    private boolean isMolting;

    //Sobreescritura-Override
    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a Chicken with " + amountOfFood + " lb");
    }
    
    //Sobrecarga-Overloading
    public void feed(float amountOfFood, String typeOfFood){
        System.out.println("feeding an animal with food-->" +typeOfFood+", amount: "+amountOfFood);
    }
    
    public Chicken(boolean isMolting, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }

    @Override
    public String toString() {
        return "Chicken{id: " + id + ", breed: " + getBreed() + ", Birth date: " + getBornOn() + ", isMolting: " + isMolting + '}';
    }

    public void jump(int amountOfJumps){
        int i=0;
        System.out.println("The chicken is about to jump...");
        while(i<=6){
            System.out.println("Jump!");
            i++;
            if(i==6){
                System.out.println("Oh no! the chicken get tired of jumping. Sorry :c");
                break;
            }
        }
    }
}
