package ec.edu.espe.calculator.contoller;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class BasicOperation {
    public static float add(float addend1, float addend2){
        float sum;
        sum = addend1+addend2;
        BigDecimal decimalFormat = new BigDecimal(sum);
        decimalFormat = decimalFormat.setScale(2, RoundingMode.HALF_UP);
        sum=decimalFormat.floatValue();
        if(sum==0.0F)
            sum=0F;
        System.out.println("Sum = "+sum);
        return sum;
    }
    public static float substract(float minuend, float substrahend){
        float difference;
        difference = minuend-substrahend;
        System.out.println("Difference = "+difference);
        BigDecimal decimalFormat = new BigDecimal(difference);
        decimalFormat = decimalFormat.setScale(2, RoundingMode.HALF_UP);
        difference=decimalFormat.floatValue();
        if(difference==0.0F)
            difference=0F;
        System.out.println("Difference = "+difference);
        return difference;
    }
    public static float multiply(float multiplicand, float multioliet){
        float product;
        product = multiplicand*multioliet;
        System.out.println("Product = "+product);
        BigDecimal decimalFormat = new BigDecimal(product);
        decimalFormat = decimalFormat.setScale(2, RoundingMode.HALF_UP);
        product=decimalFormat.floatValue();
        if(product==0.0F)
            product=0F;
        System.out.println("Product = "+product);
        return product;
    }
    public static float divide(float dividend, float divisor){
        float quotient;
        quotient = dividend/divisor;
        System.out.println("Quotient = "+quotient);
        BigDecimal decimalFormat = new BigDecimal(quotient);
        decimalFormat = decimalFormat.setScale(2, RoundingMode.HALF_UP);
        quotient=decimalFormat.floatValue();
        if(quotient==0.0F)
            quotient=0F;
        System.out.println("Quotient = "+quotient);
        return quotient;
    }
}
