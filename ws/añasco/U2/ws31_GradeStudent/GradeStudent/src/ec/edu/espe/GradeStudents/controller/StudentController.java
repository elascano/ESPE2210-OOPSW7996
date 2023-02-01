package ec.edu.espe.GradeStudents.controller;

import ec.edu.espe.GradeStudents.model.Student;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class StudentController {
    public Student find(int id){
        Student student = null;
        
        if(id ==1){
            float grades[] ={12.5F, 15.6F, 20.0F};
            float GPA = 0.0F;
        
            GPA = computeAverage(grades);
            student = new Student(id,"Silvia",grades,GPA);
        }
        return student;
    }
    
    public float computeAverage(float grades[]){
        float GPA = 0.0F;
        GPA = (grades[0]+grades[1]+grades[2])/3;
        return GPA;
    }
}
