package ec.edu.espe.hw12DataBase.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Order {
    private int id;
    private double totalprice;

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", totalprice=" + totalprice + '}';
    }

    public Order(int id, double totalprice) {
        this.id = id;
        this.totalprice = totalprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }
    
}
