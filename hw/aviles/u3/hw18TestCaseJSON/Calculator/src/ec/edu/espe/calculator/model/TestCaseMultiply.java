package ec.edu.espe.calculator.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class TestCaseMultiply {
    private float multiplicand;
    private float multioliet;
    private float expResult;
    private float actResult;
    private String pass;

    @Override
    public String toString() {
        return "TestCaseMultiply{" + "multiplicand=" + multiplicand + ", multioliet=" + multioliet + ", expResult=" + expResult + ", actResult=" + actResult + ", pass=" + pass + '}';
    }

    public float getMultiplicand() {
        return multiplicand;
    }

    public void setMultiplicand(float multiplicand) {
        this.multiplicand = multiplicand;
    }

    public float getMultioliet() {
        return multioliet;
    }

    public void setMultioliet(float multioliet) {
        this.multioliet = multioliet;
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
