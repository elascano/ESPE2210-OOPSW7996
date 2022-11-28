package ec.edu.espe.HuertoEcoMarket.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class RegisterProduct {

    private String name;
    private int amount;
    private double unitPrice;

    public RegisterProduct(String name, int amount, double unitPrice) {
        this.name = name;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    
    public RegisterProduct() {
        this.name = "";
        this.amount = 0;
        this.unitPrice = 0.0;
    }
    
    @Override
    public String toString() {
        return "RegisterProduct{" + "name=" + name + ", amount=" + amount + ", unitPrice=" + unitPrice + '}';
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
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

}
