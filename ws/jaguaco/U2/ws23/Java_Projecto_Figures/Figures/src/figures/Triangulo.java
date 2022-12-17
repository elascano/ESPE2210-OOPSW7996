package figures;
/**
 *
 * @author DCCO-ESPE - Pythons - Jonathan Jaguaco
 */
public class Triangulo extends Shape {
    @Override
    public void area(){
        calcularArea();
    }
public static void calcularArea(){
    int  base = 17;
    int  altura = 12;
    int area;
    area = base*altura/2;
    System.out.println("El resultado de el area del triangulo es:" + area);
    }
}
