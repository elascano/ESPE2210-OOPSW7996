package ec.edu.espe.calculator.controller;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class BasicOperation {

    public static double add(double addend1, double addend2) {
        double sum;
        sum = addend1 + addend2;
        sum = (double) Math.round(sum * 1000d) / 1000d;
        return sum;
    }

    public static double substract(double minuend, double subtrahend) {
        double difference;
        difference = minuend - subtrahend;
        difference = (double) Math.round(difference * 1000d) / 1000d;
        return difference;
    }

    public static double multiply(double multiplicand, double muliplier) {
        double product;
        product = multiplicand * muliplier;
        multiplicand = (double) Math.round(multiplicand * 1000d) / 1000d;
        return product;

    }

    public static double divide(double dividend, double divisor) {
        double quotient = 0.0F;

        quotient = dividend / divisor;
        quotient = (double) Math.round(quotient * 1000d) / 1000d;
        return quotient;
    }

}
