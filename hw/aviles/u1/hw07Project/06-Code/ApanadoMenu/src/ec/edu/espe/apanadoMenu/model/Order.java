package ec.edu.espe.apanadoMenu.model;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Order {
    private String order;
    private float orderCost;

    public Order(String order, float orderCost) {
        this.order = "";
        this.orderCost = 0;
    }
        public Order() {
        order = "";
        orderCost = 0;
    }

    /**
     * @return the order
     */
    public String getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * @return the orderCost
     */
    public float getOrderCost() {
        return orderCost;
    }

    /**
     * @param orderCost the orderCost to set
     */
    public void setOrderCost(float orderCost) {
        this.orderCost = orderCost;
    }


    
}
