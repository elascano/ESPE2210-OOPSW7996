
package ec.edu.espe.ecomarket.model;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class Supplier {

    private String name;
    private String number;
    private double pendingPayment;
    private String address;

    public Supplier() {
    }

    public Supplier(String name, String number, double pendingPayment, String address) {
        this.name = name;
        this.number = number;
        this.pendingPayment = pendingPayment;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Supplier{" + "name=" + name + ", number=" + number + ", pendingPayment=" + pendingPayment  + ", address=" + address + '}';
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
     * @return the pendingPayment
     */
    public double getPendingPayment() {
        return pendingPayment;
    }

    /**
     * @param pendingPayment the pendingPayment to set
     */
    public void setPendingPayment(double pendingPayment) {
        this.pendingPayment = pendingPayment;
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

}