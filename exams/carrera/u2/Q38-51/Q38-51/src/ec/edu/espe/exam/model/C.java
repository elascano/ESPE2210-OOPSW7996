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
public class C extends A{
    private E eValue;

    public void print(E e) {
        System.out.println("This is a E value: " + e);
    }

    @Override
    public String toString() {
        return "C{" + "eValue=" + eValue + '}';
    }

    /**
     * @return the eValue
     */
    public E getEValue() {
        return eValue;
    }

    /**
     * @param eValue the eValue to set
     */
    public void setEValue(E eValue) {
        this.eValue = eValue;
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
