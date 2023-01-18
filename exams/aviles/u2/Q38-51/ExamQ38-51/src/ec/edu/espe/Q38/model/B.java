/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Q38.model;

import java.util.ArrayList;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class B extends A{
    private ArrayList<H> h;

    public B(ArrayList<H> h) {
        this.h = h;
    }

    public ArrayList<H> getH() {
        return h;
    }

    public void setH(ArrayList<H> h) {
        this.h = h;
    }
}
