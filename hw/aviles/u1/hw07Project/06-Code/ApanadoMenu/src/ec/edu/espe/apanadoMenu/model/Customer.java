package ec.edu.espe.apanadoMenu.model;

public class Customer {
    private int id;
    private String name;
    private String email;
    private int[] birthday=new int[3];

    
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", email=" + email + ", birthday=" + birthday + '}';
    }
    
    public Customer() {
        id = 0;
        name = "";
        email = "";
        birthday[0]=0;
        birthday[1]=0;
        birthday[2]=0;
    }
    
    public Customer(int id, String name, String email, int[] birthday) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
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

    public int[] getBirthday() {
        return birthday;
    }

    public void setBirthday(int[] birthday) {
        this.birthday = birthday;
    }
}