package ec.edu.espe.Food.model;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public abstract class Food {
    protected String food;
    protected String cost;
    protected String paymentMethod;
    
    
    
    public Food(){
    
    }

    public Food(String food, String cost, String paymentMethod) {
        this.food = food;
        this.cost = cost;
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the food
     */
    public String getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(String food) {
        this.food = food;
    }

    /**
     * @return the cost
     */
    public String getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /**
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

   
}
