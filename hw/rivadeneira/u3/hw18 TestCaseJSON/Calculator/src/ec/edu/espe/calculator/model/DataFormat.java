
package ec.edu.espe.calculator.model;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class DataFormat {
    private float addend1;
    private float addend2;
    private float expSum;
    private float minuend;
    private float subtrahend;
    private float expDifference;
    private float multiplicand;
    private float multiplier;
    private float expProduct;
    private float dividend;
    private float divisor;
    private float expQuotient;

    public DataFormat(float addend1, float addend2, float expSum, float minuend, float subtrahend, float expDifference, float multiplicand, float multiplier, float expProduct, float dividend, float divisor, float expQuotient) {
        this.addend1 = addend1;
        this.addend2 = addend2;
        this.expSum = expSum;
        this.minuend = minuend;
        this.subtrahend = subtrahend;
        this.expDifference = expDifference;
        this.multiplicand = multiplicand;
        this.multiplier = multiplier;
        this.expProduct = expProduct;
        this.dividend = dividend;
        this.divisor = divisor;
        this.expQuotient = expQuotient;
    }

    @Override
    public String toString() {
        return "DataFormat{" + "addend1=" + addend1 + ", addend2=" + addend2 + ", expSum=" + expSum + ", minuend=" + minuend + ", subtrahend=" + subtrahend + ", expDifference=" + expDifference + ", multiplicand=" + multiplicand + ", multiplier=" + multiplier + ", expProduct=" + expProduct + ", dividend=" + dividend + ", divisor=" + divisor + ", expQuotient=" + expQuotient + '}';
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
    /**
     * @return the expSum
     */
    public float getExpSum() {
        return expSum;
    }

    /**
     * @param expSum the expSum to set
     */
    public void setExpSum(float expSum) {
        this.expSum = expSum;
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
     * @return the subtrahend
     */
    public float getSubtrahend() {
        return subtrahend;
    }

    /**
     * @param subtrahend the subtrahend to set
     */
    public void setSubtrahend(float subtrahend) {
        this.subtrahend = subtrahend;
    }

    /**
     * @return the expDifference
     */
    public float getExpDifference() {
        return expDifference;
    }

    /**
     * @param expDifference the expDifference to set
     */
    public void setExpDifference(float expDifference) {
        this.expDifference = expDifference;
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
     * @return the multiplier
     */
    public float getMultiplier() {
        return multiplier;
    }

    /**
     * @param multiplier the multiplier to set
     */
    public void setMultiplier(float multiplier) {
        this.multiplier = multiplier;
    }

    /**
     * @return the expProduct
     */
    public float getExpProduct() {
        return expProduct;
    }

    /**
     * @param expProduct the expProduct to set
     */
    public void setExpProduct(float expProduct) {
        this.expProduct = expProduct;
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
     * @return the divisor
     */
    public float getDivisor() {
        return divisor;
    }

    /**
     * @param divisor the divisor to set
     */
    public void setDivisor(float divisor) {
        this.divisor = divisor;
    }

    /**
     * @return the expQuotient
     */
    public float getExpQuotient() {
        return expQuotient;
    }

    /**
     * @param expQuotient the expQuotient to set
     */
    public void setExpQuotient(float expQuotient) {
        this.expQuotient = expQuotient;
    }
}
