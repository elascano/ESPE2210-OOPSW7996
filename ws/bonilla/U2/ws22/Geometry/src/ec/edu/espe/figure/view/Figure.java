
package ec.edu.espe.figure.view;

import ec.edu.espe.figure.model.Circle;
import ec.edu.espe.figure.model.IShape;
import ec.edu.espe.figure.model.Rectangle;
import ec.edu.espe.figure.model.Square;
import java.util.Scanner;

public class Figure 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int chooseOption;
        IShape iShape;
        Square square; 
        Rectangle rectangle;
        float base, altura, radio;
        System.out.println("[1]Square\n[2]Circle\n[3]Rectangle");
        chooseOption=scan.nextInt();
        
        switch(chooseOption)
        {
            case 1:
            {
                System.out.print("enter base: "); 
                base=scan.nextInt();
                System.out.print("enter the height: ");
                altura=scan.nextInt();
                square=new Square(base, altura);
                System.out.print("the area is: "+square.getArea());
                break;
                
            }
            case 2:
            {
                System.out.println("Enter the radio");
                radio=scan.nextFloat();
                Circle circulo=new Circle(radio);
                System.out.println("the area is : "+3.1415*circulo.getRadio());
                break;
                
            }
            case 3:
            {
                System.out.print("enter base: "); 
                base=scan.nextInt();
                System.out.print("enter the height: ");
                altura=scan.nextInt();
                rectangle=new Rectangle(base, altura);
                System.out.print("the area is: "+rectangle.getArea());
                break;
                
            }
        }
       
        
    }
}
