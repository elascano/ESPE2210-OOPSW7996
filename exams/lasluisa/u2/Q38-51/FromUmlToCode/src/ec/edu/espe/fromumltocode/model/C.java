/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fromumltocode.model;

import java.util.ArrayList;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class C extends A {
    
    private ArrayList<E> e = new ArrayList<>();

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

    public C() {
    }

    @Override
    public String toString() {
        return "C{" + "e=" + e + '}';
    }
    
    

}
