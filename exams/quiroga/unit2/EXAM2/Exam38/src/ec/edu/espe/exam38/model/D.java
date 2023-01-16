/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam38.model;

import java.util.ArrayList;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class D extends A{
    private ArrayList<D> d = new ArrayList<D>();
    private E e[] = new E[5];

    /**
     * @return the d
     */
    public ArrayList<D> getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(ArrayList<D> d) {
        this.d = d;
    }

    /**
     * @return the e
     */
    public E[] getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(E[] e) {
        this.e = e;
    }
    
    
}
