package ec.edu.espe.apanadoMenu.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Food {
    private String name;
    private int amount;
    private double price;

    public Food(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" + "name=" + name + ", amount=" + amount + ", price=" + price + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Object[] toArray(){
        Object[] obj = new Object[3];
        obj[0]=name;
        obj[1]=amount;
        obj[2]=price;
        return obj;
    }

    
}
