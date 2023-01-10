/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ecu.espe.studentcsassignment.model;

import java.util.ArrayList;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Classroom {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Assignment> assignments;

    public Classroom(String name, ArrayList<Student> students, ArrayList<Assignment> assignments) {
        this.name = name;
        this.students = students;
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        return "Classroom{" + "name=" + name + ", students=" + students + ", assignments=" + assignments + '}';
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
     * @return the students
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    /**
     * @return the assignments
     */
    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    /**
     * @param assignments the assignments to set
     */
    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }
    
    
}
