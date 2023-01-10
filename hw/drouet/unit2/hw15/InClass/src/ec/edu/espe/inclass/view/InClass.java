package ec.edu.espe.inclass.view;

import ec.edu.espe.inclass.controller.CourseController;
import ec.edu.espe.inclass.model.AttendanceRecord;
import ec.edu.espe.inclass.model.Course;
import ec.edu.espe.inclass.model.Grade;
import ec.edu.espe.inclass.controller.StudentController;
import ec.edu.espe.inclass.controller.TeacherController;
import ec.edu.espe.inclass.controller.TutorshipController;
import ec.edu.espe.inclass.model.Student;
import ec.edu.espe.inclass.model.Teacher;
import ec.edu.espe.inclass.model.Tutorship;
import java.util.ArrayList;
import java.util.Scanner;
import utils.DBManager;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class InClass {

    static Teacher teacher;
    static DBManager dBManager;

    public static void main(String[] args) {

        connectMongoDB();
        controlMainMenu();
    }

    public static void connectMongoDB() {
        ArrayList<Tutorship> tutorships;
        ArrayList<Course> courses;
        ArrayList<Student> students;

        dBManager = new DBManager();
        dBManager.connect("mongodb+srv://oop22:oop22@cluster0.cd2tjad.mongodb.net/test", "InClassProject");
        teacher = new Teacher();
        teacher = TeacherController.jsonToTeacher((String) dBManager.readCollection("Teacher").get(0));
        tutorships = TutorshipController.loadTutorships(dBManager.readCollection("Tutorships"));
        courses = CourseController.loadCourses(dBManager.readCollection("Courses"));

        for (Course course : courses) {
            students = StudentController.loadStudents(dBManager.readCollection("Students", "nrc", course.getNrc()));
            course.setStudents(students);
        }

        teacher.setTutorships(tutorships);
        teacher.setCourses(courses);
    }

    public static void controlMainMenu() {
        int option = 0;

        while (option != 3) {
            System.out.println("======================================");
            System.out.println("----------------InClass---------------");
            System.out.println("======================================");
            System.out.println("-----------Developer Bears------------");
            System.out.println("Alejandro Cuadrado, Alexander Guaman");
            System.out.println("Sheylee Enriquez, Stephen Drouet");
            System.out.println("======================================");
            System.out.println("---------------Main Menu--------------");
            System.out.println("======================================");
            System.out.println("1. Teacher Menu");
            System.out.println("2. Student Menu");
            System.out.println("3. Exit");

            option = askOption();

            switch (option) {
                case 1 -> controlTeacherMenu();

                case 2 -> controlStudentMenu();

                case 3 -> System.out.println("See you...");

                default -> System.out.println("Error: Invalid option try again.");
            }
        }
    }

    private static void controlStudentMenu() {
        int option = 0;
        System.out.println("ask for ESPE ID");
        // verify if espe ID exist an return a student with information
        while (option != 2) {
            System.out.println("-----Student Menu-----");
            System.out.println("1. Request a tutorship");
            System.out.println("2. Back");

            option = askOption();

            switch (option) {
                case 1 -> {
                    Tutorship tutorship = new Tutorship();
                    tutorship.requestTutorship();
                    try {
                        teacher.getTutorships().add(tutorship);
                        dBManager.createDocument("Tutorships", DBManager.toJson(tutorship));
                    } catch (Exception e) {
                        System.out.println("error could not add tutorship");
                    }
                    System.out.println("A tutorship was requested");
                }

                case 2 -> {
                }

                default -> System.out.println("Error: Invalid option try again.");
            }
        }
    }

    private static void controlTeacherMenu() {
        Course course;
        int option = 0;

        while (option != 5) {
            System.out.println("--------------------------------------------");
            System.out.println("   Hi, " + teacher.getName() + " - ESPE ID: " + teacher.getEspeId());
            System.out.println("---------------------------------------------");
            System.out.println("----------Teacher Menu----------");
            System.out.println("1. Enter a course");
            System.out.println("2. Add Course");
            System.out.println("3. Remove Course");
            System.out.println("4. Get tutorship record");
            System.out.println("5. Back");

            option = askOption();

            switch (option) {
                case 1 -> {
                    showCourses();
                    enterCourse();
                }

                case 2 -> {
                    System.out.println("Function for add Course");
                    course = teacher.addCourse();

                    if (course != null) {
                        dBManager.createDocument("Courses", CourseController.courseToJsonForDB(course));
                    }
                }

                case 3 -> {
                    System.out.println("Function for remove Course");
                    showCourses();
                    removeCourse();
                }

                case 4 -> {
                    System.out.println("Tutorship record");
                    for (Tutorship tutorship : teacher.getTutorships()) {
                        System.out.println("\n======================================");
                        tutorship.printRequestTutorship();
                    }
                }

                case 5 -> {
                }

                default -> System.out.println("Error: Invalid option try again.");
            }
        }
    }

    public static void enterCourse() {
        int courseNumber;
        Course course;
        System.out.println("Which course do you want to enter?: ");
        courseNumber = askOption() - 1;
        try {
            course = teacher.getCourses().get(courseNumber);
            ControlCourseMenu(course);
        } catch (Exception e) {
            System.out.println("Error: Course was not find");
        }
    }

    public static void removeCourse() {
        int courseNumber;
        System.out.println("Which course do you want to remove?: ");
        courseNumber = askOption() - 1;
        try {
            dBManager.deleteDocument("Courses", "nrc", teacher.getCourses().get(courseNumber).getNrc());
            teacher.getCourses().remove(courseNumber);
            System.out.println("The course was remove successfully");
        } catch (Exception e) {
            System.out.println("The course was not remove");
        }
    }

    private static void showCourses() {
        for (int CourseNumber = 0; CourseNumber < teacher.getCourses().size(); CourseNumber++) {
            System.out.println(CourseNumber + 1 + ". " + teacher.getCourses().get(CourseNumber));
        }
    }

    private static void ControlCourseMenu(Course course) {
        Student student;

        int option = 0;
        int studentNumber;

        AttendanceRecord attendanceRecord;
        attendanceRecord = new AttendanceRecord();

        while (option != 9) {
            System.out.println(course);
            System.out.println("-----Course Menu-----");
            System.out.println("1. Managament student information");
            System.out.println("2. Show enrolled students");
            System.out.println("3. Add Grade");
            System.out.println("4. Take Attendance");
            System.out.println("5. Add student");
            System.out.println("6. Remove student");
            System.out.println("7. Get grade record");
            System.out.println("8. Get attendance record");
            System.out.println("9. Back");

            option = askOption();

            switch (option) {
                case 1 -> {
                    showStudents(course);

                    System.out.println("Which student do you want to manage?: ");
                    studentNumber = askOption() - 1;

                    try {
                        student = course.getStudents().get(studentNumber);
                        ControlStudentInfoMenu(student);
                        dBManager.updateDocument("Students", student.getEspeId(), course.getNrc(),
                                StudentController.studentToJsonForDB(student, course.getNrc()));
                    } catch (Exception e) {
                        System.out.println("Error: Course was not find");
                    }
                }

                case 2 -> {
                    System.out.println("Function for enrolled students");
                    showStudents(course);
                }

                case 3 -> {
                    System.out.println("Add Grades for all");
                    addGradeForAll(course);
                    UpdateStudentsInDB(course);
                }

                case 4 -> {
                    System.out.println("Function for take Attendance");
                    attendanceRecord.add(course.getStudents());
                    UpdateStudentsInDB(course);
                }

                case 5 -> {
                    System.out.println("Function for add student");
                    student = course.addStudent("prueba", "L00000000");
                    dBManager.createDocument("Students", StudentController.studentToJsonForDB(student, course.getNrc()));
                }

                case 6 -> {
                    System.out.println("Function for remove student");
                    showStudents(course);

                    System.out.println("Which student do you want to remove?: ");
                    studentNumber = askOption() - 1;

                    try {
                        dBManager.deleteStudentDocument(course.getStudents().get(studentNumber).getEspeId(), course.getNrc());
                        course.getStudents().remove(studentNumber);
                        System.out.println("The student was remove successfully");
                    } catch (Exception e) {
                        System.out.println("The student was not remove");
                    }
                }

                case 7 -> {
                    System.out.println("Function for grade record");
                    for (Student student1 : course.getStudents()) {
                        System.out.println("--------------------------------------------------------------------------------------------------");
                        System.out.println("- " + student1.getName() + ": \n" + student1.getGradeRecord());
                    }
                }

                case 8 -> {
                    System.out.println("Function for attendance record");
                    for (Student student1 : course.getStudents()) {
                        System.out.print("- " + student1.getName());
                        System.out.println(": " + student1.getAttendanceRecord());
                    }
                }

                case 9 -> {
                }

                default -> System.out.println("Error: Invalid option try again.");
            }
        }
    }

    private static void UpdateStudentsInDB(Course course) {
        for (Student student1 : course.getStudents()) {
            dBManager.updateDocument("Students", student1.getEspeId(), course.getNrc(),
                    StudentController.studentToJsonForDB(student1, course.getNrc()));
        }
    }

    private static void showStudents(Course course) {
        for (int studentNumber = 0; studentNumber < course.getStudents().size(); studentNumber++) {
            System.out.println((studentNumber + 1) + ". " + course.getStudents().get(studentNumber));
        }
    }

    private static void addGradeForAll(Course course) {
        int option;
        int unitNumber;

        Grade studentSubject;

        System.out.println("What unit do you need to enter? (1, 2 or 3)");
        unitNumber = askOption() - 1;

        if (unitNumber >= 0 && unitNumber < 3) {
            System.out.println("What grade do you want to enter?");
            System.out.println("1. Workshop");
            System.out.println("2. Homework");
            System.out.println("3. Test");
            System.out.println("4. Exam");
            option = askOption();

            switch (option) {
                case 1 -> {
                    for (Student student1 : course.getStudents()) {
                        studentSubject = student1.getGradeRecord().getUnits().get(unitNumber).getWorkshops();
                        AddStudentGrade(student1, studentSubject);
                    }
                }

                case 2 -> {
                    for (Student student1 : course.getStudents()) {
                        studentSubject = student1.getGradeRecord().getUnits().get(unitNumber).getHomeworks();
                        AddStudentGrade(student1, studentSubject);
                    }
                }

                case 3 -> {
                    for (Student student1 : course.getStudents()) {
                        studentSubject = student1.getGradeRecord().getUnits().get(unitNumber).getTests();
                        AddStudentGrade(student1, studentSubject);
                    }
                }

                case 4 -> {
                    for (Student student1 : course.getStudents()) {
                        studentSubject = student1.getGradeRecord().getUnits().get(unitNumber).getExam();
                        AddStudentGrade(student1, studentSubject);
                    }
                }

                default -> System.out.println("Error: Invalid option");
            }

        } else {
            System.out.println("Error: The selected unit does not exist");
        }
    }

    private static void AddStudentGrade(Student student1, Grade studentSubject) {
        float gradeValue;

        System.out.print("- " + student1.getName() + " Grade: ");

        do {
            gradeValue = inputGrade();
        } while (Float.isNaN(gradeValue));

        studentSubject.add(gradeValue);
    }

    private static float inputGrade() {
        Scanner scan = new Scanner(System.in);
        float gradeValue = Float.NaN;

        try {
            gradeValue = scan.nextFloat();
            if (gradeValue <= 20 && gradeValue >= 0) {
                return gradeValue;
            } else {
                System.out.println("The range of the grades is from 0 to 20.\nTry again");
                gradeValue = Float.NaN;
            }

        } catch (Exception e) {
            System.out.println("Error: Invalid number, please use comma(,) for decimal numbers and the range is (0-20).\nTry again: ");
        }

        return gradeValue;
    }

    private static void ControlStudentInfoMenu(Student student) {
        int unitNumber = 0;
        int option = 0;

        Grade studentSubject;

        while (option != 5) {
            System.out.println(student);
            System.out.println("-----Control student information Menu-----");
            System.out.println("1. Modify workshop grade");
            System.out.println("2. Modify homework grade");
            System.out.println("3. Modify tests grade");
            System.out.println("4. Modify exam grade");
            System.out.println("5. Back");

            option = askOption();

            if (option != 5) {
                System.out.println("What unit do you need to modify? (1, 2 or 3)");
                unitNumber = askOption() - 1;
            }

            if (unitNumber >= 0 && unitNumber < 3) {
                switch (option) {
                    case 1 -> {
                        System.out.println("Function for modify workshop grade");
                        studentSubject = student.getGradeRecord().getUnits().get(unitNumber).getWorkshops();
                        modifyStudenSubject(studentSubject);
                    }

                    case 2 -> {
                        System.out.println("Function for modify homework grade");
                        studentSubject = student.getGradeRecord().getUnits().get(unitNumber).getHomeworks();
                        modifyStudenSubject(studentSubject);
                    }

                    case 3 -> {
                        System.out.println("Function for modify test grade");
                        studentSubject = student.getGradeRecord().getUnits().get(unitNumber).getTests();
                        modifyStudenSubject(studentSubject);
                    }

                    case 4 -> {
                        System.out.println("Function for modify exam grade");
                        studentSubject = student.getGradeRecord().getUnits().get(unitNumber).getExam();
                        modifyStudenSubject(studentSubject);
                    }

                    case 5 -> {
                    }

                    default -> System.out.println("Error: Invalid option try again.");
                }
            } else {
                System.out.println("Error: The selected unit does not exist");
            }
        }
    }

    private static void modifyStudenSubject(Grade studentSubject) {
        int gradenNumber;
        float gradeValue;

        System.out.println(studentSubject);

        System.out.println("What workshop do you need to modify");
        gradenNumber = askOption() - 1;

        System.out.println("What is the new grade?");

        do {
            gradeValue = inputGrade();
        } while (Float.isNaN(gradeValue));

        studentSubject.modify(gradenNumber, gradeValue);
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
