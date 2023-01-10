/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ecu.espe.studentcsassignment.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Assignment {
    private String name;
    private Date shipping;
    private Date deadline;
    private ArrayList<Asignation> assignmentsReport;
    private String comment;

    
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
    public Date getShipping() {
        return shipping;
    }

    /**
     * @param shipping the shipping to set
     */
    public void setShipping(Date shipping) {
        this.shipping = shipping;
    }

    /**
     * @return the deadline
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(Date deadline) {
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
