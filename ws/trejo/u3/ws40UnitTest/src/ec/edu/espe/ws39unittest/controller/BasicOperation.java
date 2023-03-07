package ec.edu.espe.ws39unittest.controller;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class BasicOperation {
    
    public static double add(double addend1, double addend2){
        double sum;
        sum = addend1 + addend2;
        return (double) Math.round(sum * 100d) / 100d;
    }
    
    public static double subtract(double minuend, double substraend){
        double diference;
         diference = minuend - substraend;
        
        return (double) Math.round(diference * 100d) / 100d;
    }
    
    public static double multiply(double multiplicand, double multiplier){
        double product;
        product =  multiplicand * multiplier;
        return (double) Math.round(product * 100d) / 100d;
    }
    
    public static double divide(double dividend, double divisor){
        double quotient;
        quotient = dividend / divisor;
        return (double) Math.round(quotient * 100d) / 100d;
    }
    
}
