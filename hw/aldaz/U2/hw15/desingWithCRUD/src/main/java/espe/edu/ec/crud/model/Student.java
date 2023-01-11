
package espe.edu.ec.crud.model;

import java.util.ArrayList;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO_ESPE
 */
public class Student {
    private int id;
    private String password;
    private String mail;
    private String dateOfBirth;
    private ArrayList<Double> grades;

    public Student() {
        id = 0;
        password = "";
        mail = "";
        grades = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", password=" + password + ", mail=" + mail + ", grades=" + grades + '}';
    }

    

    public Student(int id, String password, String mail, ArrayList<Double> grades) {
        this.id = id;
        this.password = password;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the name to set
     */
    public void setPassword(String password) {
        this.password = password;
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