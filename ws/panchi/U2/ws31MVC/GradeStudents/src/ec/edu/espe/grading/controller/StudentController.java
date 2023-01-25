package ec.edu.espe.grading.controller;

import ec.edu.espe.grading.model.Student;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class StudentController {
    public Student find(int id){
        
        float gradesTmp[] = {0.0F, 0.0F, 0.0F};
        
        Student student = new Student(0, "", gradesTmp, 0.0F);
        
        if(id == 1){
        float grades[] = {12.5F, 14.6F, 18.9F};
        float gpa = 0.0F;
        gpa = computeAverage(grades);
        student = new Student(1, "Allan", grades, gpa);
        }
        return student;
    }
    
    public float computeAverage(float grades[]){
        float GPA = 0.0F;
        GPA = (grades[0] + grades[1] + grades[2]) / 3;
        return GPA;
    }
}
