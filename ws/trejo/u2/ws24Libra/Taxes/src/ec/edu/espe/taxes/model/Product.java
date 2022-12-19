package ec.edu.espe.taxes.model;

import java.text.DecimalFormat;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class Product {

    int id;
    String description;
    float price;
    float salePrice;

    DecimalFormat formatOne = new DecimalFormat("#.00");

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", description=" + description + ", price=" + price + ", salePrice=" + formatOne.format(salePrice) + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public Product(int id, String description, float price, float salePrice) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.salePrice = salePrice;
    }

}
