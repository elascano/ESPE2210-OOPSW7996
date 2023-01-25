/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q38.model;

import java.util.ArrayList;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class C extends A {
    private ArrayList<E> e;

    public C(){
        
    }
    
    public C(ArrayList<E> e, A a) {
        super(a);
        this.e = e;
    }

    @Override
    public String toString() {
        return "C{" + "e=" + e + '}';
    }
    
    /**
     * @return the e
     */
    public ArrayList<E> getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(ArrayList<E> e) {
        this.e = e;
    }

    
}
