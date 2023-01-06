
package ec.edu.espe.hw12.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class Product {
    
    private String name;
    private double unitPrice;

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

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", unitPrice=" + unitPrice + '}';
    }

    public Product(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }
    
      public Product() {
        name = "";
        unitPrice = 0.0;
    }
    
    
    
    
    
}
