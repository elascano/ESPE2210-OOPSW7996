/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocp;

/**
 *
 * @author Miguel Gutierrez, Pythons, DCCO-ESPE
 */
public class Vehicle {
    private int power;
    private int suspensionHeight;

    int getPower() {
        return power;
    }

    void setPower(final int power) {
        this.power = power;
    }

    int getSuspensionHeight() {
        return suspensionHeight;
    }

    void setSuspensionHeight(final int suspensionHeight) {
        this.suspensionHeight = suspensionHeight;
    }
}
