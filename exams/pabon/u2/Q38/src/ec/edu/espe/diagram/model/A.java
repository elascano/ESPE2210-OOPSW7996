package ec.edu.espe.diagram.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class A {
    
    private int a;
    int c;
    
    
    public A(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
 
    @Override
    public String toString() {
        return "A{" + "c=" + c + '}';
    }

    
}
