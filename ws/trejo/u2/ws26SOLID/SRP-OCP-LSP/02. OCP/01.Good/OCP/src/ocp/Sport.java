/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocp;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public abstract class Sport implements DrivingMode{

    private static final int power = 500;
    private static final int suspensionHeifht = 10;

    public int getPower() {
        return power;
    }

    public int getSuspensionHeight() {
        return suspensionHeifht;
    }

}
