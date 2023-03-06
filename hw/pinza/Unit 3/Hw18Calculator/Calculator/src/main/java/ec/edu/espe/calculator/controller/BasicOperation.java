package ec.edu.espe.calculator.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class BasicOperation {
    public float add(float addend1,float addend2){
        float sum;
        sum=addend1+addend2;
        
        BigDecimal bd = new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
    }
    
    public float substract(float minuend,float substrahend){
        float difference;
        difference=minuend-substrahend;
        BigDecimal bd = new BigDecimal(difference).setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
    }
    
    public float multiply(float multiplicand,float multiplicator){
        float product;
        product = multiplicand*multiplicator;
        BigDecimal bd = new BigDecimal(product).setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
    }
    
    public float divide(float dividend, float divisor){
        float quotient;
        quotient=dividend/divisor;
        BigDecimal bd = new BigDecimal(quotient).setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
    }
}
