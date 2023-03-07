
package ec.edu.espe.calculator.controller;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class BasicOperation {
    
    public float add(float addent1, float addend2){
        float sum;
        //complex summary
        sum = addent1 + addend2;
        return sum;
    }
    
     public float subtract(float minuend,float substrahend){
         float difference;
        difference = minuend - substrahend;
        return difference;
        
    }
      public float multiply(float multiplicand,float multiplicator){
        float product;
        product = multiplicand*multiplicator;
        return product;
    }
       public float divide(float dividend, float divisor){
        float quotient;
        quotient=dividend/divisor;
        return quotient;
    }
}
