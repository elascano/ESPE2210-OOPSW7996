package fashionstore.model;

/**
 *
 * @author Pythons, DCCO-ESPE
 */
public class Measurement {

    private double neckMeasurement;
    private double chestMeasurement;
    private double shoulderMeasurement;
    private double armMeasurement;
    private double hipMeasurement;
    private double waistMeasurement;
    private double legMeasurement;

    @Override
    public String toString() {
        return "Measurement{" + "neckMeasurement=" + getNeckMeasurement() + ", chestMeasurement=" + getChestMeasurement() + ", shoulderMeasurement=" + getShoulderMeasurement() + ", armMeasurement=" + getArmMeasurement() + ", hipMeasurement=" + getHipMeasurement() + ", waistMeasurement=" + getWaistMeasurement() + ", legMeasurement=" + getLegMeasurement() + '}';
    }

    public Measurement(double neckMeasurement, double chestMeasurement, double shoulderMeasurement, double armMeasurement, double hipMeasurement, double waistMeasurement, double legMeasurement) {
        this.neckMeasurement = neckMeasurement;
        this.chestMeasurement = chestMeasurement;
        this.shoulderMeasurement = shoulderMeasurement;
        this.armMeasurement = armMeasurement;
        this.hipMeasurement = hipMeasurement;
        this.waistMeasurement = waistMeasurement;
        this.legMeasurement = legMeasurement;
    }

    public Measurement() {
        this.neckMeasurement = 0;
        this.chestMeasurement = 0;
        this.shoulderMeasurement = 0;
        this.armMeasurement = 0;
        this.hipMeasurement = 0;
        this.waistMeasurement = 0;
        this.legMeasurement = 0;
    }

    /**
     * @return the neckMeasurement
     */
    public double getNeckMeasurement() {
        return neckMeasurement;
    }

    /**
     * @param neckMeasurement the neckMeasurement to set
     */
    public void setNeckMeasurement(double neckMeasurement) {
        this.neckMeasurement = neckMeasurement;
    }

    /**
     * @return the chestMeasurement
     */
    public double getChestMeasurement() {
        return chestMeasurement;
    }

    /**
     * @param chestMeasurement the chestMeasurement to set
     */
    public void setChestMeasurement(double chestMeasurement) {
        this.chestMeasurement = chestMeasurement;
    }

    /**
     * @return the shoulderMeasurement
     */
    public double getShoulderMeasurement() {
        return shoulderMeasurement;
    }

    /**
     * @param shoulderMeasurement the shoulderMeasurement to set
     */
    public void setShoulderMeasurement(double shoulderMeasurement) {
        this.shoulderMeasurement = shoulderMeasurement;
    }

    /**
     * @return the armMeasurement
     */
    public double getArmMeasurement() {
        return armMeasurement;
    }

    /**
     * @param armMeasurement the armMeasurement to set
     */
    public void setArmMeasurement(double armMeasurement) {
        this.armMeasurement = armMeasurement;
    }

    /**
     * @return the hipMeasurement
     */
    public double getHipMeasurement() {
        return hipMeasurement;
    }

    /**
     * @param hipMeasurement the hipMeasurement to set
     */
    public void setHipMeasurement(double hipMeasurement) {
        this.hipMeasurement = hipMeasurement;
    }

    /**
     * @return the waistMeasurement
     */
    public double getWaistMeasurement() {
        return waistMeasurement;
    }

    /**
     * @param waistMeasurement the waistMeasurement to set
     */
    public void setWaistMeasurement(double waistMeasurement) {
        this.waistMeasurement = waistMeasurement;
    }

    /**
     * @return the legMeasurement
     */
    public double getLegMeasurement() {
        return legMeasurement;
    }

    /**
     * @param legMeasurement the legMeasurement to set
     */
    public void setLegMeasurement(double legMeasurement) {
        this.legMeasurement = legMeasurement;
    }

}
