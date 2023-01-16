
package ec.edu.espe.model;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class CellPhone {
    
    private int id;
    private String brand;
    private int storage;

    public CellPhone(int id, String brand, int storage) {
        this.id = id;
        this.brand = brand;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "CellPhone{" + "id=" + id + ", brand=" + brand + ", storage=" + storage + '}';
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
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the storage
     */
    public int getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(int storage) {
        this.storage = storage;
    }
    
    
    
}
