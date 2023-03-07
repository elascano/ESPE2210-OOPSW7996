package ec.edu.espe.inclass.model;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Course {

    private String name;
    private int nrc;
    private ArrayList<Student> students;

    public Course() {
        name = "";
        nrc = 0;
        students = new ArrayList<>();
    }

    public Course(String name, int nrc) {
        this.name = name;
        this.nrc = nrc;
        this.students = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", nrc=" + nrc + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrc() {
        return nrc;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

}
