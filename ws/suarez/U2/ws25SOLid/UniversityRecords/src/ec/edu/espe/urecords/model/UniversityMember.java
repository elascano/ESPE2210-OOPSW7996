
package ec.edu.espe.urecords.model;

import ec.edu.espe.urecords.model.NRC;
import java.util.ArrayList;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public abstract class UniversityMember {
    
    private int id;
    private String name;
    private String cedula;
    private ArrayList<NRC> courses;

    public abstract void registerInTheSystem();

    public void login() {
        System.out.println("login into the system");
    }

    public UniversityMember(int id, String name, String cedula, ArrayList<NRC> courses) {
        this.id = id;
        this.name = name;
        this.cedula = cedula;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "UniversityMember{" + "id=" + getId() + ", name=" + getName() + ", cedula=" + getCedula() + ", courses=" + getCourses() + '}';
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
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the courses
     */
    public ArrayList<NRC> getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(ArrayList<NRC> courses) {
        this.courses = courses;
    }

    
  
}
