
package ec.edu.espe.ecomarket.model;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class Employee {

    private String identificationCard;
    private String name;
    private String number;
    private double payment;
    private String service;
    private String address;

    public Employee() {
    }

    public Employee(String identificationCard, String name, String number, double payment, String service, String address) {
        this.identificationCard = identificationCard;
        this.name = name;
        this.number = number;
        this.payment = payment;
        this.service = service;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee --> " + "identificationCard=" + identificationCard + ", name=" + name + ", number=" + number + ", payment=" + payment + ", appointment=" + service + ", address=" + address + "\n";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the payment
     */
    public double getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(double payment) {
        this.payment = payment;
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
     * @return the identificationCard
     */
    public String getIdentificationCard() {
        return identificationCard;
    }

    /**
     * @param identificationCard the identificationCard to set
     */
    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

}
