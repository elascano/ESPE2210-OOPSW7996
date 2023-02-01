/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

import ec.edu.espe.model.Student;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
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
            grades2[0] = 12.5F;
            grades2[1] = 15.6F;
            grades2[2] = 20.0F;
            GPA = ComputeAverage(grades2);
            student = new Student(id, "Edison", grades2, GPA);
        }
        return student;
    }

    public float ComputeAverage(float grades[]) {
        float GPA = 0.0F;
        GPA = (grades[0] + grades[1] + grades[2]) / 3;
        return GPA;
    }
}
