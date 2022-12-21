
package ec.edu.espe.figure.model;

public class Rectangle 
{
     private float base;
   private float altura;

    public Rectangle(float base, float altura) {
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
