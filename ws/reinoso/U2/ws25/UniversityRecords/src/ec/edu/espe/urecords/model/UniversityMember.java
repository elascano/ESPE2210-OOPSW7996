package ec.edu.espe.urecords.model;

import java.util.ArrayList;
/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public abstract class UniversityMember {
    private int id;
    private String name;
    private String document;
    private ArrayList<NRC> courses;

    public abstract void registerInTheSystem();
    public void login(){
        System.out.println("Login into the system");
    }
      
    public UniversityMember(int id, String name, String document, ArrayList<NRC> courses) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "UniversityMember{" + "id=" + id + ", name=" + name + ", document=" + document + ", courses=" + courses + '}';
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
     * @return the document
     */
    public String getDocument() {
        return document;
    }

    /**
     * @param document the document to set
     */
    public void setDocument(String document) {
        this.document = document;
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
