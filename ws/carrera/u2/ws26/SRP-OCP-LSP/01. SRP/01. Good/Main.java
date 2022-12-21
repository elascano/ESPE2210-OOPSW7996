package srp;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(500);
        System.out.println("Acelerate 3 times and refuel");
        
        for(int i = 0; i <= 3; i = i + 1){
            VehicleController.accelerate(vehicle);
        }
        
        VehicleController.reFuel(vehicle);
        
        System.out.println("Acelerate 5 times and refuel");
        
        for(int i = 0; i <= 5; i = i + 1){
            VehicleController.accelerate(vehicle);
        }
        VehicleController.reFuel(vehicle);
    }
    
}
