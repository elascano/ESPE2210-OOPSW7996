package ec.edu.espe.apanadoMenu.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Order {
    private int id;
    private String name;
    private String Email;
    private int ID;
    private double totalPrice;

    public Order(int id, String name, String Email, int ID, double total) {
        this.id = id;
        this.name = name;
        this.Email = Email;
        this.ID = ID;
        this.totalPrice = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}