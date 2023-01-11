package ec.edu.espe.grading.controller;

import ec.edu.espe.grading.model.Student;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class StudentController {

    public Student find(int id) {
        
        float gardes[]={0.0f, 0.0F, 0.0F};
        Student student = new Student(0, "", gardes, 0.0F);
        //TODO search in the databases

        if (id == 1) {
            float grades[] = {19.12F, 19.12F, 13.2F};
            float GPA;
            GPA = computeAverage(grades);
            student = new Student(id, "Christopher Bazurto", grades, GPA);
        }

        
        return student;
    }

    public float computeAverage(float grades[]) {
        float GPA;
        GPA = (grades[0] + grades[1] + grades[2]) / 3;
        return GPA;
    }
}
