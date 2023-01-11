/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ecu.espe.studentcsassignment.model;

import org.bson.types.ObjectId;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Enrollment {
    private ObjectId _id;
    private int studentId;
    private String subjects[];

    public Enrollment(ObjectId _id, int studentId, String[] subjects) {
        this._id = _id;
        this.studentId = studentId;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Enrollment{" + "_id=" + _id + ", studentId=" + studentId + ", subjects=" + subjects + '}';
    }

    
    
    /**
     * @return the _id
     */
    public ObjectId getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(ObjectId _id) {
        this._id = _id;
    }

    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the subjects
     */
    public String[] getSubjects() {
        return subjects;
    }

    /**
     * @param subjects the subjects to set
     */
    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
    
    
}
