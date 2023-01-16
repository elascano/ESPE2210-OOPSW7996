/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam.controller;

import ec.edu.espe.exam.model.Student;
import java.util.ArrayList;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class DBManager {

    public static Student toStudent(Object[] studentList) {
        Student student;

        student = new Student((String) studentList[0], (String) studentList[1], (String) studentList[2]);

        return student;
    }

    public static ArrayList read(ArrayList<Object> studentList) {
        ArrayList<Student> students;
        Object[] studentList;

        students = new ArrayList<>();

        for (int i = 0; i < studentList.size(); i++) {
            studentList = (Object[]) studentList.get(i);
            students.add(toStudent(studentList));
        }

        return students;
    }
}
