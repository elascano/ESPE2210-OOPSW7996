/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ws39unittest.model;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class TestValue {
    private double firstValue;
    private double secondValue;
    private double expectedResult;

    @Override
    public String toString() {
        return "TestValue{" + "firstValue=" + firstValue + ", secondValue=" + secondValue + ", expectedResult=" + expectedResult + '}';
    }

    public TestValue(double firstValue, double secondValue, double expectedResult) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.expectedResult = expectedResult;
    }

    public TestValue() {
        this.firstValue = 0.00F;
        this.secondValue = 0.00F;
        this.expectedResult = 0.00F;
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
     * @return the expectedResult
     */
    public double getExpectedResult() {
        return expectedResult;
    }

    /**
     * @param expectedResult the expectedResult to set
     */
    public void setExpectedResult(double expectedResult) {
        this.expectedResult = expectedResult;
    }
    
    
}
