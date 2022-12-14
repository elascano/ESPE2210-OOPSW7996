package ec.edu.espe.usermanager.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class User {
    private int id;
    private String user;
    private String password;

    @Override
    public String toString() {
        return "User{" + "id=" + getId() + ", user=" + getUser() + ", password=" + getPassword() + '}';
    }

    public User(int id, String user, String password) {
        this.id = id;
        this.user = user;
        this.password = password;
    }
    
    public User() {
        this.id = 0;
        this.user = "";
        this.password = "";
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
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
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
    
    
}
