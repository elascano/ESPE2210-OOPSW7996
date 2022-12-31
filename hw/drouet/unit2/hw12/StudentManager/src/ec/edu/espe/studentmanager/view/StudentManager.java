package ec.edu.espe.studentmanager.view;

import ec.edu.espe.studentmanager.controller.FinalGradeController;
import ec.edu.espe.studentmanager.controller.StudentController;
import ec.edu.espe.studentmanager.model.FinalGrade;
import ec.edu.espe.studentmanager.model.Student;
import java.util.ArrayList;
import java.util.Scanner;
import utils.DBManager;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class StudentManager {

    public static void main(String[] args) {

        showMenu();

    }

    private static void showMenu() {
        Scanner scan = new Scanner(System.in);
        int option;
        String id;
        String optionStr;
        DBManager dbManager;
        Student student;
        ArrayList<Student> students;
        ArrayList<FinalGrade> studentsFinalGrade;

        dbManager = new DBManager();
        dbManager.connect("mongodb+srv://oop22:oop22@cluster0.cd2tjad.mongodb.net/test", "InClass");

        students = new ArrayList<>();

        do {
            showInfo();
            option = askOption();

            switch (option) {
                case 1:
                    System.out.println("Create Student");
                    student = StudentController.create();

                    if (student != null) {
                        students.add(student);
                        dbManager.createDocument("Student", DBManager.toJson(student));
                    }

                    break;

                case 2:
                    System.out.println("Read Students");
                    students = StudentController.read(dbManager.readCollection("Student"));
                    StudentController.showStudents(students);
                    break;

                case 3:
                    System.out.println("Update Student");
                    System.out.print("Enter the student ID: (L########): ");
                    id = scan.nextLine();
                    student = StudentController.toStudent(dbManager.findDocument("Student", id));

                    if (student != null) {
                        showUpdateMenu(student, dbManager);
                    }

                    break;

                case 4:
                    System.out.println("Delete Student");
                    System.out.print("Enter the student ID: (L########): ");
                    id = scan.nextLine();

                    student = StudentController.toStudent(dbManager.findDocument("Student", id));

                    if (student != null) {
                        System.out.println("ID\t\tNAME\t\tGRADES");
                        System.out.println(student);
                        System.out.println("Enter (y) for deleted the current student");
                        optionStr = scan.nextLine().toLowerCase();
                        if (optionStr.equals("y")) {
                            dbManager.deleteDocument("Student", id);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Compute final grade");
                    students = StudentController.read(dbManager.readCollection("Student"));

                    if (students != null) {
                        studentsFinalGrade = FinalGradeController.buildStudentsFinalGrade(students);

                        for (FinalGrade studentFinalGrade : studentsFinalGrade) {
                            dbManager.createDocument("FinalGrade", DBManager.toJson(studentFinalGrade));
                        }
                        
                        FinalGradeController.showStudentsFinalGrade(studentsFinalGrade);
                    }
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Error: Invalid option, enter one number of the list.");
            }
        } while (option != 6);
    }

    private static void showInfo() {
        System.out.println("--------------------------------------");
        System.out.println("            Stephen Drouet");
        System.out.println("--------------------------------------");
        System.out.println("     Student Manager - Main Menu");
        System.out.println("--------------------------------------");
        System.out.println("1. Create Student");
        System.out.println("2. Read Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Compute final grade of Students");
        System.out.println("6. Exit");
    }

    public static void showUpdateMenu(Student student, DBManager dbManager) {
        Scanner scan = new Scanner(System.in);
        int option;
        String name;
        float grade;

        do {
            System.out.println("-------------------------------------------------");
            System.out.println("ID\t\tName\t\tGRADES");
            System.out.println(student);
            System.out.println("-------------------------------------------------");
            System.out.println("1. Modify name");
            System.out.println("2. Modify grades");
            System.out.println("3. Back");

            option = askOption();

            switch (option) {
                case 1:
                    System.out.print("Enter the new name: ");
                    name = scan.nextLine();
                    student.setName(name);
                    dbManager.updateDocument("Student", student.getId(), "{name: " + DBManager.toJson(student.getName()) + "}");
                    break;

                case 2:
                    System.out.println("What grade do you wanna modify 1, 2 or 3");
                    option = askOption() - 1;
                    if (option >= 0 && option <= 2) {
                        System.out.println("Grade Unit " + (option + 1));
                        grade = StudentController.enterGrade();
                        student.getGrades()[option] = grade;
                        dbManager.updateDocument("Student", student.getId(), "{grades: " + DBManager.toJson(student.getGrades()) + "}");

                    } else {
                        System.out.println("Enter only 1, 2 or 3");
                    }
                    option = 2;
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Error: Invalid option");
            }

        } while (option != 3);

    }

    public static int askOption() {
        int option;

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("\nChoose an option: ");
        try {
            option = sc.nextInt();
        } catch (Exception e) {
            option = 0;
        }
        sc.nextLine();

        return option;
    }
}
