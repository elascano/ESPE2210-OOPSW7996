
package ec.edu.espe.controller;

import java.text.DecimalFormat;

/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
 */
public class BasicOperation {
    public float add(float addend1, float addend2){
        float sum;
        sum=addend1+addend2;
        DecimalFormat newFormat = new DecimalFormat("#.##");
        return Float.valueOf(newFormat.format(sum));
    }
    public float subtract(float minuend, float subtrahend){
        float difference;
        difference=minuend-subtrahend;
        DecimalFormat newFormat = new DecimalFormat("#.##");
        return Float.valueOf(newFormat.format(difference));
    }
    public float multiply(float multiplicand, float multiplier){
        float product;
        product=multiplicand*multiplier;
        DecimalFormat newFormat = new DecimalFormat("#.##");
        return Float.valueOf(newFormat.format(product));
    }
    public float division(float dividend, float divider){
        float quotient;
        quotient = dividend / divider;
        DecimalFormat newFormat = new DecimalFormat("#.##");
        return Float.valueOf(newFormat.format(quotient));
    }
}
