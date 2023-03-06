
package ec.edu.espe.calculator.controller;

import java.util.Scanner;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class BasicOperation {
    Scanner sc = new Scanner(System.in);
    
    public float add(float addend1, float addend2){

        float sum;
        sum = addend1 + addend2;
        System.out.println("The result is " + sum);
        return sum;
    }
    
    public float subtract(){
        float minuend;
        float subtrahend;
        float difference;
        
        System.out.println("Enter the minuend: ");
        minuend = sc.nextFloat();
        System.out.println("Enter the subtrahend: ");
        subtrahend = sc.nextFloat();
        difference = minuend - subtrahend;
        System.out.println("The result is " + difference);
        return difference;
    }
    
    public float multiply(){
        float multiplicand;
        float multiplicator;
        float product;
        
        System.out.println("Enter the multiplicand: ");
        multiplicand = sc.nextFloat();
        System.out.println("Enter the multiplicator: ");
        multiplicator = sc.nextFloat();
        product = multiplicand * multiplicator;
        System.out.println("The result is " + product);
        return product;
    }
    
    public float division(){
        float dividend;
        float divisor;
        float quotient;
        
        System.out.println("Enter the dividend: ");
        dividend = sc.nextFloat();
        System.out.println("Enter the divisor: ");
        divisor = sc.nextFloat();
        quotient = dividend / divisor;
        System.out.println("The result is " + quotient);
        return quotient;
    }
}
