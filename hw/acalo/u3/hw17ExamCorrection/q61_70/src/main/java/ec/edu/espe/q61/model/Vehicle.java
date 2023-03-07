/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q61.model;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Vehicle {
    private int id;
    private String mark;
    private int horsesPower;

    public Vehicle(int id, String mark, int horsesPower) {
        this.id = id;
        this.mark = mark;
        this.horsesPower = horsesPower;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", mark=" + mark + ", horsesPower=" + horsesPower + '}';
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
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return the horsesPower
     */
    public int getHorsesPower() {
        return horsesPower;
    }

    /**
     * @param horsesPower the horsesPower to set
     */
    public void setHorsesPower(int horsesPower) {
        this.horsesPower = horsesPower;
    }
    
}
