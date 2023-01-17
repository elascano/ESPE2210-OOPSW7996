/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.competitorregistration.model;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class TimeAveraged {
    private int id;
    private String name;
    private double timeAveraged;

    public TimeAveraged(int id, String name, double timeAveraged) {
        this.id = id;
        this.name = name;
        this.timeAveraged = timeAveraged;
    }

    public TimeAveraged(){
        
    }
    
    @Override
    public String toString() {
        return "TimeAveraged{" + "id=" + id + ", name=" + name + ", timeAveraged=" + timeAveraged + '}';
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
     * @return the timeAveraged
     */
    public double getTimeAveraged() {
        return timeAveraged;
    }

    /**
     * @param timeAveraged the timeAveraged to set
     */
    public void setTimeAveraged(double timeAveraged) {
        this.timeAveraged = timeAveraged;
    }
    
    
}
