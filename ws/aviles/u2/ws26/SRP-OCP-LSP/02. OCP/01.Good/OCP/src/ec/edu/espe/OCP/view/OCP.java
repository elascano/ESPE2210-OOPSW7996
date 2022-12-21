package ec.edu.espe.OCP.view;

import ec.edu.espe.OCP.model.Comfort;
import ec.edu.espe.OCP.model.Comfort;
import ec.edu.espe.OCP.model.DrivingMode;
import ec.edu.espe.OCP.model.Economy;
import ec.edu.espe.OCP.model.EventHandler;
import ec.edu.espe.OCP.model.Sport;
import ec.edu.espe.OCP.model.Vehicle;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class OCP {

    public static void main(String[] args) {
        Vehicle vehicle;
        vehicle = new Vehicle();
        EventHandler eventHandler;
        eventHandler = new EventHandler(vehicle);
        DrivingMode sport;
        sport = new Sport();
        eventHandler.changeDrivingMode(sport);
        System.out.println("Sport");
        System.out.println("Power -----> "+ vehicle.getPower());
        System.out.println("Suspension Height ----> "+vehicle.getSuspensionHeight());
        
        DrivingMode comfort;
        comfort = new Comfort();
        eventHandler.changeDrivingMode(comfort);
        System.out.println("Comfort");
        System.out.println("Power -----> "+ vehicle.getPower());
        System.out.println("Suspension Height ----> "+vehicle.getSuspensionHeight());
        
        DrivingMode economy;
        economy = new Economy();
        eventHandler.changeDrivingMode(economy);
        System.out.println("Economy");
        System.out.println("Power -----> "+ vehicle.getPower());
        System.out.println("Suspension Height ----> "+vehicle.getSuspensionHeight());
    }
    
}
