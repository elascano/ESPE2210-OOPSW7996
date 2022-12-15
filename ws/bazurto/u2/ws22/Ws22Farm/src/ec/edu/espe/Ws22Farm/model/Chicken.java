/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Ws22Farm.model;

import java.time.LocalDate;
import java.util.logging.Logger;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Chicken extends FarmAnimal {
    private boolean isMolting;

    public Chicken(boolean isMolting, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }
    @Override
    public void feed(float amountOfFood) {
        System.out.println("feeeding a Chicken whith  a float"+ amountOfFood);
    }
    public void feed(int amountOfFood) {
        System.out.println("feeeding a Chicken whith an int "+ amountOfFood);
    }
    //overLoading
    public void feed(float amountOfFood, String typeOfFood) {
        System.out.println("feeeding a Chicken --> "+ typeOfFood + ", amount: "+ amountOfFood);
    }




    @Override
    public String toString() {
        String chicken = "";
        chicken = "Chicken{"+ getId()+", "+ getBreed()+", "+ getBornOn()+" " + "isMolting=" + isMolting + '}'; 
        return chicken;
    }

   
    
    
}
