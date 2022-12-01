package ec.edu.espe.codeskill.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class SoccerBall {

    private int id;
    private String brand;
    private float price;
   
    @Override
    public String toString() {
         return "SoccerBall{" + "id=" + id + ", brand=" + brand + ", price=" + price + '}';
    }
    
    public SoccerBall(){
        id = 0;
        brand = "";
        price = 0;
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
    
}
