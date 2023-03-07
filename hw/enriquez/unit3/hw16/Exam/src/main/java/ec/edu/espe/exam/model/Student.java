package ec.edu.espe.exam.model;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class Student {
    private String name;
    private String id;
    private String email;

    @Override
    public String toString() {
        return "Student{" + "name=" + getName() + ", id=" + getId() + ", email=" + getEmail() + '}';
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }
    public Student() {
        name = "";
        id = "";
        email = "";
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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
    
    
}
