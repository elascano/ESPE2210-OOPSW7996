package ec.edu.espe.calculator.model;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class ModelCalculator 
{
    private float number1;
    private float number2;

    public ModelCalculator(float number1, float number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public float getNumber1() {
        return number1;
    }

    public void setNumber1(float number1) {
        this.number1 = number1;
    }

    public float getNumber2() {
        return number2;
    }

    public void setNumber2(float number2) {
        this.number2 = number2;
    }
    
    
}
