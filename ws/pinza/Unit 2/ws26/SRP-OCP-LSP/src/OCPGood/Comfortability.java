/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCPGood;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Comfortability implements VehicleMode {
    
    private static final int POWER=400;
    private static final int SUSPENSIONHEIGHT=20;
    
    @Override
    public int getPower(){
        return POWER;
    }
    
    public int getSuspensionHeight(){
        return SUSPENSIONHEIGHT;
    }
}
