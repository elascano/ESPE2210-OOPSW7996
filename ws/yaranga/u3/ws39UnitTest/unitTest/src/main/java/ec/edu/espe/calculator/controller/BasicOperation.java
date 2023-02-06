package ec.edu.espe.calculator.controller;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class BasicOperation {

    public static float add(float addend1, float addent2) {
        float sum;
        sum = addend1 + addent2;
        return sum;
    }

    public static float substract(float minuend, float subtrahend) {
        float difference;
        difference = minuend - subtrahend;
        return difference;
    }

    public static float multiply(float multiplicand, float muliplier) {
        float product;
        product = multiplicand * muliplier;
        return product;

    }

    public static float divide(float dividend, float divisor) {
        float quotient = 0.0F;

       
            quotient = dividend / divisor;
        

        return quotient;
    }

}
