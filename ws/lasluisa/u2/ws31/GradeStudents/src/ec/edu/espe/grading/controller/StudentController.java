package ec.edu.espe.grading.controller;

import ec.edu.espe.grading.model.Student;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class StudentController {

    public Student find(int id) {
        float gradesTemp[] = {0.0F, 0.0F, 0.0F};
        Student student = new Student(0, "", gradesTemp, 0.0F);

        //TODO search in the database
        if (id == 1) {
            float grades[] = {12.5F, 15.6F, 20.0F};
            float GPA = 0.0F;

            GPA = computeAverage(grades);
            student = new Student(id, "Edison", grades, GPA);
        }

        return student;
    }

    public float computeAverage(float grades[]) {
        float GPA = 0.0F;
        GPA = (grades[0] + grades[1] + grades[2]) / 3;
        return GPA;
    }

}
