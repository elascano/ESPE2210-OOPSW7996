
package model;

import java.util.Scanner;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class EventHandler {
    
    private final Vehicle vehicle;
    
    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    void changeDrivingMode(final DrivingMode drivingMode) {
        
        Scanner scan = new Scanner(System.in);
        switch (drivingMode) {
            case SPORT -> {
                vehicle.setPower(scan.nextInt());
                vehicle.setSuspensionHeight(scan.nextInt());
            }
            case COMFORT -> {
                vehicle.setPower(scan.nextInt());
                vehicle.setSuspensionHeight(scan.nextInt());
            }
            case ECONOMY -> {
                vehicle.setPower(vehicle.getPower());
                vehicle.setSuspensionHeight(scan.nextInt());
            }
        }
    }

    enum DrivingMode {
        SPORT, COMFORT, ECONOMY
    }
    
}
