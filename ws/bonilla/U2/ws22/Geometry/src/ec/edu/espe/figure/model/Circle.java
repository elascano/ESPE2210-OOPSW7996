package ec.edu.espe.figure.model;

public class Circle 
{
    private float radio;

    public Circle(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio*radio;
    }
    
}
