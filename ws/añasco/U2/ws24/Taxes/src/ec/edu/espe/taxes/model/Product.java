package ec.edu.espe.taxes.model;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Product {
    private int id;
    private String description;
    private float salePrice;
    private float price;

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", description=" + description + ", salePrice=" + salePrice + ", price=" + price + '}';
    }
    
    public Product(int id, String description, float salePrice, float price) {
        this.id = id;
        this.description = description;
        this.salePrice = salePrice;
        this.price = price;
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

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
