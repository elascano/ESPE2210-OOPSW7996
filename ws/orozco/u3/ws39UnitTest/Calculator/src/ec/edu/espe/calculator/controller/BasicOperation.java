
package ec.edu.espe.calculator.controller;

/**
 *
 * @author Luis Orozco
 */
public class BasicOperation {
    
    public float add(float addend1, float addend2){
        
        float sum;
        sum = addend1 + addend2;
        return sum;
    }
    
    public float subtract(float minuend, float subtrahend){
        
        float difference;
        difference = minuend - subtrahend;
        return difference;
    }
    
    public float multiplication(float factor1, float factor2){
        
        float product;
        product = factor1 * factor2;
        return product;
    }
   
    public float division(float dividend, float divider){
        
        float quotient;
        quotient = dividend / divider;
        return quotient;
    }
    
}
