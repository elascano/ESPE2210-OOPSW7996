
package espe.edu.ec.desingwithcrud.model;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class Student {
    private int id;
    private String name;
    private String mail;
    private String dateOfBirth;
    private ArrayList<Double> grades;

    public Student() {
        id = 0;
        name = "";
        mail = "";
        grades = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", mail=" + mail + ", grades=" + grades + '}';
    }

    

    public Student(int id, String name, String mail, ArrayList<Double> grades) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.grades = grades;
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
     * @return the age
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the grades
     */
    public ArrayList<Double> getGrades() {
        return grades;
    }

    /**
     * @param grades the grades to set
     */
    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
