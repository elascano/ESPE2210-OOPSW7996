
package ec.edu.espe.grading.controller;

import ec.edu.espe.grading.model.Student;

/**
 *
 * @author NW USER
 */
public class StudentController {
    public Student find(int id){
    float grades[] = new float[3];
        grades[0] = 0.0F;
        grades[1] = 0.0F;
        grades[2] = 0.0F;
        Student student = new Student(0, "", grades, 0.0F);
        if (id == 1) {
            float grades2[] = new float[3];
            float GPA = 0.0F;
            grades2[0] = 18.5F;
            grades2[1] = 16.6F;
            grades2[2] = 20.0F;
            GPA = ComputeAverage(grades2);
            student = new Student(id, "David Toapanta", grades2, GPA);
        }
        return student;
    }

    public float ComputeAverage(float grades[]) {
        float GPA = 0.0F;
        GPA = (grades[0] + grades[1] + grades[2]) / 3;
        return GPA;
    }
}
