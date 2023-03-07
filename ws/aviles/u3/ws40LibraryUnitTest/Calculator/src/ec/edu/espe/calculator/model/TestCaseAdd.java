package ec.edu.espe.calculator.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class TestCaseAdd {
    private float addend1;
    private float addend2;
    private float expResult;
    private float actResult;
    private String pass;

    public TestCaseAdd(float number1, float number2, float expResult, float actResult, String pass) {
        this.addend1 = number1;
        this.addend2 = number2;
        this.expResult = expResult;
        this.actResult = actResult;
        this.pass = pass;
    }

    public float getAddend1() {
        return addend1;
    }

    public void setAddend1(float addend1) {
        this.addend1 = addend1;
    }

    public float getAddend2() {
        return addend2;
    }

    public void setAddend2(float addend2) {
        this.addend2 = addend2;
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
