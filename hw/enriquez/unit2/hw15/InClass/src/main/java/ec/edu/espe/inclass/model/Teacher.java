package ec.edu.espe.InClass.model;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class Teacher {

    private String name;
    private String id;
    private int tutorship;

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", id=" + id + ", tutorship=" + tutorship + '}';
    }

    public Teacher(String name, String id, int tutorship) {
        this.name = name;
        this.id = id;
        this.tutorship = tutorship;
    }

    public Teacher() {
        name = "";
        id = "";
        tutorship = 0;
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
     * @return the tutorship
     */
    public int getTutorship() {
        return tutorship;
    }

    /**
     * @param tutorship the tutorship to set
     */
    public void setTutorship(int tutorship) {
        this.tutorship = tutorship;
    }
}