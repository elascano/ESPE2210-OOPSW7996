package ec.edu.espe.AirporTaxiScheduling.model;

import java.util.ArrayList;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Accounting extends Service {

    private ArrayList<Float> values;
    private float totalValue;
    private float payedValues;
    private float outsValues;
    private float percentageLost;

    public Accounting() {
        this.values = null;
        this.totalValue = 0.0F;
        this.payedValues = 0.0F;
        this.outsValues = 0.0F;
        this.percentageLost=0.0F;
    }
    
    public Accounting(ArrayList<Float> values, float totalValue, float payedValues, float outsValues,float percentageLost) {
        this.values = values;
        this.totalValue = totalValue;
        this.payedValues = payedValues;
        this.outsValues = outsValues;
        this.percentageLost=percentageLost;
    }
    
    /**
     * @return the values
     */
    public ArrayList<Float> getValues() {
        return values;
    }

    /**
     * @param values the values to set
     */
    public void setValues(ArrayList<Float> values) {
        this.values = values;
    }

    /**
     * @return the totalValue
     */
    public float getTotalValue() {
        return totalValue;
    }

    /**
     * @param totalValue the totalValue to set
     */
    public void setTotalValue(float totalValue) {
        this.totalValue = totalValue;
    }

    /**
     * @return the payedValues
     */
    public float getPayedValues() {
        return payedValues;
    }

    /**
     * @param payedValues the payedValues to set
     */
    public void setPayedValues(float payedValues) {
        this.payedValues = payedValues;
    }

    /**
     * @return the outsValues
     */
    public float getOutsValues() {
        return outsValues;
    }

    /**
     * @param outsValues the outsValues to set
     */
    public void setOutsValues(float outsValues) {
        this.outsValues = outsValues;
    }

    public float getPercentageLost() {
        return percentageLost;
    }

    public void setPercentageLost(float percentageLost) {
        this.percentageLost = percentageLost;
    }

   

   

}
