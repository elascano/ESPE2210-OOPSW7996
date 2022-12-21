/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCPGood;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Economy extends DrivingMode {

    int power = 200;
    int suspensionHeight = 30;

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getSuspensionHeigh() {
        return suspensionHeight;
    }
}
