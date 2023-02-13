
package ec.edu.espe.calculator.model;

/**
 *
 * @author Sebastian Verdugo, Jefferson Ulco, Justin Villarroel, DCOO-ESPE
 */
public class Multiply {
   private float multiplicand;
    private float multiplicator;
    private float expectedResult;

    public Multiply(float multiplicand, float multiplicator, float expectedResult) {
        this.multiplicand = multiplicand;
        this.multiplicator = multiplicator;
        this.expectedResult = expectedResult;
    }

    /**
     * @return the multiplicand
     */
    public float getMultiplicand() {
        return multiplicand;
    }

    /**
     * @param multiplicand the multiplicand to set
     */
    public void setMultiplicand(float multiplicand) {
        this.multiplicand = multiplicand;
    }

    /**
     * @return the multiplicator
     */
    public float getMultiplicator() {
        return multiplicator;
    }

    /**
     * @param multiplicator the multiplicator to set
     */
    public void setMultiplicator(float multiplicator) {
        this.multiplicator = multiplicator;
    }

    /**
     * @return the expectedResult
     */
    public float getExpectedResult() {
        return expectedResult;
    }

    /**
     * @param expectedResult the expectedResult to set
     */
    public void setExpectedResult(float expectedResult) {
        this.expectedResult = expectedResult;
    }
   
}
