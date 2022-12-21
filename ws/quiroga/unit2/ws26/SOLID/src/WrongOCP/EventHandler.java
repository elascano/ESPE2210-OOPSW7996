/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WrongOCP;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class EventHandler {
     
    private final Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    void changeDrivingMode(final DrivingMode drivingMode) {
        switch (drivingMode) {
            case SPORT -> {
                vehicle.setPower(500);
                vehicle.setSuspensionHeight(10);
            }
            case COMFORT -> {
                vehicle.setPower(400);
                vehicle.setSuspensionHeight(20);
            }
            case ECONOMY -> {
                vehicle.setPower(200);
                vehicle.setSuspensionHeight(30);
            }
        }
    }

    enum DrivingMode {
        SPORT, COMFORT, ECONOMY
    }
}
