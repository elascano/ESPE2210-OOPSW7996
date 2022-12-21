
package ec.edu.espe.taxes.model;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class Person {

    private String name;
    private float income; //per month
    private float billAccount; //anual
    private Vehicle vehicle;

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", income=" + income + ", billAccount=" + billAccount + ", vehicle=" + vehicle + '}';
    }

    public Person(String name, float income, float billAccount, Vehicle vehicle) {
        this.name = name;
        this.income = income;
        this.billAccount = billAccount;
        this.vehicle = vehicle;
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
     * @return the income
     */
    public float getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(float income) {
        this.income = income;
    }

    /**
     * @return the billAccount
     */
    public float getBillAccount() {
        return billAccount;
    }

    /**
     * @param billAccount the billAccount to set
     */
    public void setBillAccount(float billAccount) {
        this.billAccount = billAccount;
    }

    /**
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


}
