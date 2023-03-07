package ec.edu.espe.calculator.model.DataFormat;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class DataFormat {

    private float value1;
    private float value2;
    private float expResult;

    public DataFormat(float value1, float value2, float expResult) {
        this.value1 = value1;
        this.value2 = value2;
        this.expResult = expResult;
    }

    @Override
    public String toString() {
        return "DataFormat{" + '}';
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
     * @return the expResult
     */
    public float getExpResult() {
        return expResult;
    }

    /**
     * @param expResult the expResult to set
     */
    public void setExpResult(float expResult) {
        this.expResult = expResult;
    }
}
