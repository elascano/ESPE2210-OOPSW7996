/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q38.model;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class A {
    private A a;

    public A(){
        
    }
    
    public A(A a) {
        this.a = a;
    }
    
    @Override
    public String toString() {
        return "A{" + "a=" + a + '}';
    }
    
    /**
     * @return the a
     */
    public A getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(A a) {
        this.a = a;
    }
    
}
