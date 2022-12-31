package ec.edu.espe.studentmanager.controller;

import com.google.gson.Gson;
import ec.edu.espe.studentmanager.model.Student;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class StudentController {

    public static Student create() {
        Scanner scan;
        Student student = null;
        String id;
        String name;
        float[] grades;

        try {
            scan = new Scanner(System.in);
            grades = new float[3];

            System.out.print("Enter your student ID (L########): ");
            id = scan.nextLine();
            System.out.print("Enter your name: ");
            name = scan.nextLine();
            System.out.println("Unit 1");
            grades[0] = enterGrade();
            System.out.println("Unit 2");
            grades[1] = enterGrade();
            System.out.println("Unit 3");
            grades[2] = enterGrade();

            student = new Student(id, name, grades);

        } catch (Exception e) {
            System.out.println("Error: Invalid data + " + e.getMessage());
        }

        return student;
    }

    public static float enterGrade() {
        Scanner scan = new Scanner(System.in);
        float grade = -1;

        do {
            try {
                System.out.print("Enter grade (0-20): ");
                grade = scan.nextFloat();                
                if (grade < 0 || grade > 20) {
                    grade = -1;
                    System.out.println("Error: Grade entered out of bounds (0-20)");                    
                }
            } catch (Exception e) {
                System.out.println("Error: invalid");                
            }
            scan.nextLine();
        } while (grade == -1);

        return grade;
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

    public static Student toStudent(Object[] studentList) {
        Student student;
        float[] grades;

        if (studentList == null) {
            return null;
        }

        grades = new float[3];

        for (int j = 0; j < grades.length; j++) {
            try {
                grades[j] = ((Double) ((ArrayList) studentList[3]).get(j)).floatValue();
            } catch (Exception e) {
                grades[j] = ((Integer) ((ArrayList) studentList[3]).get(j));
            }
        }

        student = new Student((String) studentList[1], (String) studentList[2], grades);

        return student;
    }

    public static void showStudents(ArrayList<Student> students) {
        int counter = 1;
        System.out.println("#\tID\t\tNAME\t\tGRADES");
        System.out.println("-----------------------------------------------------------");
        for (Student student : students) {
            System.out.println(counter + "\t" + student);
            counter++;
        }
        System.out.println("-----------------------------------------------------------");
    }
}
