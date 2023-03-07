
package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Payment extends PendingTask{
    
    private boolean payed;
    private float travelPrice;

    public Payment(boolean payed, float travelPrice) {
        this.payed = payed;
        this.travelPrice = travelPrice;
    }

    public Payment() {
         this.payed = false;
        this.travelPrice = 0.0F;
    }


    /**
     * @return the payed
     */
    public boolean isPayed() {
        return payed;
    }

    /**
     * @param payed the payed to set
     */
    public void setPayed(boolean payed) {
        this.payed = payed;
        notifySubsTraveler(payed);
    }

    /**
     * @return the travelPrice
     */
    public float getTravelPrice() {
        return travelPrice;
    }

    /**
     * @param travelPrice the travelPrice to set
     */
    public void setTravelPrice(float travelPrice) {
        this.travelPrice = travelPrice;
         notifySubsTraveler(travelPrice);
    }
    
    
}
