/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.FromUmlToCode.model;

import java.util.ArrayList;

/**
 *
 * @author H303
 */
public class C extends A{
    
    
    
    private ArrayList<E>  ec;

    public C(int a) {
        super(a);
        
    }

    public C(ArrayList<E> ec, int a) {
        super(a);
        this.ec = ec;
    }

    @Override
    public void make() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   

    
    /**
     * @return the ec
     */
    public ArrayList<E> getEc() {
        return ec;
    }

    /**
     * @param ec the ec to set
     */
    public void setEc(ArrayList<E> ec) {
        this.ec = ec;
    }

    
    
}
