package ec.edu.espe.calculator.controller;
/**
 *
 * @author Alejandro Cuadrado, DeveloperBears,DCCO-ESPE
 */
public class BasicOperation {
    public float add(float addend1, float addend2) {
        float sum;
        sum = addend1 + addend2;
        return sum;
    }
    public float subtract(float minuend, float subtrahend) {
        float difference;
        difference = minuend - subtrahend;
        return difference;
    }
    public float multiply(float multiplying, float multiplier) {
        float product;
        product = multiplying * multiplier;
        return product;
    }
    public float division(float dividend, float divisor) {
        float quotient;
        quotient = dividend / divisor;
        return quotient;
    }
}