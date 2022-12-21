package ec.edu.espe.taxes.model;

/**
 *
* @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class Product {
    private int ind;
    private String description;
    private float price;
    private float salePrice;

    @Override
    public String toString() {
        return "Product{" + "ind=" + ind + ", description=" + description + ", price=" + price + ", salePrice=" + salePrice + '}';
    }

    
    
    public Product(int ind, String description, float price, float salePrice) {
        this.ind = ind;
        this.description = description;
        this.price = price;
        this.salePrice = salePrice;
    }
    
    

    public int getInd() {
        return ind;
    }

    public void setInd(int ind) {
        this.ind = ind;
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
    
    
}
