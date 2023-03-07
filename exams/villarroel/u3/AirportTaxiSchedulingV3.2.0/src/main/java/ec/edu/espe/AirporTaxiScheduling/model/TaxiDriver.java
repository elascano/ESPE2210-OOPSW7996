
package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class TaxiDriver extends Person{
    private String CI;   
    private String age;
    private String adress; 
    private String gender;
    private String vehicleMark;
    private String vehiclePlate;
    private String vehicleYear;

     public TaxiDriver() {
        super("",0,"");
        this.CI = "";
        this.age = "";
        this.adress = "";
        this.gender = "";
        this.vehicleMark = "";
        this.vehiclePlate = "";
        this.vehicleYear = "";
    }
     
    public TaxiDriver(String CI, String name, long phoneNumber, String age, String adress, String mail, String gender, String vehicleMark, String vehiclePlate, String vehicleYear) {
        super(name,phoneNumber,mail);
        this.CI = CI;
        this.age = age;
        this.adress = adress;
        this.gender = gender;
        this.vehicleMark = vehicleMark;
        this.vehiclePlate = vehiclePlate;
        this.vehicleYear = vehicleYear;
    }

    /**
     * @return the CI
     */
    public String getCI() {
        return CI;
    }

    /**
     * @param CI the CI to set
     */
    public void setCI(String CI) {
        this.CI = CI;
    }  

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
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