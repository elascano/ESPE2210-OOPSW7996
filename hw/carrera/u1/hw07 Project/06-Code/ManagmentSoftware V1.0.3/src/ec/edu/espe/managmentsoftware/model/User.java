
package ec.edu.espe.managmentsoftware.model;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class User {
    private String userName;
    private String email;
    private String password;
    private float currentSalary;

    public User(String userName, String email, String password, float currentSalary) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.currentSalary = currentSalary;
    }

    User() {
        
    }

    @Override
    public String toString() {
        return "User{" + "userName=" + userName + ", email=" + email + ", password=" + password + ", currentSalary=" + currentSalary + '}';
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
}
