package ec.edu.espe.fashionstore.model;

/**
 *
 * @author Pythons, DCCO-ESPE
 */
public class Order {

    
    
    private int id;
    private String customerName;
    private long phoneNumber;
    private String day;
    private String month;
    private String year;
    private Measurement measurement;

    public Order() {
        
    }

    
    public Order(int id, String customerName, long phoneNumber, String day, String month, String year, Measurement measurement) {
        this.id = id;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.day = day;
        this.month = month;
        this.year = year;
        this.measurement = measurement;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + getId() + ", customerName=" + getCustomerName() + ", phoneNumber=" + getPhoneNumber() + ", day=" + getDay() + ", month=" + getMonth() + ", year=" + getYear() + ", measurement=" + getMeasurement() + '}';
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
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

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
