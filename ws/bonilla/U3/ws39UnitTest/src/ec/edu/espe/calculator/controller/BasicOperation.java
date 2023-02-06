package ec.edu.espe.calculator.controller;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class BasicOperation 
{
    public float add(float adden1, float adden2)
    {
        float sum;
        sum=adden1+adden2;
        return sum;
        
    }
    public float substract(float minuend, float subtrahend)
    {
        float difference;
        difference=minuend-subtrahend;
        return difference;
        
    }
    public float multiply(float multiplicand, float multiplier)
    {
        float product;
        product=multiplicand*multiplier;
        return product;
    }
    public float divide(float dividend, float divistor)
    {
        float quotient;
        quotient=(dividend/divistor);
        return quotient;
    }
    
}
