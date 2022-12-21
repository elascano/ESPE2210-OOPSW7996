package ec.edu.espe.urecords.model;

import java.util.ArrayList;

/**
 *
 * @author NW USER
 */
public class Student extends UniversityMember{
private float GPA;
    public String toString() {
        return "UniversityMember{" + "id=" + id + ", name=" + name + ", cedula=" + cedula + "GPA=" + GPA +", courses=" + courses + '}';
    }

    public Student(float GPA, int id, String name, String cedula, ArrayList<NRC> courses) {
        super(id, name, cedula, courses);
        this.GPA = GPA;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
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

    public Student(int id, String name, String cedula, ArrayList<NRC> courses) {
        super(id, name, cedula, courses);
    }


    @Override
    public void registerInTheSystem() {
        System.out.println("Registering student in the system...");
    }
    
}
