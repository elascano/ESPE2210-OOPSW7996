package ec.edu.espe.calculator.view;
import ec.edu.espe.calculator.controller.BasicOperation;
import java.util.Scanner;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicOperation basicOperation = new BasicOperation();
        int optionMenu = 0;
        do{
            menuOption();
        optionMenu = sc.nextInt();
        switch(optionMenu){
            case 1 ->{
                float sum =0;
                float addend1, addend2;
                System.out.print("Enter number 1: ");
                addend1 = sc.nextFloat();
                System.out.print("Enter number 2: ");
                addend2 = sc.nextFloat();
                sum = basicOperation.add(addend1, addend2);
                System.out.println("The sum is -->"+sum);
            }
            case 2->{
                float difference = 0;
                float minuend,subtrahend;
                System.out.print("Enter minuend: ");
                minuend = sc.nextFloat();
                System.out.print("Enter subtrahend: ");
                subtrahend = sc.nextFloat();
                difference = basicOperation.subtract(minuend, subtrahend);
                System.out.println("The difference is -->"+difference);
            }
            case 3->{
                float product = 0;
                float multiplicand,multiplier;
                System.out.print("Enter multiplicand: ");
                multiplicand = sc.nextFloat();
                System.out.print("Enter multiplier: ");
                multiplier = sc.nextFloat();
                product = basicOperation.multiply(multiplicand, multiplier);
                System.out.println("The product is -->"+product);
            }
            case 4->{
                float quotient = 0;
                float dividend,divisor;
                System.out.print("Enter the dividend: ");
                dividend = sc.nextFloat();
                System.out.print("Enter the divisor: ");
                divisor = sc.nextFloat();
                quotient = basicOperation.divide(dividend, divisor);
                System.out.println("Tue quotient is ->"+quotient);
            }
            case 5->{
                return;
            }
        }
            
        }while(optionMenu != 5);
    }

    public static void menuOption() {
        System.out.println("*******************CALCULATOR******************");
        System.out.println("*******Choose the option******");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("***********************************************");
        System.out.print("Please type the option: ");
    }
}
