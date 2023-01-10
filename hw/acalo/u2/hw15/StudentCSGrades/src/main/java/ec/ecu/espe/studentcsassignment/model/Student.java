/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ecu.espe.studentcsassignment.model;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Student extends HighSchoolUser{
    
    private int age;
    private Enrollment enrollment;

    public Student(int age, Enrollment enrollment, String name, int id, String password, String email) {
        super(name, id, password, email);
        this.age = age;
        this.enrollment = enrollment;
    }

    @Override
    public String toString() {
        return "Student{" + "age=" + age + ", enrollment=" + enrollment + '}';
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the enrollment
     */
    public Enrollment getEnrollment() {
        return enrollment;
    }

    /**
     * @param enrollment the enrollment to set
     */
    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    
}

