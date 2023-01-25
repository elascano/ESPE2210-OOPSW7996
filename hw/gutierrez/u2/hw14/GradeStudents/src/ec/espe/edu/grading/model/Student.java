/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.grading.model;

/**
 *
 * @author Miguel Gutierrez, Pythons, DCCO-ESPE
 */
public class Student {
   private int id;
   private String name;
   private float GPA;
   private float grades[];

    public Student(int id, String name, float GPA, float[] grades) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
        this.grades = grades;
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
     * @return the grades
     */
    public float[] getGrades() {
        return grades;
    }

    /**
     * @param grades the grades to set
     */
    public void setGrades(float[] grades) {
        this.grades = grades;
    }
   
   
   
}
