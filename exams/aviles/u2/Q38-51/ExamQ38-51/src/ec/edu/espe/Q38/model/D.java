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
public class D extends A{
    
    private ArrayList<E> e;
    private ArrayList<F> f;

    public ArrayList<E> getE() {
        return e;
    }

    public void setE(ArrayList<E> e) {
        this.e = e;
    }

    public ArrayList<F> getF() {
        return f;
    }

    public void setF(ArrayList<F> f) {
        this.f = f;
    }

    public D(ArrayList<E> e, ArrayList<F> f) {
        this.e = e;
        this.f = f;
    }

    
}
