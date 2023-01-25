package ecx.edu.espe.ws31.controler;

import ecx.edu.espe.ws31.model.Student;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class StudentCtl {
    public Student find(int id){
        
        
        //TODO search in the database
        float gradesTmp[] = {0.0F,0.0F,0.0F};
        Student student = new Student(0,"",gradesTmp,0.0F);
        
        if(id==1){
            float grades[] = {12.5F,15.6F,20.0F};
            float GPA=0.0F;
        
            GPA=computeAverage(grades);//16.3
            student = new Student(id,"Daniel",grades,GPA);
            
        }
        
        return student;
    }
    public float computeAverage(float grades[]){
        float GPA=0.0F;
        GPA=(grades[0]+grades[1]+grades[2])/3;
        return GPA;
    }
}
