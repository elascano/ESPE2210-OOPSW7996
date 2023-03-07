package ec.edu.espe.ws39unittest.controller;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class BasicOperation {
    
    public double add(double addend1, double addend2){
        double sum;
        sum = addend1 + addend2;
        return (double) Math.round(sum * 1000d) / 1000d;
    }
    
    public double subtract(double minuend, double substraend){
        double diference;
         diference = minuend - substraend;
        
        return (double) Math.round(diference * 1000d) / 1000d;
    }
    
    public double multiply(double multiplicand, double multiplier){
        double product;
        product =  multiplicand * multiplier;
        return (double) Math.round(product * 1000d) / 1000d;
    }
    
    public double divide(double dividend, double divisor){
        double quotient;
        quotient = dividend / divisor;
        return (double) Math.round(quotient * 1000d) / 1000d;
    }
    
}
