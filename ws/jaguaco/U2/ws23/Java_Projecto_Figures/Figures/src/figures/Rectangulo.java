package figures;
/**
 *
 * @author DCCO-ESPE - Pythons - Jonathan Jaguaco
 */
public class Rectangulo extends Shape{
    @Override
    public void area(){
        calcularArea();
    }
public static void calcularArea(){
    int base = 5 ;
    int area, altura = 3;
    area = base*altura;
    System.out.println("El resultado de el area del rectangulo es:" + area);
    }
}
