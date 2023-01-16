/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Q61.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Keyboard {
    private int id;
    private double longInCm;
    private double widthInCm;

    public Keyboard(int id, double longInCm, double broadInCm) {
        this.id = id;
        this.longInCm = longInCm;
        this.widthInCm = broadInCm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLongInCm() {
        return longInCm;
    }

    public void setLongInCm(double longInCm) {
        this.longInCm = longInCm;
    }

    public double getWidthInCm() {
        return widthInCm;
    }

    public void setWidthInCm(double widthInCm) {
        this.widthInCm = widthInCm;
    }

    
    
}
