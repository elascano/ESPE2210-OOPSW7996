/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Farm.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Sheep extends FarmAnimal{

    private LocalDate lastSheering;

    @Override
    public void feed(float amountOfFood, String typeOfFood) {   
        System.out.println("fedding an Animal with fodd ---->" + typeOfFood + ", amount" + amountOfFood );
    }

    
    
    @Override
    public String toString() {
        return "Sheep{" + getId() + "," + getBreed() 
                + "," + getBornOn() + "," 
                +  "lastSheering=" + lastSheering + '}';
    }
    
    public Sheep(LocalDate lastSheering, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
    }
    
    /**
     * @return the lastSheering
     */
    public LocalDate getLastSheering() {
        return lastSheering;
    }

    /**
     * @param lastSheering the lastSheering to set
     */
    public void setLastSheering(LocalDate lastSheering) {
        this.lastSheering = lastSheering;
    }
    
    public void countCutWool(Scanner scan){
        
        LocalDate now = LocalDate.now();
        int months = 0;
        months = Period.between(lastSheering, now).getMonths();
        
        int cutWool=0;
        if(months>5){
            System.out.println("Enter the wool cuted");
            cutWool=scan.nextInt();
            System.out.println( cutWool + " kilograms of wool were cut");

        }else{
            System.out.println("The sheep does not have enough wool");
        }
        
    }
    
}
