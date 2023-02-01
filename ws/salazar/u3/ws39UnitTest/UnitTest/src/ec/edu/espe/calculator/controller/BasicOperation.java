package ec.edu.espe.calculator.controller;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class BasicOperation {
    public static float add(float addend1, float addend2){
        float sum;
        sum = addend1 + addend2;
        return sum;
    }
    
    public static float subtract(float minuend, float subtrahend){
        float difference;
        difference = minuend - subtrahend;
        return difference;
    }
    
    public static float multiply(float multiplicad, float multiplicator){
        float product;
        product = multiplicad * multiplicator;
        return product;
    }
    
    public static float division(float divident, float divisor){
        float quotient;
        quotient=divident/divisor;
        return quotient;
    }
}
