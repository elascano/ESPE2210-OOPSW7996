/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.grading.model;

/**
 *
 * @author Carlos Alexander Torres, PACSTORE, DCCO-ESPE
 */
public class Student {
    int id;
    String name;
    float grades[];
    float GPA;

    public Student(int id, String name, float[] grades, float GPA) {
        this.id = id;
        this.name = name;
        this.grades = grades;
        this.GPA = GPA;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float[] getGrades() {
        return grades;
    }

    public void setGrades(float[] grades) {
        this.grades = grades;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    
    
    
    

            
}
