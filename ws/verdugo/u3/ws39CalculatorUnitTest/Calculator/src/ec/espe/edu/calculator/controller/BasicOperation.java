
package ec.espe.edu.calculator.controller;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class BasicOperation {
    public float add(float addend1, float addend2){
        float sum;
        //complex algoritm
        sum = addend1 + addend2;
        return sum;
    }
    
    public float substract(float minuend, float substrahend){
        float difference;
        difference = minuend - substrahend;
        return difference;
    }
    
    public float multiply(float multiplicand, float multiplier){
        float product;
        product = multiplicand * multiplier;
        return product;
    }
    
    public float divide(float dividend, float divisor){
        float quotient;
        quotient = dividend / divisor;
        return quotient;
    }
}
