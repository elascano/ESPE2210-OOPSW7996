
package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Taxi {

    private String vehicleMark;
    private String vehiclePlate;
    private String vehicleYear;

    public Taxi(String vehicleMark, String vehiclePlate, String vehicleYear) {
        this.vehicleMark = vehicleMark;
        this.vehiclePlate = vehiclePlate;
        this.vehicleYear = vehicleYear;
    }

    @Override
    public String toString() {
        return "Taxi{" + "vehicleMark=" + getVehicleMark() + ", vehiclePlate=" + getVehiclePlate() + ", vehicleYear=" + getVehicleYear() + '}';
    }

    /**
     * @return the vehicleMark
     */
    public String getVehicleMark() {
        return vehicleMark;
    }

    /**
     * @param vehicleMark the vehicleMark to set
     */
    public void setVehicleMark(String vehicleMark) {
        this.vehicleMark = vehicleMark;
    }

    /**
     * @return the vehiclePlate
     */
    public String getVehiclePlate() {
        return vehiclePlate;
    }

    /**
     * @param vehiclePlate the vehiclePlate to set
     */
    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    /**
     * @return the vehicleYear
     */
    public String getVehicleYear() {
        return vehicleYear;
    }

    /**
     * @param vehicleYear the vehicleYear to set
     */
    public void setVehicleYear(String vehicleYear) {
        this.vehicleYear = vehicleYear;
    }    
    
}
