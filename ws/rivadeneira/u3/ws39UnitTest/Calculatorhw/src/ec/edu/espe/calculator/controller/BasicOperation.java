
package ec.edu.espe.calculator.controller;

import java.util.Scanner;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class BasicOperation {
      Scanner sn = new Scanner(System.in);
      
    public float add(){
        float addend1; 
        float addend2;
        float sum;
        
        System.out.println("Enter the first addend");
        addend1 = sn.nextFloat();
        System.out.println("Enter the second addend");
        addend2 = sn.nextFloat();
        sum = addend1 + addend2;
        System.out.println("sum -->     "+sum);
        
        return sum;
    }
    public float subtract(){
        float minuend; 
        float subtrahend;
        float difference;
        
        System.out.println("Enter the minuend");
        minuend = sn.nextFloat();
        System.out.println("Enter the subtrahend");
        subtrahend = sn.nextFloat();
        difference = minuend - subtrahend;
        System.out.println("difference -->     "+ difference);
        
        return difference;
    }
    
    public float multiply(){
        float multiplicand; 
        float multiplier;
        float product;
        
        System.out.println("Enter the multiplicand");
        multiplicand = sn.nextFloat();
        System.out.println("Enter the multiplier");
        multiplier = sn.nextFloat();
        product = multiplicand * multiplier;
        System.out.println("product -->     "+ product);
        
        return product;

    }
    
    public float division(){
        float dividend; 
        float divisor;
        float quotient;
        
        System.out.println("Enter the dividend");
        dividend = sn.nextFloat();
        System.out.println("Enter the divisor");
        divisor = sn.nextFloat();
        quotient = dividend / divisor;
        System.out.println("quotient -->     "+ quotient);
        
        return quotient;

    }
}
