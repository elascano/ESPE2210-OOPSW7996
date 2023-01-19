
package ec.ecu.espe.grading.controller;

import ec.ecu.espe.grading.model.Student;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class StudentController {
    
    public Student find (int id){
        
        float gradesTmp[]= {0.0F,0.0F,0.0F};
        Student student = new Student(0, "", gradesTmp,0.0F);
        if (id==1){
            float grades[] = {12.5F, 15.6F,20.0F};
            float GPA=0.0F;

            GPA=computeAverage(grades);//16.03
            student = new Student(id,"Lindsay",grades,GPA);
        }
        return student;
    }
    
    public float computeAverage(float grades[]){
        float GPA=0.0F;
        GPA = (grades[0]+grades[1]+grades[2])/3;
        return GPA;
    }
}
