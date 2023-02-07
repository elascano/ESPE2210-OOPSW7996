package ec.edu.espe.calculator.model;

/**
 *
 * @author Sebastian Verdugo, Jefferson Ulco, Justin Villarroel, DCOO-ESPE
 */
public class Add {

    private float addent1;
    private float addent2;
    private float expectedResult;

    public Add(float addent1, float addent2, float expectedResult) {
        this.addent1 = addent1;
        this.addent2 = addent2;
        this.expectedResult = expectedResult;
    }

    /**
     * @return the addent1
     */
    public float getAddent1() {
        return addent1;
    }

    /**
     * @param addent1 the addent1 to set
     */
    public void setAddent1(float addent1) {
        this.addent1 = addent1;
    }

    /**
     * @return the addent2
     */
    public float getAddent2() {
        return addent2;
    }

    /**
     * @param addent2 the addent2 to set
     */
    public void setAddent2(float addent2) {
        this.addent2 = addent2;
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
