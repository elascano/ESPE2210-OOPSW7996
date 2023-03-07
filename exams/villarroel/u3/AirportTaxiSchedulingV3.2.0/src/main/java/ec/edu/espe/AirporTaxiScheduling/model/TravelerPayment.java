
package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class TravelerPayment {
    private float outstandingBalance;
    private float totalValue;
   private TaxiDriver taxiDriver;
   private Traveler traveler;
    private Travel travel;

    @Override
    public String toString() {
        return "TravelerPayment{" + "outstandingBalance=" + getOutstandingBalance() + ", totalValue=" + getTotalValue() + ", taxiDriver=" + getTaxiDriver() + ", traveler=" + getTraveler() + ", travel=" + getTravel() + '}';
    }
    
    public TravelerPayment() {
        this.outstandingBalance = 0.0F;
        this.totalValue = 0.0F;
        this.taxiDriver = null;
        this.traveler = null;
        this.travel = null;
    }
    
    public TravelerPayment(float outstandingBalance, float totalValue, TaxiDriver taxiDriver, Traveler traveler, Travel travel) {
        this.outstandingBalance = outstandingBalance;
        this.totalValue = totalValue;
        this.taxiDriver = taxiDriver;
        this.traveler = traveler;
        this.travel = travel;
    }

    /**
     * @return the outstandingBalance
     */
    public float getOutstandingBalance() {
        return outstandingBalance;
    }

    /**
     * @param outstandingBalance the outstandingBalance to set
     */
    public void setOutstandingBalance(float outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
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
     * @return the taxiDriver
     */
    public TaxiDriver getTaxiDriver() {
        return taxiDriver;
    }

    /**
     * @param taxiDriver the taxiDriver to set
     */
    public void setTaxiDriver(TaxiDriver taxiDriver) {
        this.taxiDriver = taxiDriver;
    }

    /**
     * @return the traveler
     */
    public Traveler getTraveler() {
        return traveler;
    }

    /**
     * @param traveler the traveler to set
     */
    public void setTraveler(Traveler traveler) {
        this.traveler = traveler;
    }

    /**
     * @return the travel
     */
    public Travel getTravel() {
        return travel;
    }

    /**
     * @param travel the travel to set
     */
    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    
   
    
    
    
}
