/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam.model;


/**
 *
 * @author kevin
 */
public class B extends A{
    private H hValue;

    @Override
    public String toString() {
        return "B{" + "hValue=" + hValue + '}';
    }
    
    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the hValue
     */
    public H gethValue() {
        return hValue;
    }

    /**
     * @param hValue the hValue to set
     */
    public void sethValue(H hValue) {
        this.hValue = hValue;
    }
}
