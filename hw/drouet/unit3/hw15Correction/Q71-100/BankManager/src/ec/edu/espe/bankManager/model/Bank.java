package ec.edu.espe.bankManager.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Bank {
    private int id;
    private String name;
    private float balance;
    
    public Bank() {}

    public Bank(int id, String name, float balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the balance
     */
    public float getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    
}
