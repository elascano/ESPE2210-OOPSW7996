
package ec.edu.espe.Figures.view;

import ec.edu.espe.Figures.model.Circulo;
import ec.edu.espe.Figures.model.Rectangulo;
import ec.edu.espe.Figures.model.Triangulo;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Figures {

    public static void main(String[] args) {

        
        Circulo circulo = null ;
        Rectangulo rectangulo = null;
        Triangulo triangulo = null;
     
        circulo = new Circulo(16.6667F, 3.1416F);
        rectangulo = new Rectangulo(5,3);
        triangulo = new Triangulo(17, 12, 20, 20);
        
        System.out.println("cicle--->"+circulo);
        circulo.Area(16.6667F);
        System.out.println("=====================================");
        circulo.Perimeter(16.6667F);
        System.out.println("rectangle--->"+rectangulo);
        System.out.println("=====================================");
        rectangulo.Area(5, 3);
        rectangulo.Perimeter(5, 3);
        System.out.println("=====================================");
        System.out.println("triangle--->"+triangulo);
        triangulo.Area(17, 12);
        triangulo.Perimeter(17, 12);


    }
    
}
