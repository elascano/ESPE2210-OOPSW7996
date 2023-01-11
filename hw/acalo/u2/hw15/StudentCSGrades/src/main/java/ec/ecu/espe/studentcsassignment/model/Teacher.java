/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ecu.espe.studentcsassignment.model;

import java.util.ArrayList;
import org.bson.types.ObjectId;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Teacher extends HighSchoolUser{
    
    private ArrayList<Classroom> classroom;

    public Teacher(ArrayList<Classroom> classroom, ObjectId _id, String name, int id, String password, String email) {
        super(_id, name, id, password, email);
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Teacher{" + "classroom=" + classroom + '}';
    }
    
    /**
     * @return the classroom
     */
    public ArrayList<Classroom> getClassroom() {
        return classroom;
    }

    /**
     * @param classroom the classroom to set
     */
    public void setClassroom(ArrayList<Classroom> classroom) {
        this.classroom = classroom;
    }
    
    
    
}
