
package ec.edu.espe.calculator.model;

/**
 *
 * @author Sebastian Verdugo, Jefferson Ulco, Justin Villarroel, DCOO-ESPE
 */
public class Subtract {
    private float minuend;
    private float substrahend;
    private float expectedResult;

    public Subtract(float minuend, float substrahend, float expectedResult) {
        this.minuend = minuend;
        this.substrahend = substrahend;
        this.expectedResult = expectedResult;
    }

    /**
     * @return the minuend
     */
    public float getMinuend() {
        return minuend;
    }

    /**
     * @param minuend the minuend to set
     */
    public void setMinuend(float minuend) {
        this.minuend = minuend;
    }

    /**
     * @return the substrahend
     */
    public float getSubstrahend() {
        return substrahend;
    }

    /**
     * @param substrahend the substrahend to set
     */
    public void setSubstrahend(float substrahend) {
        this.substrahend = substrahend;
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
