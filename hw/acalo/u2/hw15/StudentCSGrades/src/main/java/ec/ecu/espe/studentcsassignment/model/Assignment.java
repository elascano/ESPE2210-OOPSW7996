/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ecu.espe.studentcsassignment.model;

import java.util.ArrayList;
import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Assignment {
    private ObjectId _id;
    private String name;
    private String shipping;
    private String deadline;
    private ArrayList<Asignation> assignmentsReport;
    private String comment;

    @Override
    public String toString() {
        return "Assignment{" + "_id=" + _id + ", name=" + name + ", shipping=" + shipping + ", deadline=" + deadline + ", assignmentsReport=" + assignmentsReport + ", comment=" + comment + '}';
    }

    public Assignment(ObjectId _id, String name, String shipping, String deadline, ArrayList<Asignation> assignmentsReport, String comment) {
        this._id = _id;
        this.name = name;
        this.shipping = shipping;
        this.deadline = deadline;
        this.assignmentsReport = assignmentsReport;
        this.comment = comment;
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
     * @return the shipping
     */
    public String getShipping() {
        return shipping;
    }

    /**
     * @param shipping the shipping to set
     */
    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    /**
     * @return the deadline
     */
    public String getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    /**
     * @return the assignmentsReport
     */
    public ArrayList<Asignation> getAssignmentsReport() {
        return assignmentsReport;
    }

    /**
     * @param assignmentsReport the assignmentsReport to set
     */
    public void setAssignmentsReport(ArrayList<Asignation> assignmentsReport) {
        this.assignmentsReport = assignmentsReport;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    
}
