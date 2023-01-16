/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.grading.model;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class Student {
    private int id;
    private String name;
    private float GPA;
    private float grade[]; 

    public Student(int id, String name, float GPA, float[] grade) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
        this.grade = grade;
    }

    

    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the GPA
     */
    public float getGPA() {
        return GPA;
    }

    /**
     * @param GPA the GPA to set
     */
    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    /**
     * @return the grade
     */
    public float[] getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(float[] grade) {
        this.grade = grade;
    }

    
    
}
