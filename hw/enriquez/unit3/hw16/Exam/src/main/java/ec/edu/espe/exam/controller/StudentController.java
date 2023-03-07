package ec.edu.espe.exam.controller;

import ec.edu.espe.exam.model.Student;
import java.util.ArrayList;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class StudentController {

    public static Student toStudent(Object[] studentList) {
        Student student;

        student = new Student((String) studentList[0], (String) studentList[1], (String) studentList[2]);

        return student;
    }

    public static ArrayList read(ArrayList<Object> studentsList) {
        ArrayList<Student> students;
        Object[] studentList;

        students = new ArrayList<>();

        for (int i = 0; i < studentsList.size(); i++) {
            studentList = (Object[]) studentsList.get(i);
            students.add(toStudent(studentList));
        }

        return students;
    }
}
