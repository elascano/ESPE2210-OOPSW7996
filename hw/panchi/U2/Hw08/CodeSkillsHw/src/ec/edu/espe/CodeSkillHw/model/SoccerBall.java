package ec.edu.espe.CodeSkillHw.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class SoccerBall {
    
    private int id;
    private int price;
    private String brand;

    public SoccerBall(){
        id = 0;
        brand = "";
        price = 0;
    }
    
    @Override
    public String toString() {
        return "SoccerBall{" + "id=" + id + ", price=" + price + ", brand=" + brand + '}';
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
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
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
    
}
