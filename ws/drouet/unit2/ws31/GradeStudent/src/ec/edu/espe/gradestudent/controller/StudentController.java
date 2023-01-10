package ec.edu.espe.gradestudent.controller;

import ec.edu.espe.gradestudent.model.Student;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class StudentController {

    public Student find(int id) {

        Student student = new Student(0, "", new float[3] , 0);

        if (id == 1) {
            float grades[] = {12.5F, 15.6F, 20.0F};
            float gpa = computeAverage(grades);

            student = new Student(id, "Stephen Drouet", grades, 0);
        }

        return student;
    }

    public float computeAverage(float grades[]) {
        float gpa;
        gpa = (grades[0] + grades[1] + grades[2]) / 3;
        return gpa;
    }
}
