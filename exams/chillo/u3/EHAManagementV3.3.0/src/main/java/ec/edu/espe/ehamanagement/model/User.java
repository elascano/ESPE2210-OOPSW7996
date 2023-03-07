package ec.edu.espe.ehamanagement.model;


/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class User {
    private int id;
    private String userName;
    private String email;
    private String password;
    private float currentSalary;

    public User(int id, String userName, String email, String password, float currentSalary) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.currentSalary = currentSalary;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the currentSalary
     */
    public float getCurrentSalary() {
        return currentSalary;
    }

    /**
     * @param currentSalary the currentSalary to set
     */
    public void setCurrentSalary(float currentSalary) {
        this.currentSalary = currentSalary;
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
    

}
