package ec.edu.espe.calculator.controller;


/**
 *
 * @author Nicolay Chillo, Gaman GeekLords at DCOO-ESPE
 */
public class BasicOperation {
    
    public float add(float addend1, float addend2){
        float sum;
        float sumTwoDecimal;
        sum = addend1 + addend2;
        sumTwoDecimal = Math.round(sum * 100.0F)/100.0F;
        return sumTwoDecimal  ;
    }
    public float subtract(float minuend, float subtratehd){
        float different;
        different = minuend - subtratehd;
        return different;
    }
    public float multiply(float multiplicand, float multiplier){
        float product;
        product = multiplicand * multiplier;
        return product;
    }
    public float divide(float divisor, float dividend){
        float quotient;
        quotient = dividend / divisor;
        return quotient;
    }
}
