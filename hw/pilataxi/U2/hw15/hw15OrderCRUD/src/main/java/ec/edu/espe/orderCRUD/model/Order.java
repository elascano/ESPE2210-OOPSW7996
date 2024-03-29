
package ec.edu.espe.orderCRUD.model;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class Order {
    private int id;
    private String productName;
    private int price;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Order(int id, String productName, int price, String type) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", productName=" + productName + ", price=" + price + ", type=" + type + '}';
    }


    
    
}
