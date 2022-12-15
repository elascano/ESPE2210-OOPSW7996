/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Farm.model;

import java.time.LocalDate;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Pig extends FarmAnimal{
    
    
    
    @Override
    public void feed(float amountOfFood, String typeOfFood) {   
        System.out.println("fedding an Animal with fodd ---->" + typeOfFood + ", amount" + amountOfFood );
    }

    public Pig(int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
    }

    @Override
    public String toString() {
        return "Pig{" + getId() + "," + getBreed() 
                + "," + getBornOn() + "," 
                +  '}';
    }
    
    public void slaughteringPig(int months){
        
        if(months>6){
            System.out.println("the pig has been slaughtered");
            
        }else{
            System.out.println("the pig is not ready to be slaughtered");
        }
    
    }
    
    
}
