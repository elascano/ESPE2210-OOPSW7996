/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.FromUmlToCode.model;

/**
 *
 * @author H303
 */
public abstract class A {
    private int a;

    public A(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "A{" + "a=" + a + '}';
    }
    
   
    public abstract void make();

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }
 
    
}
