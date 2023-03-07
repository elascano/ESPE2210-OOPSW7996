package ec.edu.espe.calculator.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class TestCaseDivide {
    private float dividend;
    private float divisor;
    private float expResult;
    private float actResult;
    private String pass;

    @Override
    public String toString() {
        return "TestCaseDivide{" + "dividend=" + dividend + ", divisor=" + divisor + ", expResult=" + expResult + ", actResult=" + actResult + ", pass=" + pass + '}';
    }

    public float getDividend() {
        return dividend;
    }

    public void setDividend(float dividend) {
        this.dividend = dividend;
    }

    public float getDivisor() {
        return divisor;
    }

    public void setDivisor(float divisor) {
        this.divisor = divisor;
    }

    public float getExpResult() {
        return expResult;
    }

    public void setExpResult(float expResult) {
        this.expResult = expResult;
    }

    public float getActResult() {
        return actResult;
    }

    public void setActResult(float actResult) {
        this.actResult = actResult;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
