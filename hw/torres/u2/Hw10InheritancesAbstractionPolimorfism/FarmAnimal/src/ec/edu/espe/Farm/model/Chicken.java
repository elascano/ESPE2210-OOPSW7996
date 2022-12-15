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
public class Chicken extends FarmAnimal {

    private boolean isMolting;
    
    
    @Override
    public void feed(float amountOfFood, String typeOfFood) {   
        System.out.println("fedding an Animal with fodd ---->" + typeOfFood + ", amount" + amountOfFood );
    }
    

    public Chicken(boolean isMolting, int id, String breed, LocalDate bornOn) {
        super(id, breed,bornOn);
        this.isMolting = isMolting;
    }

    public void countEggsLaid(Scanner scan){
        
        int eggs=0;
        if(isMolting==true){
            System.out.println("Enter the number of eggs laid");
            eggs=scan.nextInt();
            System.out.println("the chicken laid " + eggs +" eggs");

        }else{
            System.out.println("The chicken not is molting");
        }
        
    }
    
    @Override
    public String toString() {
        String chicken;
        chicken = "Chicken{" + getId() + "," + getBreed() 
                + "," + getBornOn() + "," 
                + "isMolting=" + isIsMolting() + '}';
        return chicken;
    }
    
    
    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }
    
    
    
    
    
    
}
