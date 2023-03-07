
package ec.edu.espe.ecomarket.model;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class Customer {

    private String identificationCard;
    private String name;
    private int number;
    private boolean pendingPayment;
    private String appointment;
    private String address;

    public Customer() {
    }

    public Customer(String identificationCard, String name, int number, boolean pendingPayment, String appointment, String address) {
        this.identificationCard = identificationCard;
        this.name = name;
        this.number = number;
        this.pendingPayment = pendingPayment;
        this.appointment = appointment;
        this.address = address;
    }

    @Override
    public String toString() {
        return "identificationCard=" + identificationCard + ", name=" + name + ", number=" + number + ", pendingPayment=" + pendingPayment + ", appointment=" + appointment + ", address=" + address;
    }

    public String toStringData() {
        return identificationCard + "," + name + "," + number + "," + pendingPayment + "," + appointment + "," + address;
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
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the pendingPayment
     */
    public boolean isPendingPayment() {
        return pendingPayment;
    }

    /**
     * @param pendingPayment the pendingPayment to set
     */
    public void setPendingPayment(boolean pendingPayment) {
        this.pendingPayment = pendingPayment;
    }

    /**
     * @return the appointment
     */
    public String getAppointment() {
        return appointment;
    }

    /**
     * @param appointment the appointment to set
     */
    public void setAppointment(String appointment) {
        this.appointment = appointment;
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
