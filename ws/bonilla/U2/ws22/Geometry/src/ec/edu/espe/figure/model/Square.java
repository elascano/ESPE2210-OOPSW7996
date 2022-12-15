
package ec.edu.espe.figure.model;

public class Square 
{
   private float base;
   private float altura;

    public Square(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getArea()
    {
        return getAltura()*getBase();
    }
   
}
