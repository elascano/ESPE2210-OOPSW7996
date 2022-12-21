

package ec.edu.espe.taxes.model;

/**
 *
 * @author christopher bazurto, DeltaTeam,DCCO-ESPE
 */
public class Product {
    private int id;
    private String descripcion;
    private float price;
    private float salePrice;

    public Product(int id, String descripcion, float price, float salePrice) {
        this.id = id;
        this.descripcion = descripcion;
        this.price = price;
        this.salePrice = salePrice;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", descripcion=" + descripcion + ", price=" + price + ", salePrice=" + salePrice + '}';
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
