package ec.espe.edu.grading.controller;

import ec.espe.edu.grading.model.Student;
/**
 *
 * @author Miguel Gutierrez, Pythons, DCCO-ESPE
 */
public class StudentController {
    
    public Student find(int id){
        float grades[]={12.5F,15.6f,20.0F};
        float GPA=0.0F;
     
        return new Student(id,"Miguel",grades,0.0F);
    }
    public float computeAverage(float grades[]){
        float GPA =0.0F;
        GPA =(grades[0]+grades[1]+grades[2])/3);
        return GPA;
    }
}
