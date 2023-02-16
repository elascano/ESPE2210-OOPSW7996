package ec.edu.espe.calculator.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class TestCase {
    private float value1;
    private float value2;
    private float expectedResult;

    public TestCase(float value1, float value2, float expectedResult) {
        this.value1 = value1;
        this.value2 = value2;
        this.expectedResult = expectedResult;
    }

    /**
     * @return the value1
     */
    public float getValue1() {
        return value1;
    }

    /**
     * @param value1 the value1 to set
     */
    public void setValue1(float value1) {
        this.value1 = value1;
    }

    /**
     * @return the value2
     */
    public float getValue2() {
        return value2;
    }

    /**
     * @param value2 the value2 to set
     */
    public void setValue2(float value2) {
        this.value2 = value2;
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
