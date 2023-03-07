package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.contoller.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option;
        Scanner read=new Scanner(System.in);
        
        do {
            
            System.out.println("=======================");
            System.out.println("=   Basic Operation   =");
            System.out.println("= 1. Addition         =");
            System.out.println("= 2. Subtraction      =");
            System.out.println("= 3. Multiplication   =");
            System.out.println("= 4. Division         =");
            System.out.println("= 5. Exit             =");
            System.out.println("=======================");
            
            System.out.println("Choose a option: ");
            option=read.nextInt();
            
            switch(option){
                case 1:
                    float addend1;
                    float addend2;
                    System.out.println("Enter the addend1: ");
                    addend1=read.nextFloat();
                    System.out.println("Enter the addend2: ");
                    addend2=read.nextFloat();
                    BasicOperation.add(addend1,addend2);
                    break;
                case 2:
                    float minuend;
                    float substrahend;
                    System.out.println("Enter the minuend: ");
                    minuend=read.nextFloat();
                    System.out.println("Enter the substrahend: ");
                    substrahend=read.nextFloat();
                    BasicOperation.substract(minuend,substrahend);
                    break;
                case 3:
                    float multiplicand;
                    float multioliet;
                    System.out.println("Enter the multiplicand: ");
                    multiplicand=read.nextFloat();
                    System.out.println("Enter the multioliet: ");
                    multioliet=read.nextFloat();
                    BasicOperation.multiply(multiplicand,multioliet);
                    break;
                case 4:
                    float dividend;
                    float divisor;
                    System.out.println("Enter the dividend: ");
                    dividend=read.nextFloat();
                    System.out.println("Enter the divisor: ");
                    divisor=read.nextFloat();
                    BasicOperation.divide(dividend,divisor);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }
            
        }while(option !=5);
        
    }
    
}
