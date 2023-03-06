/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calculator.controller;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class BasicOperation {
    int a;
    int b;
    int value1;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
        
    }
    
    
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
