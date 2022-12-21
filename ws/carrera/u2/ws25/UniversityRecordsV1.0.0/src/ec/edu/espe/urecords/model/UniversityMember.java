package ec.edu.espe.urecords.model;

import java.util.ArrayList;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public abstract class UniversityMember {
    private int id;
    private String name;
    private String cédula;
    private ArrayList<NRC> courses;

    
    public abstract void registerInTheSystem();
    public void login(){
        System.out.println("Login into the system");
    }
    
    
    
    public UniversityMember(int id, String name, String cédula, ArrayList<NRC> courses) {
        this.id = id;
        this.name = name;
        this.cédula = cédula;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "UniversityMember{" + "id=" + id + ", name=" + name + ", c\u00e9dula=" + cédula + ", courses=" + courses + '}';
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
     * @return the cédula
     */
    public String getCédula() {
        return cédula;
    }

    /**
     * @param cédula the cédula to set
     */
    public void setCédula(String cédula) {
        this.cédula = cédula;
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
