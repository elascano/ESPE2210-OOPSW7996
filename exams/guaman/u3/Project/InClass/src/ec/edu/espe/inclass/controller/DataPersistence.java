package ec.edu.espe.inclass.controller;

import ec.edu.espe.inclass.model.Course;
import ec.edu.espe.inclass.model.Student;
import ec.edu.espe.inclass.model.Teacher;
import ec.edu.espe.inclass.model.Tutorship;
import java.util.ArrayList;
import utils.DBManager;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class DataPersistence {

    private static DataPersistence instance;
    private Teacher teacher;
    private DBManager dBManager;
    private ArrayList<String> notifies;
    private int position;

    private DataPersistence() {
        notifies = new ArrayList<>();
        position = 0;
    }

    public static DataPersistence getInstance() {
        if (instance == null) {
            instance = new DataPersistence();
        }
        return instance;
    }

    public boolean connectMongoDB() {
        ArrayList<Tutorship> tutorships;
        ArrayList<Course> courses;
        ArrayList<Student> students;
        String name = "";
        String espeId = "";

        try {
            dBManager = new DBManager();
            getdBManager().connect("mongodb+srv://oop22:oop22@cluster0.cd2tjad.mongodb.net/test", "InClassProject");
            teacher = new Teacher(espeId, name);
            teacher = TeacherController.jsonToTeacher((String) getdBManager().readCollection("Teacher").get(0));
            tutorships = TutorshipController.loadTutorships(getdBManager().readCollection("Tutorships"));
            courses = CourseController.loadCourses(getdBManager().readCollection("Courses"));

            for (Course course : courses) {
                students = StudentController.loadStudents(getdBManager().readCollection("Students", "nrc", course.getNrc()));
                course.setStudents(students);
            }

            getTeacher().setTutorships(tutorships);
            getTeacher().setCourses(courses);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean updateData() {
        ArrayList<Tutorship> tutorships;
        ArrayList<Course> courses;
        ArrayList<Student> students;
        String name = "";
        String espeId = "";

        try {
            teacher = new Teacher(espeId, name);
            teacher = TeacherController.jsonToTeacher((String) getdBManager().readCollection("Teacher").get(0));
            tutorships = TutorshipController.loadTutorships(getdBManager().readCollection("Tutorships"));
            courses = CourseController.loadCourses(getdBManager().readCollection("Courses"));

            for (Course course : courses) {
                students = StudentController.loadStudents(getdBManager().readCollection("Students", "nrc", course.getNrc()));
                course.setStudents(students);
            }

            getTeacher().setTutorships(tutorships);
            getTeacher().setCourses(courses);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean updateStudentsInDB(Course course) {
        try {
            for (Student student : course.getStudents()) {
                getdBManager().updateDocument("Students", student.getEspeId(), course.getNrc(),
                        StudentController.studentToJsonForDB(student, course.getNrc()));
            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    /**
     * @return the teacher
     */
    public Teacher getTeacher() {
        return teacher;
    }

    /**
     * @return the dBManager
     */
    public DBManager getdBManager() {
        return dBManager;
    }

    /**
     * @return the position
     */
    public int getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * @return the notifies
     */
    public ArrayList<String> getNotifies() {
        return notifies;
    }

    /**
     * @param notifies the notifies to set
     */
    public void setNotifies(ArrayList<String> notifies) {
        this.notifies = notifies;
    }
    
    

}
