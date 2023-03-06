
package ec.edu.espe.calculator.model;

/**
 *
 * @author Sebastian Verdugo, Jefferson Ulco, Justin Villarroel, DCOO-ESPE
 */
public class Divide {
    private float dividend;
    private float divider;
    private float expectedResult;

    public Divide(float dividend, float divider, float expectedResult) {
        this.dividend = dividend;
        this.divider = divider;
        this.expectedResult = expectedResult;
    }

    /**
     * @return the dividend
     */
    public float getDividend() {
        return dividend;
    }

    /**
     * @param dividend the dividend to set
     */
    public void setDividend(float dividend) {
        this.dividend = dividend;
    }

    /**
     * @return the divider
     */
    public float getDivider() {
        return divider;
    }

    /**
     * @param divider the divider to set
     */
    public void setDivider(float divider) {
        this.divider = divider;
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
