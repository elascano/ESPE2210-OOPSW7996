
package ec.edu.espe.grading.controller;

import ec.edu.espe.grading.model.Student;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class StudentController {
    public Student find(int id){
      
        float grades[] = new float[3];
        grades[0] = 0.0F;
        grades[1] = 0.0F;
        grades[2] = 0.0F;
        Student student = new Student(0,"", grades, 0.0F);
        
        if (id == 1) {
            //OPCION 1
            //float grades[] = {12.5F,15.6F,20.0F};
        
            //OPCION 2
            float grades2[] = new float[3];
            grades2[0] = 12.5F;
            grades2[1] = 15.6F;
            grades2[2] = 20.0F;
        
            float GPA=0.0F;
            GPA = computeAverage(grades);
            student = new Student(id, "Reishel", grades2, GPA);
        }
        return student;
    }
    
    public float computeAverage(float grades[]){
        float GPA = 0.0F;
        GPA = (grades[0] + grades[1] + grades[2]) / 3;
        return GPA;
    }
}
