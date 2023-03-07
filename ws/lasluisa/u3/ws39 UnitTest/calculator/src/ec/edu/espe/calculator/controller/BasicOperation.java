package ec.edu.espe.calculator.controller;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class BasicOperation {

    public float add(float addend1, float addend2) {
        float sum;
        sum = addend1 + addend2;
        return sum;
    }

    public float substract(float minuend, float substrahend) {
        float difference;
        difference = minuend - substrahend;
        return difference;
    }
    
    public float multiplication(float multiplicand, float multiplier){
        float product;
        product = multiplicand * multiplier;
        return product;
    }
    
    public float division(float dividend , float divisor){
        float quotient;
        quotient = dividend / divisor;
        return quotient;
    }
    
    
}
