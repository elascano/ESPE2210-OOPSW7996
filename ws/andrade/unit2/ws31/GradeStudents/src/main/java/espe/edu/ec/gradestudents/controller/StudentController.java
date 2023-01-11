
package espe.edu.ec.gradestudents.controller;

import espe.edu.ec.gradestudents.model.Student;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class StudentController {
    
    public Student find(int id){
        float gradesTemp[] = {0.0F, 0.0F, 0.0F}; 
        Student student = new Student(id, "", gradesTemp, 0.0F);
                
        if(id == 1){
            float []grades = {12.5F, 15.6F, 20.0F};
            float gpa = computeAverage(grades);
            student = new Student(id, "Alejo", grades, gpa);
        }
                
        return student;
    }
    
    public float computeAverage(float grades[]){
        float GPA = 0.0F;
        GPA = ((grades[0] + grades[1] + grades[2])/3);
        return GPA;
    }
    
}
