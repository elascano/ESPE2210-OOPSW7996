package ec.edu.espe.taxes.model;

import java.text.DecimalFormat;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Product {

    private int id;
    private String description;
    private float price;
    private float salePrice;
    
    DecimalFormat formato1 = new DecimalFormat("#.00");
    
    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", description=" + description + ", price=" + price + ", salePrice=" + formato1.format(salePrice) + '}';
    }
  
    public Product(int id, String description, float price, float salePrice) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.salePrice = salePrice;
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
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the salePrice
     */
    public float getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

}
