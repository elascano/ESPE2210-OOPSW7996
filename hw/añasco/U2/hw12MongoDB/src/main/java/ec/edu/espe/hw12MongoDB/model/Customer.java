package ec.edu.espe.hw12MongoDB.model;

public class Customer {
    private int id;
    private String name;
    private String email;
    private int[] dateOfBirth = new int[3];

    
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", email=" + email + ", birthday=" + dateOfBirth + '}';
    }
    
    public Customer() {
        id = 0;
        name = "";
        email = "";
        dateOfBirth[0]=0;
        dateOfBirth[1]=0;
        dateOfBirth[2]=0;
    }
    
    public Customer(int id, String name, String email, int[] birthday) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = birthday;
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
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int[] getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int[] dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}