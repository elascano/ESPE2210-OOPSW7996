
package ec.edu.espe.calculator.model;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class DataFormat {
    private float addend1;
    private float addend2;
    private float expResult;

    @Override
    public String toString() {
        return "DataFormat{" + "addend1=" + addend1 + ", addend2=" + addend2 + ", expResult=" + expResult + '}';
    }

    public DataFormat(float addend1, float addend2, float expResult) {
        this.addend1 = addend1;
        this.addend2 = addend2;
        this.expResult = expResult;
    }

    /**
     * @return the addend1
     */
    public float getAddend1() {
        return addend1;
    }

    /**
     * @param addend1 the addend1 to set
     */
    public void setAddend1(float addend1) {
        this.addend1 = addend1;
    }

    /**
     * @return the addend2
     */
    public float getAddend2() {
        return addend2;
    }

    /**
     * @param addend2 the addend2 to set
     */
    public void setAddend2(float addend2) {
        this.addend2 = addend2;
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
