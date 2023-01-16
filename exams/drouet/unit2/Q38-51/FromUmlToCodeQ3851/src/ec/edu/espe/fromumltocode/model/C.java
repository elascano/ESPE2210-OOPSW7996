/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fromumltocode.model;

import java.util.ArrayList;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class C extends A{
    
    private ArrayList<E> es;

    public C(ArrayList<E> es, ArrayList<A> a) {
        super(a);
        this.es = es;
    }

    /**
     * @return the es
     */
    public ArrayList<E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList<E> es) {
        this.es = es;
    }
    
    
    
}
