package ec.edu.espe.restaurant.model;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class Customer extends Service {

    protected String firstName;
    protected String lastName;
    protected String identification;
    protected String cellphone;
    protected String email;
    

public Customer(String firstName, String lastName, String identification, String cellphone, String email, String food, String cost, String note, String date, String hourOfAttention) {
    super(food, cost, note, date, hourOfAttention);
    this.firstName = firstName;
    this.lastName = lastName;
    this.identification = identification;
    this.cellphone = cellphone;
    this.email = email;
}

    public Customer() {
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
