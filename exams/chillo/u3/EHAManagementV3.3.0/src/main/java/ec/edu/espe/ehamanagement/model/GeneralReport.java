package ec.edu.espe.ehamanagement.model;

import java.util.ArrayList;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class GeneralReport  extends Report{
        private ArrayList<Integer> ordersIds;
        private ArrayList<Integer> productsIds;

    public GeneralReport(ArrayList<Integer> ordersId, ArrayList<Integer> productsId) {
        this.ordersIds = ordersId;
        this.productsIds = productsId;
    }

    /**
     * @return the ordersId
     */
    public ArrayList<Integer> getOrdersIds() {
        return ordersIds;
    }

    /**
     * @param ordersId the ordersId to set
     */
    public void setOrdersIds(ArrayList<Integer> ordersId) {
        this.ordersIds = ordersId;
    }

    /**
     * @return the productsId
     */
    public ArrayList<Integer> getProductsIds() {
        return productsIds;
    }

    /**
     * @param productsId the productsId to set
     */
    public void setProductsIds(ArrayList<Integer> productsId) {
        this.productsIds = productsId;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
        
}
