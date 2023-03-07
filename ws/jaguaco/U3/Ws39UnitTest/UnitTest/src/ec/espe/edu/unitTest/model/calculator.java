package ec.espe.edu.unitTest.model;

import ec.espe.edu.unitTest.controller.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class calculator {

    public static void main(String[] args) {
        BasicOperation basic = new BasicOperation();
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("****************************");
        System.out.println("    -Basic Operations-");
        System.out.println("""
                              -Chose your option:
                              1.Add
                              2.Substraction
                              3.Multiply
                              4.Division
                              5.Exit
                           """);
        System.out.println("****************************");
        option = sc.nextInt();
        //do{
        switch (option) {
            case 1:
                float addend1;
                float addend2;
                float sum;
                System.out.println("Enter the addend 1:");
                addend1 = sc.nextFloat();
                System.out.println("Enter the addend 2:");
                addend2 = sc.nextFloat();
                sum = basic.add(addend1, addend2);
                System.out.println("The sum is -->" + sum);
                break;
            case 2:
                float minuhend;
                float sustrahend;
                float product;
                System.out.println("Enter the minuhend ");
                minuhend = sc.nextFloat();
                System.out.println("Enter the sustrahend");
                sustrahend = sc.nextFloat();
                product = basic.subtract(minuhend, sustrahend);
                System.out.println("Product -->"+product);
                break;
            case 3:
                float multiplying;
                float multiplier;
                float productmultiply;
                System.out.println("Enther the multiplying");
                multiplying = sc.nextFloat();
                System.out.println("Enter the multiplier");
                multiplier = sc.nextFloat();
                productmultiply=basic.multiply(multiplying, multiplier);
                System.out.println("Product Multiply -->" + productmultiply);
                break;
            case 4:
                   float divisor;
                   float diviser;
                   float quotient;
                   System.out.println("Enther the divisor");
                   divisor = sc.nextFloat();
                   System.out.println("Enther the diviser");
                   diviser= sc.nextFloat();
                   quotient = basic.division(divisor, diviser);
                   System.out.println("Quotient -->" + quotient); 
                break;
        }
        //}while(option!=5);

    }

}
