/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srp.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class FuelPump {
    void reFuel(final Vehicle vehicle){
    final int remainingFuel = vehicle.getRemainingFuel();
    final int additionalFuel=vehicle.getMaxFuel()-remainingFuel;
    vehicle.setRemainingFuel(remainingFuel+additionalFuel);
    
    }
}
