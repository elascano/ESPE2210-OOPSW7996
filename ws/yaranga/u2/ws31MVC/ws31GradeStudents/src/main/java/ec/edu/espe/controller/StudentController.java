/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

import ec.edu.espe.model.Student;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class StudentController {
    public static Student find(int id){
       // float grades[]={0.0F,0.0F,0.0F};
        Student student = new Student();
        
        if(id==1){
    float grades[]={12.12F,15.6F,20.0F};
    float GPA = 0.0F;
            GPA=computeAverage(grades);//16.03
            student = new Student(id,"Edison",grades,0.0F);
        }
            return student;
    }
    
    public static float computeAverage(float grades[]){
    float GPA = 0.0F;
    GPA=((grades[0]+grades[1]+grades[2])/(3));
    return GPA;
    }
    
    
}
