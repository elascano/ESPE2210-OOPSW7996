/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calculator.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class BasicOperation {
    
    public float add(float addend1,float addend2){
        float sum;
        sum = addend1 + addend2;
        BigDecimal bd = new BigDecimal(sum).setScale(2,RoundingMode.HALF_UP);
        return bd.floatValue();
    }
    
    public float subtract(float addend1,float addend2){
        float difference;
        difference = addend1 - addend2;
        BigDecimal bd = new BigDecimal(difference).setScale(2,RoundingMode.HALF_UP);
        return bd.floatValue();
    }
    
    public float multiply(float addend1,float addend2){
        float product;
        product = addend1 * addend2;
        BigDecimal bd = new BigDecimal(product).setScale(2,RoundingMode.HALF_UP);
        return bd.floatValue();
    }
    
    public float divide(float addend1,float addend2){
        float quotient;
        quotient = addend1 / addend2;
        BigDecimal bd = new BigDecimal(quotient).setScale(2,RoundingMode.HALF_UP);
        return bd.floatValue();
    }
}
