package ec.edu.espe.studentmanager.controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import ec.edu.espe.studentmanager.model.Student;
import java.io.StringReader;
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

    public static ArrayList read(ArrayList<String> studentsList) {
        ArrayList<Student> students;

        students = new ArrayList<>();
        for (String json : studentsList) {
            students.add(jsonToStudent(json));
        }

        return students;
    }

    public static Student jsonToStudent(String json) {
        Student student = new Student();
        Gson gson = new Gson();
        student = gson.fromJson(json, student.getClass());                               

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
