package ec.edu.espe.ehamanagement.model;


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

    public Order(int id, String clientName, String deliveryPlace,String deliveryDate,  String description, boolean isDelivered) {
        this.id = id;
        this.clientName = clientName;
        this.deliveryDate = deliveryDate;
        this.deliveryPlace = deliveryPlace;
        this.description = description;
        this.isDelivered = isDelivered;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", clientName=" + clientName + ", deliveryDate=" + deliveryDate + ", deliveryPlace=" + deliveryPlace + ", description=" + description + ", isDelivered=" + isDelivered + '}';
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
    

}
