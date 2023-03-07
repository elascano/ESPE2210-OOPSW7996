
package ec.edu.espe.ecomarket.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class Turn {
    
    private int id;
    private String date;
    private String customer;
    private String service;

    public Turn(int id, String date, String customer, String service) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.service = service;
        
    }

    public Turn() {
    }
    

    @Override
    public String toString() {
        return "yout Turn->>" + "id=" + id + ", date=" + date + ", customer=" + customer + ", service=" + service ;
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return the service
     */
    public String getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(String service) {
        this.service = service;
    }
    
}
