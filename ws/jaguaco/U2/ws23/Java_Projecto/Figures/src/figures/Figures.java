package figures;
/**
 *
 * @author DCCO-ESPE - Pythons - Jonathan Jaguaco
 */
public class Figures {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        
        System.out.println("               BIENVENIDO                            ");
        System.out.println("Sistema para calcular el area de diferentes figuras");
        System.out.println("Jonathan Jaguaco                        O.O.P: 7996");
        System.out.println("              ----AREAS----                           ");
        circulo.area();
        rectangulo.area();
        triangulo.area();
        
    }
    
}
