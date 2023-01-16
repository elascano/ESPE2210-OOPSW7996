package ec.edu.espe.ehamanagement.model;

import java.util.ArrayList;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Order {
    private int id;
    private String clientName;
    private String deliveryDate;
    private String deliveryPlace;
    private String description;
    private boolean isDelivered;

    public Order(int id, String clientName, String deliveryDate, String deliveryPlace, String description, boolean isDelivered) {
        this.id = id;
        this.clientName = clientName;
        this.deliveryDate = deliveryDate;
        this.deliveryPlace = deliveryPlace;
        this.description = description;
        this.isDelivered = isDelivered;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @param clientName the clientName to set
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * @return the deliveryDate
     */
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * @param deliveryDate the deliveryDate to set
     */
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    /**
     * @return the deliveryPlace
     */
    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    /**
     * @param deliveryPlace the deliveryPlace to set
     */
    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the isDelivered
     */
    public boolean getIsDelivered() {
        return isDelivered;
    }

    /**
     * @param isDelivered the isDelivered to set
     */
    public void setIsDelivered(boolean isDelivered) {
        this.isDelivered = isDelivered;
    }
    
    public static ArrayList getAttributesNames(){
        ArrayList keys = new ArrayList(5);
        keys.add("id");
        keys.add("clientName");
        keys.add("description");
        keys.add("deliveryDate");
        keys.add("deliveryPlace");
        keys.add("isDelivered");

        return keys;   
    }
    public static ArrayList getAttributes(Order order){
        ArrayList values = new ArrayList(5);
        values.add(order.getId());
        values.add(order.getClientName());
        values.add(order.getDescription());
        values.add(order.getDeliveryDate());
        values.add(order.getDeliveryPlace());
        values.add(order.getIsDelivered());
        return values;
    }
}
