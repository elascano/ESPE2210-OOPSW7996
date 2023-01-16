/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Student {
    
    private int id;
    private String name;
    private float grades[];
    private float GPA;

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", grades=" + grades + ", GPA=" + GPA + '}';
    }

    public Student(){
        this.id = 0;
        this.name = "";
        this.grades = null;
        this.GPA = 0.0F;
    }
    
    
    public Student(int id, String name, float[] grades, float GPA) {
        this.id = id;
        this.name = name;
        this.grades = grades;
        this.GPA = GPA;
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
    
}
