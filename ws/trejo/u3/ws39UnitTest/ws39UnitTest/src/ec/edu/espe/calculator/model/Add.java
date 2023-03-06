
package ec.edu.espe.calculator.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class Add {
    private float addend1;
    private float addend2;
    private float sum;

    public Add(float addend1, float addend2, float sum) {
        this.addend1 = addend1;
        this.addend2 = addend2;
        this.sum = sum;
    }

     public Add() {
        addend1 = 0.0F;
        addend2 = 0.0F;
        sum = 0.0F;
    }
    
    public float getAddend1() {
        return addend1;
    }

    public void setAddend1(float addend1) {
        this.addend1 = addend1;
    }

    public float getAddend2() {
        return addend2;
    }

    public void setAddend2(float addend2) {
        this.addend2 = addend2;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }
    
    
}
