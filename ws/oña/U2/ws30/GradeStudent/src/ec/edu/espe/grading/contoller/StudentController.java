
package ec.edu.espe.grading.contoller;

import ec.edu.espe.grading.model.Student;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class StudentController {
    public Student find(int id){
        
        float gradesTmp[]={0.0F, 0.0F, 0.0F};
        Student student = new Student(0,"",gradesTmp, 0.0F);
        
        if(id==1){
        float grades[]={12.5F, 18.0F, 20.0F};
        float GPA=0.0F;
        
        GPA = computeAverage(grades);
        
        return new Student(id, "Yorman",grades, GPA);
        }
        return student;
    }
    
    public float computeAverage(float grades[]){
        float GPA=0.0F;
        GPA = (grades[0]+grades[1]+grades[2])/3;
        return GPA;
    }
}

