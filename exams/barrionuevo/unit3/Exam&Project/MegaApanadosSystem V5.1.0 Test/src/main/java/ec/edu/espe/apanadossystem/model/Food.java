package ec.edu.espe.apanadossystem.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Food {
    private String name;
    private int amount;
    private double unityPrice;
    private double totalPrice;

    public Food(String name, int amount, double unityPrice, double totalPrice) {
        this.name = name;
        this.amount = amount;
        this.unityPrice = unityPrice;
        this.totalPrice = totalPrice;
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

    public double getUnityPrice() {
        return unityPrice;
    }

    public void setUnityPrice(double unityPrice) {
        this.unityPrice = unityPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public Object[] toArray(){
        Object[] obj = new Object[4];
        obj[0]=name;
        obj[1]=amount;
        obj[2]=unityPrice;
        obj[3]=totalPrice;
        return obj;
    }

    
}
