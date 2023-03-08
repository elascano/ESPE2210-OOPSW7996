package ec.edu.espe.apanadossystem.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Order {

    private int idDataBase;
    private String name;
    private String email;
    private int ID;
    private double totalPrice;
    private boolean payMethod;

    public Order(int id, String name, String Email, int ID, double totalPrice, boolean payMethod) {
        this.idDataBase = id;
        this.name = name;
        this.email = Email;
        this.ID = ID;
        this.totalPrice = totalPrice;
        this.payMethod = payMethod;
    }

    public int getId() {
        return idDataBase;
    }

    public void setId(int id) {
        this.idDataBase = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
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

    public boolean isPayMethod() {
        return payMethod;
    }

    public void setPayMethod(boolean payMethod) {
        this.payMethod = payMethod;
    }

}
