
package ec.edu.espe.calculator.controller;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class BasicOperation {

    public float add(float addend1, float addend2){
        float sum;
        sum = addend1 + addend2;
        return sum;
    }
    
    public float subtract(float minuend, float subtrahend){
        float difference;
        difference = minuend -  subtrahend;
        difference = Math.round(difference * 100.0F) / 100.0F;
        return difference;
    }
    
    public float multiply(float multiplicand, float multiplicator){
        float product;
        product = multiplicand * multiplicator;
        product = Math.round(product * 100.0F) / 100.0F;
        return product;
    }
    
    public float divide(float divisor, float dividend){
        float quotient;
        quotient = divisor / dividend;
        return quotient;
    }
    
}
