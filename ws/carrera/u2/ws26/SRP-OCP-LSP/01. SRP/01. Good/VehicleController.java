package srp;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class VehicleController {
    
    public static void reFuel(Vehicle vehicle) {
        vehicle.setRemainingFuel(vehicle.getMaxFuel());
        System.out.println("refuel-> "+ vehicle.getRemainingFuel());
    }
    public static void accelerate(Vehicle vehicle) {
        int remainingFuel;
        remainingFuel = vehicle.getRemainingFuel();
        vehicle.setRemainingFuel(remainingFuel-1);
        System.out.println("acelerate-> "+ vehicle.getRemainingFuel());
    }
}
