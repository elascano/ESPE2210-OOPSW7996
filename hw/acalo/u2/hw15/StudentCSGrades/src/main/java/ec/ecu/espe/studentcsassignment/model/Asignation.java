/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ecu.espe.studentcsassignment.model;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Asignation {
    private boolean compliance;
    private int idStudent;
    private double grade;

    public Asignation(boolean compliance, int idStudent, double grade) {
        this.compliance = compliance;
        this.idStudent = idStudent;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Asignation{" + "compliance=" + compliance + ", idStudent=" + idStudent + ", grade=" + grade + '}';
    }

    /**
     * @return the compliance
     */
    public boolean isCompliance() {
        return compliance;
    }

    /**
     * @param compliance the compliance to set
     */
    public void setCompliance(boolean compliance) {
        this.compliance = compliance;
    }

    /**
     * @return the idStudent
     */
    public int getIdStudent() {
        return idStudent;
    }

    /**
     * @param idStudent the idStudent to set
     */
    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    /**
     * @return the grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    
}
