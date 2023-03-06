package ec.edu.espe.calculator.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class TestCaseSubstract {
    private float minuend;
    private float substrahend;
    private float expResult;
    private float actResult;
    private String pass;

    @Override
    public String toString() {
        return "TextCaseSubstract{" + "minuend=" + minuend + ", substrahend=" + substrahend + ", expResult=" + expResult + ", actResult=" + actResult + ", pass=" + pass + '}';
    }

    public float getMinuend() {
        return minuend;
    }

    public void setMinuend(float minuend) {
        this.minuend = minuend;
    }

    public float getSubstrahend() {
        return substrahend;
    }

    public void setSubstrahend(float substrahend) {
        this.substrahend = substrahend;
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
