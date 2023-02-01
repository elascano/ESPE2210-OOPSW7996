package ec.edu.espe.calculator.controller;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
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

    public float division(float dividend, float divider) {
        float quotint;
        quotint = dividend / divider;
        return quotint;
    }

}
