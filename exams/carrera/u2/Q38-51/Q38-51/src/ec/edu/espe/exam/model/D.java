/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam.model;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class D extends A{
    private E eValue;
    private F fValue;

    public void print(E e, F f){
        System.out.println("These are e and f value: " +e + f);
    }

    @Override
    public String toString() {
        return "D{" + "eValue=" + eValue + ", fValue=" + fValue + '}';
    }
    
    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the eValue
     */
    public E geteValue() {
        return eValue;
    }

    /**
     * @param eValue the eValue to set
     */
    public void seteValue(E eValue) {
        this.eValue = eValue;
    }

    /**
     * @return the fValue
     */
    public F getfValue() {
        return fValue;
    }

    /**
     * @param fValue the fValue to set
     */
    public void setfValue(F fValue) {
        this.fValue = fValue;
    }
}
