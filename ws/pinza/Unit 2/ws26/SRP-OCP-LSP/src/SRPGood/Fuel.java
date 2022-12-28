/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRPGood;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Fuel{
    void refuel(final Vehicle vehicle){
        final int remainingFuel = vehicle.getRemainingFuel();
        final int additionalFuel = vehicle.getMaxFuel();
        vehicle.setRemainingFuel(remainingFuel+additionalFuel);;
    }
}
