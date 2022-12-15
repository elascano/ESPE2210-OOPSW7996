
package ec.edu.espe.figure.view;
import ec.edu.espe.figure.model.Circulo;
import ec.edu.espe.figure.model.Rectangulo;
import ec.edu.espe.figure.model.Triangulo;
import ec.edu.espe.figure.model.Shape.*;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Figures {
    public static void main(String[] args) {
        Circulo circulo;
        Triangulo triangulo;
        Rectangulo rectangulo;
        
        circulo = new Circulo(0, 0, (float) 16.67);
        triangulo = new Triangulo(17, 12, 0);
        rectangulo = new Rectangulo(5, 3, 0);
        
        System.out.println("Circulo -->"+circulo);
        System.out.println("Triangulo -->"+triangulo);
        System.out.println("Rectangulo -->"+rectangulo);
        
         System.out.println("Triangulo area-->"+triangulo.areaOfFigures(17, 12));
         System.out.println("Rectangulo area-->"+rectangulo.areaOfFigures(5, 3));
         System.out.println("Circulo area-->"+circulo.areaOfCircle((float) 16.67));
         System.out.println("Triangulo Perimetro-->"+triangulo.perimeterOfFigures(17, 12));
         System.out.println("Rectangulo perimetro-->"+rectangulo.perimeterOfFigures(5, 3));
         System.out.println("Circulo perimetro-->"+circulo.perimetroOfCircle((float) 16.67));
    }
    
}
