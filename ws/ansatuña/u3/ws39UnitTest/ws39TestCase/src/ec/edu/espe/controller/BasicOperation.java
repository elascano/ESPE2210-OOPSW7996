
package ec.edu.espe.controller;

/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
 */
public class BasicOperation {
    public float add(float addend1, float addend2){
        float sum;
        sum=addend1+addend2;
        return sum;
    }
    public float subtract(float minuend, float subtrahend){
        float difference;
        difference=minuend-subtrahend;
        return difference;
    }
    public float multiply(float multiplicand, float multiplier){
        float product;
        product=multiplicand*multiplier;
        return product;
    }
    public float division(float dividend, float divider){
        float quotient;
        quotient = dividend / divider;
        return quotient;
    }
}
