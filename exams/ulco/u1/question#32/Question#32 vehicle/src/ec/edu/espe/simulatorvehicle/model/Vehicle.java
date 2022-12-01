/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.simulatorvehicle.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Vehicle {

    private int id;
    private String color;
    private long Kilometres;

    public Vehicle() {
        this.id = 0;
        this.color = "";
        this.Kilometres = 0;
    }

    public Vehicle(int id, String color, long Kilometres) {
        this.id = id;
        this.color = color;
        this.Kilometres = Kilometres;
    }

    @Override
    public String toString() {
        return "vehicle{" + "id=" + id + ", color=" + color + ", Kilometres=" + Kilometres + '}';
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the Kilometres
     */
    public long getKilometres() {
        return Kilometres;
    }

    /**
     * @param Kilometres the Kilometres to set
     */
    public void setKilometres(long Kilometres) {
        this.Kilometres = Kilometres;
    }

}
