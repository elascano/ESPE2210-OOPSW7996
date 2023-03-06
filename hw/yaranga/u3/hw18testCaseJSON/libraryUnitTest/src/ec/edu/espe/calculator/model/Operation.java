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

    private double firstValue;
    private double secondValue;
    private double expectedValue;

    public Operation() {
        this.firstValue = 0;
        this.secondValue = 0;
        this.expectedValue = 0;
    }

    public Operation(double firstValue, double secondValue, double expectedValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.expectedValue = expectedValue;
    }

    /**
     * @return the firstValue
     */
    public double getFirstValue() {
        return firstValue;
    }

    /**
     * @param firstValue the firstValue to set
     */
    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    /**
     * @return the secondValue
     */
    public double getSecondValue() {
        return secondValue;
    }

    /**
     * @param secondValue the secondValue to set
     */
    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
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
