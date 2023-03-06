package ec.edu.espe.calculator.controller;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class BasicOperation {
    public float add(float addend1,float addend2){
        float sum;
        sum=addend1+addend2;
        return sum;
    }
    
    public float substract(float minuend,float substrahend){
        float difference;
        difference=minuend-substrahend;
        return difference;
    }
    
    public float multiply(float multiplicand,float multiplicator){
        float product;
        product = multiplicand*multiplicator;
        return product;
    }
    
    public float divide(float dividend, float divisor){
        float quotient;
        quotient=dividend/divisor;
        return quotient;
    }
}
