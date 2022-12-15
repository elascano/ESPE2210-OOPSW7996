package ec.edu.espe.ws09.model;

/*
  @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Customer {
    private int id;
    private String name;
    private String lastName;
    private int phoneNumber;
    private float cash;
    
    public Customer(){
        id = 0;
        name = "";
        lastName  = "";
        phoneNumber = 0;
        cash = 0;
    }
    
    public Customer(int id, String name, String lastName, int phoneNumber, float cash){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.cash = cash;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getCash() {
        return cash;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }    
}
