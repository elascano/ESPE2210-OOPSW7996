package ec.edu.espe.ws26.OPC;

/**
 *
 * @author NicolayChillo, Gaman GeekLords at DCOO-ESPE
 */
public class EventHandler {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle(500, 15);
        
    } 
    
    /*evoid changeDrivingMode(final DrivingMode drivingMode) {
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
    }*/

    enum DrivingMode {
        SPORT, COMFORT, ECONOMY
    }
}
