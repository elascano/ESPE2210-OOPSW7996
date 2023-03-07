package ec.edu.espe.AirporTaxiScheduling.model;

import java.util.Date;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Travel {

    private int id;
    private String driver;
    private int idTraveler;
    private String traveler;
    private String address;
    private Date dateOfOcurrence;
    private float price;
    private String annotation; 
    private boolean payed;
    

    
  
    
public Travel() {
        this.id = 0;
        this.driver = "";
        this.traveler = "";
        this.address = "";
        this.dateOfOcurrence = null;
        this.price = 0.0F;
        this.annotation = "";
        this.payed =false;
    }
    
    public Travel(int id, String driver,int idTraveler, String Traveler, String address, Date dateOfOcurrence, float price, String annotation, boolean payed) {
        this.id = id;
        this.driver = driver;
        this.idTraveler=idTraveler;
        this.traveler = Traveler;
        this.address = address;
        this.dateOfOcurrence = dateOfOcurrence;
        this.price = price;
        this.annotation = annotation;
        this.payed = payed;
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
     * @return the traveler
     */
    public String getTraveler() {
        return traveler;
    }

    /**
     * @param Traveler the traveler to set
     */
    public void setTraveler(String Traveler) {
        this.traveler = Traveler;
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
     * @return the dateOfOcurrence
     */
    public Date getDateOfOcurrence() {
        return dateOfOcurrence;
    }

    /**
     * @param dateOfOcurrence the dateOfOcurrence to set
     */
    public void setDateOfOcurrence(Date dateOfOcurrence) {
        this.dateOfOcurrence = dateOfOcurrence;
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
     * @return the annotation
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * @param annotation the annotation to set
     */
    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    /**
     * @return the payed
     */
    public boolean isPayed() {
        return payed;
    }

    /**
     * @param payed the payed to set
     */
    public void setPayed(boolean payed) {
        this.payed = payed;
    }   

    /**
     * @return the idTraveler
     */
    public int getIdTraveler() {
        return idTraveler;
    }

    /**
     * @param idTraveler the idTraveler to set
     */
    public void setIdTraveler(int idTraveler) {
        this.idTraveler = idTraveler;
    }
    
    
}
