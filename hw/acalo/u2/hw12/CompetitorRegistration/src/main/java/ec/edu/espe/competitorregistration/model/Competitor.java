/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.competitorregistration.model;
import java.util.ArrayList;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Competitor {
    private int id;
    private String name;
    private ArrayList<Double> times;

    public Competitor(int id, String name, ArrayList<Double> times) {
        this.id = id;
        this.name = name;
        this.times = times;
    }

    public Competitor() {
        
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
     * @return the times
     */
    public ArrayList<Double> getTimes() {
        return times;
    }

    /**
     * @param times the times to set
     */
    public void setTimes(ArrayList<Double> times) {
        this.times = times;
    }
    
    
}
