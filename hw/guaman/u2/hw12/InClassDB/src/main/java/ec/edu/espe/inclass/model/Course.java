package ec.edu.espe.inclass.model;

import java.util.ArrayList;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Course {

    private String name;
    private int nrc;
    private int studentNumber;

    public Course(String name, int nrc, int studentNumber) {
        this.name = name;
        this.nrc = nrc;
        this.studentNumber = studentNumber;
    }

    public Course() {
        name = "";
        nrc = 0;
        studentNumber = 0;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", nrc=" + nrc + ", studentNumber=" + studentNumber + '}';
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
     * @return the nrc
     */
    public int getNrc() {
        return nrc;
    }

    /**
     * @param nrc the nrc to set
     */
    public void setNrc(int nrc) {
        this.nrc = nrc;
    }

    /**
     * @return the studentNumber
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     * @param studentNumber the studentNumber to set
     */
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    public static Course toCourse(Object[] courseList) {
        Course course;

        if (courseList == null) {
            return null;
        }

        course = new Course((String) courseList[1], (Integer) courseList[2], (Integer) courseList[3]);

        return course;
    }
    
    public static ArrayList read(ArrayList<Object> coursesList) {
        ArrayList<Course> courses;
        Object[] courseList;

        courses = new ArrayList<>();

        for (int i = 0; i < coursesList.size(); i++) {
            courseList = (Object[]) coursesList.get(i);
            courses.add(toCourse(courseList));
        }

        return courses;
    }

}
