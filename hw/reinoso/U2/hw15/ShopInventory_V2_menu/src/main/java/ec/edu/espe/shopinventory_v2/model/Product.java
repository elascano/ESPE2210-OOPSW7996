package ec.edu.espe.shopinventory_v2.model;

import org.bson.Document;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public abstract class Product {

    private int id;
    private String name;
    private int quantity;
    private float pricePerUnit;
    
    
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the pricePerUnit
     */
    public float getPricePerUnit() {
        return pricePerUnit;
    }

    /**
     * @param pricePerUnit the pricePerUnit to set
     */
    public void setPricePerUnit(float pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
    

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", quantity=" + quantity + ", pricePerUnit=" + pricePerUnit + '}';
    }
    
    public Product(){
        id = 0;
        name = "";
        quantity = 0;
        pricePerUnit = 0;
    }

    public Product(int id, String name, int quantity, float pricePerUnit) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }
    
    
    
    public abstract Document createProduct();
    
    public abstract int readProduct();
   
    public abstract Product updateProduct();
    
    public abstract int deleteProduct();
    
    
    
}
