package ec.edu.espe.inclass.view;

import com.google.gson.Gson;
import ec.edu.espe.inclass.model.AttendanceRecord;
import ec.edu.espe.inclass.model.Course;
import ec.edu.espe.inclass.model.Student;
import ec.edu.espe.inclass.model.Teacher;
import ec.edu.espe.inclass.model.Tutorship;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class InClass {

    static Teacher teacher;

    public static void main(String[] args) {

        teacher = new Teacher();
        teacher.setId("L002424");
        teacher.setName("Santiago Valencia");

        teacher = loadFileJson();

        controlMainMenu();

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
                case 1:
                    controlTeacherMenu();
                    break;

                case 2:
                    controlStudentMenu();
                    break;
                case 3:
                    System.out.println("See you...");
                    break;
                default:
                    System.out.println("Error: Invalid option try again.");
            }

            SaveFileJson(teacher);
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
                case 1:
                    Tutorship tutorship = new Tutorship();
                    tutorship.requestTutorship();
                    try {
                        teacher.getTutorships().add(tutorship);
                    } catch (Exception e) {
                        System.out.println("error could not add tutorship");
                    }
                    System.out.println("A tutorship was requested");
                    break;

                case 2:
                    break;

                default:
                    System.out.println("Error: Invalid option try again.");
            }
        }

    }

    private static void controlTeacherMenu() {
        int option = 0;
        Course course;
        int number;
        int num;

        while (option != 5) {
            System.out.println("-----Teacher Menu-----");
            System.out.println("1. Enter a course");
            System.out.println("2. Add Course");
            System.out.println("3. Remove Course");
            System.out.println("4. Get tutorship record");
            System.out.println("5. Back");

            option = askOption();

            switch (option) {
                case 1:
                    for (int i = 0; i < teacher.getCourses().size(); i++) {
                        System.out.println(i + 1 + ". " + teacher.getCourses().get(i));
                    }

                    System.out.println("Which course do you want to enter?: ");
                    number = askOption() - 1;

                    try {
                        course = teacher.getCourses().get(number);
                        ControlCourseMenu(course);
                    } catch (Exception e) {
                        System.out.println("Error: Course was not find");
                    }
                    break;

                case 2:
                    System.out.println("Function for add Course");
                    teacher.addCourse();
                    System.out.println(teacher.getCourses().get(0));
                    break;

                case 3:
                    System.out.println("Function for remove Course");
                    for (int i = 0; i < teacher.getCourses().size(); i++) {
                        System.out.println(i + 1 + "." + teacher.getCourses().get(i));
                    }
                    System.out.println("Which course do you want to remove?: ");
                    num = askOption() - 1;
                    try {
                        teacher.getCourses().remove(num);
                        System.out.println("The course was remove successfully");
                    } catch (Exception e) {
                        System.out.println("The course was not remove");
                    }
                    break;

                case 4:
                    for (Tutorship tutorship : teacher.getTutorships()) {
                        System.out.println("================================================");
                        System.out.println("- Date: " + tutorship.getDate());
                        System.out.println("- Course Name: " + tutorship.getCourseName());
                        System.out.println("- Student Name: " + tutorship.getName());
                        System.out.println("- Student Id: " + tutorship.getId());
                        System.out.println("- Student Career: " + tutorship.getCareer() + "\n");
                    }

                    System.out.println("Function for tutorship record");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Error: Invalid option try again.");
            }
        }
    }

    private static void ControlCourseMenu(Course course) {
        Student student;
        int option = 0;
        int number;
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
                case 1:
                    for (int i = 0; i < course.getStudents().size(); i++) {
                        System.out.println((i + 1) + ". " + course.getStudents().get(i));
                    }

                    System.out.println("Which course do you want to enter: ");
                    number = askOption() - 1;

                    try {
                        student = course.getStudents().get(number);
                        ControlStudentInfoMenu(student);
                    } catch (Exception e) {
                        System.out.println("Error: Course was not find");
                    }

                    break;

                case 2:
                    System.out.println("Function for enrolled students");
                    for (int i = 0; i < course.getStudents().size(); i++) {
                        System.out.println((i + 1) + ". " + course.getStudents().get(i));
                    }
                    break;

                case 3:
                    System.out.println("Add Grades for all");
                    addGradeForAll(course);
                    break;

                case 4:
                    System.out.println("Function for take Attendance");
                    attendanceRecord.add(course.getStudents());
                    break;

                case 5:
                    System.out.println("Function for add student");
                    course.addStudent();
                    System.out.println(course.getStudents().toString());
                    break;

                case 6:
                    System.out.println("Function for remove student");
                    for (int i = 0; i < course.getStudents().size(); i++) {
                        System.out.println(i + 1 + "." + course.getStudents().get(i));
                    }
                    System.out.println("Which student do you want to remove?: ");
                    number = askOption() - 1;
                    try {
                        course.getStudents().remove(number);
                        System.out.println("The student was remove successfully");
                    } catch (Exception e) {
                        System.out.println("The student was not remove");
                    }
                    break;

                case 7:
                    System.out.println("Function for grade record");
                    for (Student student1 : course.getStudents()) {
                        System.out.println("--------------------------------------------------------------------------------------------------");
                        System.out.println("- " + student1.getName() + ": \n" + student1.getGradeRecord());
                    }
                    break;

                case 8:
                    System.out.println("Function for attendance record");
                    for (Student student1 : course.getStudents()) {
                        System.out.print("- " + student1.getName());
                        System.out.println(": " + student1.getAttendanceRecord());
                    }
                    break;

                case 9:
                    break;

                default:
                    System.out.println("Error: Invalid option try again.");
            }
        }
    }

    private static void addGradeForAll(Course course) {
        int option;
        int number;
        float gradeValue;

        System.out.println("What unit do you need to enter? (1, 2 or 3)");
        number = askOption() - 1;
        if (number >= 0 && number < 3) {
            System.out.println("What grade do you want to enter?");
            System.out.println("1. Workshop");
            System.out.println("2. Homework");
            System.out.println("3. Test");
            System.out.println("4. Exam");
            option = askOption();

            switch (option) {
                case 1:
                    for (Student student1 : course.getStudents()) {
                        System.out.print("- " + student1.getName() + " Grade: ");
                        gradeValue = inputGrade();
                        student1.getGradeRecord().getUnits().get(number).getWorkshops().add(gradeValue);
                    }
                    break;

                case 2:
                    for (Student student1 : course.getStudents()) {
                        System.out.print("- " + student1.getName() + " Grade: ");
                        gradeValue = inputGrade();
                        student1.getGradeRecord().getUnits().get(number).getHomeworks().add(gradeValue);
                    }
                    break;
                case 3:
                    for (Student student1 : course.getStudents()) {
                        System.out.print("- " + student1.getName() + " Grade: ");
                        gradeValue = inputGrade();
                        student1.getGradeRecord().getUnits().get(number).getTests().add(gradeValue);
                    }
                    break;
                case 4:
                    for (Student student1 : course.getStudents()) {
                        System.out.print("- " + student1.getName() + " Grade: ");
                        gradeValue = inputGrade();
                        student1.getGradeRecord().getUnits().get(number).getExam().add(gradeValue);
                    }
                    break;
                default:
                    System.out.println("Error: Invalid option");
            }

        } else {
            System.out.println("Error: number out of Bounds");
        }
    }

    private static float inputGrade() {
        Scanner scan = new Scanner(System.in);
        float gradeValue;
        try {
            gradeValue = scan.nextFloat();
            return gradeValue;
        } catch (Exception e) {
            System.out.println("Error: invalid number, use comma (,)");
        }

        return Float.NaN;
    }

    private static void ControlStudentInfoMenu(Student student) {
        int number;
        int unitNumber;
        float gradeValue;
        int option = 0;
        while (option != 5) {

            System.out.println(student);
            System.out.println("-----Control student information Menu-----");
            System.out.println("1. Modify workshop grade");
            System.out.println("2. Modify homework grade");
            System.out.println("3. Modify tests grade");
            System.out.println("4. Modify exam grade");
            System.out.println("5. Back");

            option = askOption();

            try {
                switch (option) {
                    case 1:
                        System.out.println("Function for Modify workshop grade");

                        System.out.println("What unit do you need to modify? (1, 2 or 3)");
                        unitNumber = askOption() - 1;
                        if (unitNumber >= 0 && unitNumber < 3) {
                            System.out.println(student.getGradeRecord().getUnits().get(unitNumber).getWorkshops());
                            System.out.println("What workshop do you need to modify");
                            number = askOption() - 1;
                            System.out.println("What is the new grade");
                            gradeValue = inputGrade();
                            student.getGradeRecord().getUnits().get(unitNumber).getWorkshops().modify(number, gradeValue);
                        }
                        break;

                    case 2:
                        System.out.println("Function for Modify homework grade");
                        System.out.println("What unit do you need to modify? (1, 2 or 3)");
                        unitNumber = askOption() - 1;
                        if (unitNumber >= 0 && unitNumber < 3) {
                            System.out.println(student.getGradeRecord().getUnits().get(unitNumber).getHomeworks());
                            System.out.println("What homework do you need to modify");
                            number = askOption() - 1;
                            System.out.println("What is the new grade");
                            gradeValue = inputGrade();
                            student.getGradeRecord().getUnits().get(unitNumber).getHomeworks().modify(number, gradeValue);
                        }
                        break;

                    case 3:
                        System.out.println("Function for Modify test grade");
                        System.out.println("What unit do you need to modify? (1, 2 or 3)");
                        unitNumber = askOption() - 1;
                        if (unitNumber >= 0 && unitNumber < 3) {
                            System.out.println(student.getGradeRecord().getUnits().get(unitNumber).getTests());
                            System.out.println("What test do you need to modify");
                            number = askOption() - 1;
                            System.out.println("What is the new grade");
                            gradeValue = inputGrade();
                            student.getGradeRecord().getUnits().get(unitNumber).getTests().modify(number, gradeValue);
                        }
                        break;

                    case 4:
                        System.out.println("Function for Modify exam grade");
                        System.out.println("What unit do you need to modify? (1, 2 or 3)");
                        unitNumber = askOption() - 1;
                        if (unitNumber >= 0 && unitNumber < 3) {
                            System.out.println(student.getGradeRecord().getUnits().get(unitNumber).getExam());
                            System.out.println("What exam do you need to modify");
                            number = askOption() - 1;
                            System.out.println("What is the new grade");
                            gradeValue = inputGrade();
                            student.getGradeRecord().getUnits().get(unitNumber).getExam().modify(number, gradeValue);
                        }
                        break;

                    case 5:
                        break;

                    default:
                        System.out.println("Error: Invalid option try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: invalid Date or option, please use comma(,) for float");
            }

        }

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

    private static Teacher loadFileJson() {
        Gson gson = new Gson();

        Teacher newTeacher = new Teacher();
        String jsonFile = "";

        try ( Scanner scFile = new Scanner(new File("./InClass.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            newTeacher = gson.fromJson(jsonFile, Teacher.class);

            System.out.println("----------File was loaded----------");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return newTeacher;
    }

    private static void SaveFileJson(Teacher teacherInfo) {
        Gson gson = new Gson();
        String json = gson.toJson(teacherInfo);

        File file = new File("./InClass.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("----------File was saved----------");
        } catch (Exception e) {
            System.out.println("Error: File not open or found");
        }
    }

}
