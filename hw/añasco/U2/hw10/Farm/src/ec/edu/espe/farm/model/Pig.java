/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Pig extends FarmAnimal{

    public Pig(int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
    }

    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeding a Pig with " + amountOfFood + " lb.");
    }

    @Override
    public String toString() {
        return "Pig{id: " + id + ", breed: " + getBreed() + ", birth date: " + getBornOn() + '}';
    }
    
    public void eat(){
        Scanner sc;
        String decision;
        
        sc = new Scanner(System.in);
        System.out.println("Do you want to eat the pig? ʕ◉ᴥ◉ʔ ");
        decision = sc.next();
        if(decision.equals("Yes")||decision.equals("yes")){
            System.out.println("NOOO, my poor little pig :c");
        }else{
            System.out.println("Uff, it was really close. c:");
        }
    }
}
