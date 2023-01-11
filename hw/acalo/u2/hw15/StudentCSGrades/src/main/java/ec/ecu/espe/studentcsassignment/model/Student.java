/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ecu.espe.studentcsassignment.model;

import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Student extends HighSchoolUser{
    
    private int age;
    private int enrollment;

    public Student(int age, int enrollment, ObjectId _id, String name, int id, String password, String email) {
        super(_id, name, id, password, email);
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
    public int getEnrollment() {
        return enrollment;
    }

    /**
     * @param enrollment the enrollment to set
     */
    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    
}

