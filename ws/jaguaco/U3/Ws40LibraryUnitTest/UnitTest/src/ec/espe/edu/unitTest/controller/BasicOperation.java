package ec.espe.edu.unitTest.controller;
/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class BasicOperation {

    public float add(float addend1, float addend2) {
        float sum;
        //complex algorith
        sum = addend1 + addend2;
        return sum;
    }

    public float subtract(float minuhend, float sustrahend) {
        float product;
        product = minuhend - sustrahend;
        return product;
    }

    public float multiply(float multiplying, float multiplier) {
        float productmultiply;
        productmultiply = multiplying * multiplier;
        return productmultiply;
    }

    public float division(float divisor, float diviser) {
        float quotient;
        quotient = divisor / diviser;
        return quotient;
    }
}
