/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calculator.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Operation {

    private double value1;
    private double value2;
    private double expectedValue;

    public Operation() {
        this.value1 = 0;
        this.value2 = 0;
        this.expectedValue = 0;
    }

    public Operation(double value1, double value2, double expectedValue) {
        this.value1 = value1;
        this.value2 = value2;
        this.expectedValue = expectedValue;
    }

    

    /**
     * @return the value1
     */
    public double getValue1() {
        return value1;
    }

    /**
     * @param value1 the value1 to set
     */
    public void setValue1(double value1) {
        this.value1 = value1;
    }

    /**
     * @return the value2
     */
    public double getValue2() {
        return value2;
    }

    /**
     * @param value2 the value2 to set
     */
    public void setValue2(double value2) {
        this.value2 = value2;
    }

    /**
     * @return the expectedValue
     */
    public double getExpectedValue() {
        return expectedValue;
    }

    /**
     * @param expectedValue the expectedValue to set
     */
    public void setExpectedValue(double expectedValue) {
        this.expectedValue = expectedValue;
    }

  

}
