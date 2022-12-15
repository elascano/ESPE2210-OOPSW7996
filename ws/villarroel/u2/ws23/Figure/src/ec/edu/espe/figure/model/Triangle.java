/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.figure.model;

import ec.edu.espe.figure.controller.Shape;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Triangle extends Shape{
    
    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    public void perimeter(int base, int height) {
        float halfBase = (base/2);
        float side = (float) Math.sqrt((halfBase*halfBase)+(height*height));
        float perimeter = 3*side;
        System.out.println("The perimeter of the triangle is --> " + perimeter);
    }

    @Override
    public void area(int base, int height) {
        float area = (base*height);
        System.out.println("The Area of the rectangle is --> " + area);   
    }
    
    
}
