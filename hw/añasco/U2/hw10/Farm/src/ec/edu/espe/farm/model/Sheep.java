package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Sheep extends FarmAnimal{
    private LocalDate lastSheering;

    public Sheep(LocalDate lastSheering, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
    }

    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a Sheep with " + amountOfFood + " lb");
    }

    @Override
    public String toString() {
        return "Sheep{id: " + id + ", breed: " + getBreed() + ", Birth date: " + getBornOn() + ", lastSheering: " + lastSheering + '}';
    }
    
    public void sheer(){
        String decision;
        Scanner sc;

        
        sc = new Scanner(System.in);
        
        System.out.print("Do you want to sheer the sheep (Yes/No)? ");
        decision = sc.next();
        
            if(decision.equals("No")|| decision.equals("no")){
                System.out.println("The sheep was not sheer");
            }else{
                System.out.println("The sheep was sheer. It's happy and bald now :)");
                lastSheering = LocalDate.now();
            }
    }
}
