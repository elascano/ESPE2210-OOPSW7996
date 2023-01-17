package ec.edu.espe.students.controller;

import ec.edu.espe.students.model.Student;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class StudentController {

    public Student find(int id) {

        Student student = new Student(0, "", new float[3] , 0);
        if (id == 1) {
            float grades[] = {12.5F, 17.6F, 13.0F};
            float gpa = computeAverage(grades);
            student = new Student(id, "Elkin", grades, 0);
        }
        return student;
    }

    public float computeAverage(float grades[]) {
        float gpa;
        gpa = (grades[0] + grades[1] + grades[2]) / 3;
        return gpa;
    }
}
