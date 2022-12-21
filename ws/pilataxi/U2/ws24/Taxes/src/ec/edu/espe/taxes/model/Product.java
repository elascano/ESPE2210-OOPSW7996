
package ec.edu.espe.taxes.model;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class Product {
    private int id;
    private String description;
    private float prices;
    private float salePrices;

    public Product(int id, String description, float prices, float salePrices) {
        this.id = id;
        this.description = description;
        this.prices = prices;
        this.salePrices = salePrices;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", description=" + description + ", prices=" + prices + ", salePrices=" + salePrices + '}';
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
     * @return the prices
     */
    public float getPrices() {
        return prices;
    }

    /**
     * @param prices the prices to set
     */
    public void setPrices(float prices) {
        this.prices = prices;
    }

    /**
     * @return the salePrices
     */
    public float getSalePrices() {
        return salePrices;
    }

    /**
     * @param salePrices the salePrices to set
     */
    public void setSalePrices(float salePrices) {
        this.salePrices = salePrices;
    }
    
    
}
