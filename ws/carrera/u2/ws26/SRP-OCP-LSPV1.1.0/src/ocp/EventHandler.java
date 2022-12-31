package ocp;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class EventHandler {
    
    //private final Vehicle vehicle;

    public EventHandler(){
    }
    
    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        changeDrivingMode(EventHandler.DrivingMode.ECONOMY);
        changeDrivingMode(EventHandler.DrivingMode.COMFORT);
        changeDrivingMode(EventHandler.DrivingMode.SPORT);
    }
      
    static void changeDrivingMode(final DrivingMode drivingMode) {
        Vehicle vehicle = new Vehicle(500,10);
        switch (drivingMode) {
            case SPORT -> {
                System.out.println("SPORT MODE");
                vehicle.setPower(500);
                vehicle.setSuspensionHeight(10);
            }
            case COMFORT -> {
                System.out.println("COMFORT MODE");
                vehicle.setPower(400);
                vehicle.setSuspensionHeight(20);
            }
            case ECONOMY -> {
                System.out.println("ECONOMY MODE");
                vehicle.setPower(200);
                vehicle.setSuspensionHeight(30);
            }
        }
    }

    enum DrivingMode {
        SPORT, COMFORT, ECONOMY
    }

}

   
