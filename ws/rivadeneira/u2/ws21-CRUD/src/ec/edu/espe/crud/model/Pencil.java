
package ec.edu.espe.crud.model;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits , DCCO-ESPE
 */
public class Pencil {
    private int id;
    private String type;
    private int quantity;


    public Pencil() {
        id = 0;
        type = "";
        quantity = 0;
    }

    public Pencil(int id, String type, int quantity) {
        this.id = id;
        this.type = type;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Pencil{" + "id=" + getId() + ", name=" + getType() + ", quantity=" + getQuantity() + '}';
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
    
    

    
    
}
