/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocp;

/**
 *
 * @author nicko
 */
public abstract class Comfort implements DrivingMode{
    
    private static final int POWER=400;
    private static final int SUSPENSION_HEIGHT=20;
    
    @Override
    public int getPower(){
        return POWER;
    }
    
    public int getSupensionHeight(){
        return SUSPENSION_HEIGHT;
    }
    
}
