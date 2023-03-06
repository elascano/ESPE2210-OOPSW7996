
package ec.edu.espe.calculator.controller;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class Operation {

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

    public float multiply(float multiplicand, float multiplicator) {
        float product;
        product=multiplicand*multiplicator;
        return product;
    }

    public float divide(float divisor, float dividend) {
        float quotient;
        quotient = divisor / dividend;
        return quotient;
    }
}
