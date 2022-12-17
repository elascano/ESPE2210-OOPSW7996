package fashionstore.model;

/**
 *
 * @author Pythons, DCCO-ESPE
 */
public class Order {

    
    
    private int id;
    private String customerName;
    private long phoneNumber;
    private Measurement measurement;
    private Calendar calendar;

    @Override
    public String toString() {
        return "Id =\t" + id + "\nCustomer Name =\t" + customerName + "\nPhone Number =\t" + phoneNumber + "\n" + measurement + "\n" + calendar;
    }
    
    public Order (){
        id=0;
        customerName="";
        phoneNumber=0;
        measurement= new Measurement();
        calendar= new Calendar();
    }

    public Order(int id, String customerName, long phoneNumber, Measurement measurement) {
        this.id = id;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.measurement = measurement;
        this.calendar = calendar;
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
    /**
     * @return the calendar
     */
    public Calendar getCalendar() {
        return calendar;
    }

    /**
     * @param calendar the calendar to set
     */
    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
    
}
