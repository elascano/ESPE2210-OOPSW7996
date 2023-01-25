/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.taxischeduling.controller;
import ec.edu.espe.taxischeduling.model.Student;
/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class StudentController {
    public Student find(int id){
        
        float gradesTmp[] = {0.0F, 0.0F, 0.0F};
        Student student = new Student(0, "", gradesTmp, 0.0F);
        
        if(id==1){
        float grades[] = {12.5F, 15.6F, 20.0F};
        float GPA=0.0F;
        
        GPA=computerAverage(grades);
        student = new Student(id,"Sebastian", grades, GPA);
        }
        return student;
    }
    
    public float computerAverage(float grades[]){
        float GPA=0.0F;
        GPA = (grades[0]+grades[1]+grades[2])/3;
        return GPA;
    }
}
