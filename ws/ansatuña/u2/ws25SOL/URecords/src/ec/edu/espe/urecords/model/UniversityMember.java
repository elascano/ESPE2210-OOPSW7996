
package ec.edu.espe.urecords.model;

import java.util.ArrayList;

/**
 *
 * @author NW USER
 */
public abstract class UniversityMember {
    int id;
    String name;
    String cedula;
    ArrayList<NRC>courses;

    @Override
    public String toString() {
        return "UniversityMember{" + "id=" + id + ", name=" + name + ", cedula=" + cedula + ", courses=" + courses + '}';
    }
    
    public abstract void registerInTheSystem();
    
    public UniversityMember(int id, String name, String cedula, ArrayList<NRC> courses) {
        this.id = id;
        this.name = name;
        this.cedula = cedula;
        this.courses = courses;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<NRC> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<NRC> courses) {
        this.courses = courses;
    }

       
}
