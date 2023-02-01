package ec.edu.espe.student.controller;

import ec.edu.espe.student.model.Student;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class StudentController {
    public Student find(int id){
        
        float gradesdefault[]={0.0F, 0.0F, 0.0F};
        Student student = new Student(id, "", gradesdefault, 0.0F);
        

        if(id==1){
            float grades[] = {12.5F, 14.8F, 19.0F};//usado para pocos datos
            float GPA = 0.0F;
            GPA = computeAverage(grades);
            student = new Student(id,"Jonathan Jaguaco",grades, 0.0F);
        }
            return student;
    }
       
    
    public float computeAverage(float grades[]){
        float GPA1,GPA ;
        GPA1 = (grades[0]+grades[1]+grades[2]);
        GPA = GPA1/3;
        return GPA;
    }
}
