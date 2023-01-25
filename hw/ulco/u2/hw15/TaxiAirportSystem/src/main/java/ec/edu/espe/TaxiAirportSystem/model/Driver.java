/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.TaxiAirportSystem.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Driver {

    private String id;
    private String name;
    private String phoneNumber;
    private String age;
    private String adress;
    private String CI;
    private String email;
    private String gender;
    private String vehicleMark;
    private String vehiclePlate;
    private String vehicleYear;

    public Driver(String id, String name, String phoneNumber, String age, String adress, String CI, String email, String gender, String vehicleMark, String vehiclePlate, String vehicleYear) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.adress = adress;
        this.CI = CI;
        this.email = email;
        this.gender = gender;
        this.vehicleMark = vehicleMark;
        this.vehiclePlate = vehiclePlate;
        this.vehicleYear = vehicleYear;
    }

    @Override
    public String toString() {
        return "Driver{" + "id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", age=" + age + ", adress=" + adress + ", CI=" + CI + ", email=" + email + ", gender=" + gender + ", vehicleMark=" + vehicleMark + ", vehiclePLate=" + vehiclePlate + ", vehicleYear=" + vehicleYear + '}';
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return the vehiclePLate
     */
    public String getVehiclePLate() {
        return vehiclePlate;
    }

    /**
     * @param vehiclePLate the vehiclePLate to set
     */
    public void setVehiclePLate(String vehiclePLate) {
        this.vehiclePlate = vehiclePLate;
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
