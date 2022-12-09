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
public class Course {
    private String name;
    private int nrc;
    private int studentNumber;
    private ArrayList<Student> students;

    public Course() {
        name = "";
        nrc = 0;
        studentNumber = 0;
        students = new ArrayList<>();
    }

    public Course(String name, int nrc) {
        this.name = name;
        this.nrc = nrc;
        this.studentNumber = 0;
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

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent() {

        Student newStudent = new Student();

        String name;
        String espeId;
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Student name: ");
            name = sc.nextLine();
            System.out.print("Student ID: ");
            espeId = sc.nextLine();

            newStudent.setName(name);
            newStudent.setEspeId(espeId);

            students.add(newStudent);
        } catch (Exception e) {
            System.out.println("Error! You should verify the information entered :)");
        }
    }

   
}
