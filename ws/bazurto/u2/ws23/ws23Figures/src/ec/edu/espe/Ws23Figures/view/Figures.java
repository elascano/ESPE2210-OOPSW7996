/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Ws23Figures.view;

import ec.edu.espe.Ws23Figures.model.Circle;
import ec.edu.espe.Ws23Figures.model.Rectangle;
import ec.edu.espe.Ws23Figures.model.Triangle;
import java.util.Scanner;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Figures {
   
    public static void main(String[] args){
        Scanner imputEscan = new Scanner (System.in);
        float side1;
        float side2;
        float radio;
        Circle circle;
        Rectangle rectangle =null;
        int choiceOfTheMenu=0;
        Triangle triangle;
        rectangle = new Rectangle(0,0,0,0,0);
        circle =new Circle(0,0,0,0,0);
        triangle = new Triangle(0,0,0,0,0);
        
        
        do{
            printMenu();
            choiceOfTheMenu = imputEscan.nextInt();
            switch(choiceOfTheMenu){
                case 1:{
                    System.out.print("Imput side 1: " );
                    side1 = imputEscan.nextFloat();
                    System.out.print("Imput side 2: " );
                    side2 = imputEscan.nextFloat();
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Area the rectangle is: " + rectangle.areaRec(side1, side2));
                    System.out.println("Perimeter the rectangle is: " + rectangle.perimeterRec(side1, side2));
                    System.out.println("-------------------------------------------------------");
                    break;    
                }
                
                case 2:{
                    System.out.print("Imput side 1: " );
                    side1 = imputEscan.nextFloat();
                    System.out.print("Imput side 2: " );
                    side2 = imputEscan.nextFloat();
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Area the triangle is: " + triangle.areaTrian(side1, side2));
                    System.out.println("-------------------------------------------------------");
                    break;
                }
                case 3:{
                    System.out.print("Imput radio: " );
                    radio = imputEscan.nextFloat();
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Area the circle is: " + circle.areaCirc(radio));
                    System.out.println("Perimeter the circle is: " + circle.perimeterCirc(radio));
                    System.out.println("-------------------------------------------------------");
                    break;
                }
                case 4:{
                    break;
                }
                default:{
                    System.out.println("Wrong option");
                    
                    break;
                }
            }
        }while(choiceOfTheMenu!=4);
       
        
    }
    
    private static void printMenu(){
        System.out.println("---------Menu Figures---------");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.println("4. Exict");
        System.out.print("Choice: ");
    }
}
