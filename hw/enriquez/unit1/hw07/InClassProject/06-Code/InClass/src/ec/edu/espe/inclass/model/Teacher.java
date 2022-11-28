package ec.edu.espe.inclass.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Teacher {

    private String name;
    private String id;
    private ArrayList<Course> courses;
    private ArrayList<Tutorship> tutorships;

    public Teacher(String name, String id, ArrayList<Course> courses, ArrayList<Tutorship> tutorship) {
        this.name = name;
        this.id = id;
        this.courses = courses;
        this.tutorships = tutorship;
    }

    public Teacher() {
        name = "";
        id = "";
        courses = new ArrayList<>();
        tutorships = new ArrayList<>();
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

    public void addCourse() {

        Course newCourse = new Course();

        String name;
        int nrc;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Assignature name: ");
            name = sc.nextLine();
            System.out.print("Enter course's NRC: ");
            nrc = sc.nextInt();
            sc.nextLine();

            newCourse.setName(name);
            newCourse.setNrc(nrc);

            getCourses().add(newCourse);
        } catch (Exception e) {
            System.out.println("Error! You should verify the information entered :)");
        }
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
