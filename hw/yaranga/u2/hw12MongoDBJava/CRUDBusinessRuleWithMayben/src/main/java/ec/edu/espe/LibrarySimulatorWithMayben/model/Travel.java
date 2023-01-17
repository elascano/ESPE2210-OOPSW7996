package ec.edu.espe.LibrarySimulatorWithMayben.model;

import java.time.LocalDate;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Travel {

    private int id;
    private String driver;
    private String address;
    private String dateOfOcurrence;
    private float price;

    @Override
    public String toString() {
        return "Book{" + "id=" + getId() + ", driver=" + getDriver() + ", address=" + getAddress() + ", dateOfOcurrence=" + getDateOfOcurrence() + ", price=" + getPrice() + '}';
    }

    
    public Travel() {
        id = 0;
        driver = "";
        address = "";    
        dateOfOcurrence = "";
        price=0.0F;
    }

    public Travel(int id, String driver, String address, String dateOfOcurrence, float price) {
        this.id = id;
        this.driver = driver;
        this.address = address;
        this.dateOfOcurrence = dateOfOcurrence;
        this.price = price;
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
     * @return the driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
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
     * @param dateOfOcurrence the dateOfOcurrence to set
     */
    public void setDateOfOcurrence(String dateOfOcurrence) {
        this.dateOfOcurrence = dateOfOcurrence;
    }

    /**
     * @return the dateOfOcurrence
     */
    public String getDateOfOcurrence() {
        return dateOfOcurrence;
    }
}
