package ec.edu.espe.inclass.model;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Teacher extends UniversityMember{
    
    private String password;
    private ArrayList<Course> courses;
    private ArrayList<Tutorship> tutorships;


    public Teacher(String password, ArrayList<Course> courses, ArrayList<Tutorship> tutorships, String name, String espeId) {
        super(name, espeId);
        this.password = password;
        this.courses = courses;
        this.tutorships = tutorships;
    }
    

    public Teacher(String id, String name) {
        super(name,id);
        password="";
        courses = new ArrayList<>();
        tutorships = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Teacher{" + "password=" + password + ", espeId=" + getEspeId() + ", name=" + getName() + '}';
    }

    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    /**
     * @return the courses
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    /**
     * @return the tutorship
     */
    public ArrayList<Tutorship> getTutorships() {
        return tutorships;
    }

    /**
     * @param tutorship the tutorship to set
     */
    public void setTutorships(ArrayList<Tutorship> tutorship) {
        this.tutorships = tutorship;
    }

}
