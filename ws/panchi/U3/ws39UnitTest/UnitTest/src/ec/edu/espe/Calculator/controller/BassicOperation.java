package ec.edu.espe.Calculator.controller;

import java.util.Scanner;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class BassicOperation {
    static Scanner sc = new Scanner(System.in);
    public float add(){
        float addend1, addend2, sum;
        
        System.out.println("Please enter the addend 1: ");
        addend1 = sc.nextFloat();
        
        System.out.println("Please enter the addend 2: ");
        addend2 = sc.nextFloat();
        
        sum = addend1 + addend2;
        
        System.out.println("The sum is --->" + sum);
        
        return sum;
    }
    
    public float substract(){
        float minuend, subtrahend, difference;

        System.out.println("Please enter the minuend: ");
        minuend = sc.nextFloat();
        
        System.out.println("Please enter the subtrahend: ");
        subtrahend = sc.nextFloat();
        
        difference = minuend - subtrahend;
        
        System.out.println("The difference is --->" + difference);
        
        return difference;
    }
    
    public float multiplication(){
        float multiplier, multilpicand, product;

        System.out.println("Please enter the multiplier: ");
        multiplier = sc.nextFloat();
        
        System.out.println("Please enter the multilpicand: ");
        multilpicand = sc.nextFloat();
        
        product = multiplier * multilpicand;
        
        System.out.println("The product is --->" + product);
        return product;
    }
    
    public float division(){
        float dividend, divisor, quotient;

        System.out.println("Please enter the dividend: ");
        dividend = sc.nextFloat();
        
        System.out.println("Please enter the divisor: ");
        divisor = sc.nextFloat();
        
        while (divisor == 0) {
            System.out.println("Please enter other divisor diferent to 0");
            divisor = sc.nextFloat();
        }
        
        quotient = dividend / divisor;
        
        System.out.println("The quotient is --->" + quotient);
        return quotient;
    }
}
