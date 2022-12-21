/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocp;

/**
 *
 * @author Miguel Gutierrez, Pythons, DCCO-ESPE
 */
public class Sport implements DrivingMode{
    
    private static final int POWER=500;
    private static final int SUSPENSION_HEIGHT=10;
    
    
    public int getPower(){
          return POWER;
    }
      
    public int getSuspensionHeight(){
          return SUSPENSION_HEIGHT;
    }
}