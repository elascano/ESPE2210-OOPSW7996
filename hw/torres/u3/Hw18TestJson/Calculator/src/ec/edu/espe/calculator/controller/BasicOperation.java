/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calculator.controller;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class BasicOperation {

    public float add(float addend1, float addend2){
        float sum;
        sum = addend1 + addend2;
        return sum;
    }
    
    public float subtract(float minuend, float subtrahend){
        float difference;
        difference = minuend -  subtrahend;
        return difference;
    }
    
    public float multiply(float multiplicand, float multiplicator){
        float product;
        product = multiplicand * multiplicator;
        return product;
    }
    
    public float divide(float divisor, float dividend){
        float quotient;
        quotient = divisor / dividend;
        return quotient;
    }
    
}
