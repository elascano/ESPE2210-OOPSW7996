
package ec.edu.espe.calculator.controller;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class BasicOperations {
    
    public float add(float addend1, float addend2) {
        float sum;
        sum = addend1 + addend2;
        return sum;
    }
    
    
    public float subtract(float minuend, float substraend) {
        float difference;
        difference = minuend - substraend;
        return difference;
    }
    
    
   
    public float multiply(float multiplicand, float multiplier) {
        float product;
        product = multiplicand * multiplier;
        return product;
    }
    
    
    
    public float divide(float dividend, float divisor) {
        float quotient;
        quotient = dividend / divisor;
        return quotient;
    }
    
}
