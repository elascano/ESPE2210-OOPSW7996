package fashionstore.model;

/**
 *
 * @author Pythons, DCCO-ESPE
 */
public class Order {
    
    private int id;
    private String customerName;
    private long phoneNumber;
    //private String[] specificRequirements;
    private Measurement measurement;
    
    
    public Order (){
        id=0;
        customerName="";
        phoneNumber=0;
        //specificRequirements=new String[10];
        measurement= new Measurement();
    }

    public Order(int id, String customerName, long phoneNumber, Measurement measurement) {
        this.id = id;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.measurement = measurement;
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
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the phoneNumber
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the specificRequirements
     
    public String[] getSpecificRequirements() {
        return specificRequirements;
    }*/

    /**
     * @param specificRequirements the specificRequirements to set
     
    public void setSpecificRequirements(String[] specificRequirements) {
        this.specificRequirements = specificRequirements;
    }*/

    /**
     * @return the measurement
     */
    public Measurement getMeasurement() {
        return measurement;
    }

    /**
     * @param measurement the measurement to set
     */
    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }
    
}
