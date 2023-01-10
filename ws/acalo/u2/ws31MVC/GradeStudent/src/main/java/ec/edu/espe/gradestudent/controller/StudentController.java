/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.gradestudent.controller;

import ec.edu.espe.gradestudent.model.Student;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class StudentController {

    public Student find(int id) {
        float gradesTmp[] = {0.0F, 0.0F, 0.0F};
        Student student = new Student(0, "", gradesTmp, 0.0F);
        if (id == 1) {
            float grades[] = {12.5F, 15.6F, 20.0F};
            
            float GPA = 0.0F;

            GPA = computeAverage(grades);

            student = new Student(id, "Cris", grades, GPA);
            
            System.out.println(student);
            System.out.println(student.getGrades()[0]+","+student.getGrades()[1]+","+student.getGrades()[2]);
        }

        return student;
    }

    public float computeAverage(float grades[]) {
        float GPA = 0.0F;
        GPA = (grades[0] + grades[1] + grades[2]) / 3;
        return GPA;
    }
}
