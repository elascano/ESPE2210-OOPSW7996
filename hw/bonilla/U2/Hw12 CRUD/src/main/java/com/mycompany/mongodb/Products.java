
package com.mycompany.mongodb;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class Products
{
    private int id;
    private float price;
    private String productName;

    public Products(int id, float price, String productName) {
        this.id = id;
        this.price = price;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Productos{" + "id=" + id + ", price=" + price + ", productName=" + productName + '}';
    }
    
    
}
