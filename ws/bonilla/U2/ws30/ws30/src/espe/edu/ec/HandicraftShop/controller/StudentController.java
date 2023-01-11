/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.HandicraftShop.controller;

import espe.edu.ec.grading.modell.Student;
import java.awt.geom.GeneralPath;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class StudentController {

    public Student find(int id)
    {
        float gardes[] ={0.0F,0.0F,0.0F};
        Student student = new Student(0, "", gardes, 0F);
        if (id == 1) {
            float grades[] ={20.0F,15.60F,12.0F};
            float GPA = 0.0F;
            
            GPA = computerAvarge(grades);
            student = new Student(id, "Jairo", grades, GPA);
            
            

        }

        return student;
    }

    public float computerAvarge(float grades[]) {
        Float GPA = 0.0F;
        GPA = ((grades[0] + grades[1] + grades[2]) / 3);
        return GPA;
    }
}
