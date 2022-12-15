/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.Figures.view;

import ec.edu.espe.Figures.model.Circulo;
import ec.edu.espe.Figures.model.Rectangulo;
import ec.edu.espe.Figures.model.Shape;
import ec.edu.espe.Figures.model.Triangulo;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Figures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Shape shape = null;
        Circulo circulo = null;
        Rectangulo rectangulo= null;
        Triangulo triangulo=null;
     
        circulo.Perimeter(16.6667F);
        rectangulo.AreaAndPerimeter(5, 3);
        triangulo.AreaAndPerimeter(17, 12);
        
        circulo = new Circulo(16.6667F,2.3F,2,circulo.Perimeter(16.6667F));
        rectangulo= new Rectangulo();
        triangulo = new Triangulo();
        
        
        
        System.out.println("cicle--->"+circulo);
        System.out.println("rectangle--->"+rectangulo);
        System.out.println("triangle"+triangulo);

    }
    
}
