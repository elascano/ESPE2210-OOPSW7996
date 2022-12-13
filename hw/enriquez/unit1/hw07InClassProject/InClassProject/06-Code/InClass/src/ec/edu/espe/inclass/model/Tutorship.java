package ec.edu.espe.inclass.model;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Tutorship{
    private Date date;
    private String id;
    private String name;
    private String career;
    private String courseName;

    public Tutorship(){
        date = null;
        id = "";
        name = "";
        courseName = "";
        career = "";
    }
    public Tutorship(Date date, String id, String name, String career, String courseName) {
        this.date = date;
        this.id = id;
        this.name = name;
        this.career = career;
        this.courseName = courseName;
    }

    public Tutorship(Date date) {
        this.date = date;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
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
     * @return the career
     */
    public String getCareer() {
        return career;
    }

    /**
     * @param career the career to set
     */
    public void setCareer(String career) {
        this.career = career;
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void requestTutorship() {
        date = new Date();
        //Using data from Keyboard
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student id: ");
        id= scan.nextLine();
        System.out.print("student career:");
        career = scan.nextLine();
        System.out.print("Name student: ");
        name = scan.nextLine();
        System.out.print("Course Name: ");
        courseName = scan.nextLine();
        System.out.println(date);
        System.out.println("I, " + getName() + ", with ID: " + getId() + ", student of the Career: " + getCareer()
                + " of Universidad de las Fuerzas Armadas -- ESPE Matriz Sangolqui , I request you, Mr.Director Career, it is designated to enter and register"
                + " in the database the request for a tutoring of the: " + getCourseName() + "For the attention to the request, receive my thanks.");

    }

    @Override
    public String toString() {
        return  "date=" + date + ", id=" + id + ", name=" + name + ", career=" + career + ", courseName=" + courseName;
    }
    
    
}
