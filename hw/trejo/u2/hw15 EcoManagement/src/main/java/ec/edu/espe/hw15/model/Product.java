package ec.edu.espe.hw15.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class Product {

    private String name;
    private double unitPrice;
    private int amount;

    public Product(String name, double unitPrice, int amout) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.amount = amout;
    }
    
    public Product() {
        name = "";
        unitPrice = 0.0;
        amount = 0;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getAmout() {
        return amount;
    }

    public void setAmout(int amout) {
        this.amount = amout;
    }
    
    

    
}
