/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Hw09Vehicle.model;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Vehicle {
    private int id;
    private String make;
    private String model;
    private float cc;

    public Vehicle(int id, String make, String model, float cc) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.cc = cc;
    }
    public Vehicle() {
        this.id = 0;
        this.make = "";
        this.model = "";
        this.cc = 0;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", make=" + make + ", model=" + model + ", cc=" + cc + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the cc
     */
    public float getCc() {
        return cc;
    }

    /**
     * @param cc the cc to set
     */
    public void setCc(float cc) {
        this.cc = cc;
    }
    
}
