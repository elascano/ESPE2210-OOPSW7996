package figures;
/**
 *
 * @author DCCO-ESPE - Pythons - Jonathan Jaguaco
 */
public class Circulo extends Shape {
    @Override
    public void area(){
        calcularArea();
    }
    
    public static void calcularArea(){
        float radio = (float) (16.6667*16.6667);
        float area;
        float pi = 3.1616F;
        area = radio*pi;
        System.out.println("El resultado de el area del ciculo es:" + area);
    }
}
