package ec.edu.espe.gradestudents.controller;

import ec.edu.espe.gradestudents.model.Student;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class StudentController {
    public Student find(int id){
        Student student;
        student = null;
        if(id ==1){
            float grades[] = {18.5F, 15.6F, 20.0f};
            float GPA;
            GPA = computeAverage(grades);
            student =  new Student(id, "Nahir Carrera", grades, GPA);
        }
        return student;
    }
    public float computeAverage(float grades[]){
        float GPA;
        GPA = (grades[0] + grades [1] + grades [ 2])/3;
        return GPA;
    }
}
