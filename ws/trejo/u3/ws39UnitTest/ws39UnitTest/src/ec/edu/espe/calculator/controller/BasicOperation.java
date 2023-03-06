package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.Add;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class BasicOperation {

    public static Add add(Add addEntered) {
        float sum;
        //complex algorithm
        sum= addEntered.getAddend1() + addEntered.getAddend2();

        addEntered.setSum(sum);
        return addEntered;

    }

    public static float subtract(float minuend, float subtrahend) {
        float difference;
        difference = minuend - subtrahend;

        return difference;

    }

    public static float multiply(float multiplicand, float multiplier) {
        float product;
        product = multiplicand * multiplier;

        return product;

    }

    public static float divide(float dividend, float divisior) {
        float quotient;
        quotient = dividend / divisior;
        return quotient;

    }

}
