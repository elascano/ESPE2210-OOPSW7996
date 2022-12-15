/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Farm.model;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Cow extends FarmAnimal{

    
    private boolean isProducingMilk;

    @Override
    public void feed(float amountOfFood, String typeOfFood) {   
        System.out.println("fedding an Animal with fodd ---->" + typeOfFood + ", amount" + amountOfFood );
    }

    public Cow(boolean isProducingMilk, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public String toString() {
        return "Cow{"+ getId() + "," + getBreed() 
                + "," + getBornOn() + "," 
                + "isProducingMilk=" + isProducingMilk + '}';
    }
    
    /**
     * @return the isProducingMilk
     */
    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }
    
    public void countLitersOfMilk(Scanner scan){
        
        int litersOfMilk=0;
        if(isProducingMilk==true){
            System.out.println("Enter the liters of milk milked");
            litersOfMilk=scan.nextInt();
            System.out.println("the cow milked " + litersOfMilk +" liters of milk");

        }else{
            System.out.println("The cow does not produce milk");
        }
        
    }
    
}
