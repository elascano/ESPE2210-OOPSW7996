package ec.edu.espe.ehamanagement.model;

import java.util.ArrayList;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class InventoryReport  extends Report{
    private ArrayList<Integer> stockProductsIds;
    private ArrayList<Integer> shortageProductsIds;

    public InventoryReport(ArrayList<Integer> stockProductslds, ArrayList<Integer> shortageProductsId) {
        this.stockProductsIds = stockProductslds;
        this.shortageProductsIds = shortageProductsId;
    }

    /**
     * @return the stockProductslds
     */
    public ArrayList<Integer> getStockProductsIds() {
        return stockProductsIds;
    }

    /**
     * @param stockProductslds the stockProductslds to set
     */
    public void setStockProductsIds(ArrayList<Integer> stockProductslds) {
        this.stockProductsIds = stockProductslds;
    }

    /**
     * @return the shortageProductsId
     */
    public ArrayList<Integer> getShortageProductsIds() {
        return shortageProductsIds;
    }

    /**
     * @param shortageProductsId the shortageProductsId to set
     */
    public void setShortageProductsIds(ArrayList<Integer> shortageProductsId) {
        this.shortageProductsIds = shortageProductsId;
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
