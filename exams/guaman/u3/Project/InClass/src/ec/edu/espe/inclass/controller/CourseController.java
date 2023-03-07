package ec.edu.espe.inclass.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import ec.edu.espe.inclass.model.Course;
import ec.edu.espe.inclass.model.Student;
import java.util.ArrayList;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class CourseController {

    public static String courseToJsonForDB(Course course) {
        if (course == null) {
            return "";
        }

        String json;
        JsonObject rootObject = new JsonObject();

        rootObject.addProperty("name", course.getName());
        rootObject.addProperty("nrc", course.getNrc());

        json = rootObject.toString();

        return json;
    }

    public static ArrayList loadCourses(ArrayList<String> jsons) {
        ArrayList<Course> courses;
        courses = new ArrayList<>();

        for (String json : jsons) {
            courses.add(jsonToCourse(json));
        }

        return courses;
    }

    public static Course jsonToCourse(String json) {
        try {
            Course course;
            Gson gson;
            gson = new Gson();
            course = new Course();

            course = gson.fromJson(json, course.getClass());

            return course;
        } catch (Exception e) {
            return null;
        }

    }

    public static int findCourse(ArrayList<Course> courses, int nrc) {
        int index = -1;
        
        if (courses == null) {
            return -1;
        }

        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getNrc() == nrc) {
                index = i;
                return index;
            }
        }

        return index;
    }

    public static int removeCourse(int courseNumber) {
        DataPersistence dataPersistence;
        StudentController studentController;
        int nrc;

        dataPersistence = DataPersistence.getInstance();
        studentController = new StudentController();
       
        try {
            nrc = dataPersistence.getTeacher().getCourses().get(courseNumber).getNrc();
            dataPersistence.getdBManager().deleteDocument("Courses", "nrc", dataPersistence.getTeacher().getCourses().get(courseNumber).getNrc());

            for (Student student : dataPersistence.getTeacher().getCourses().get(courseNumber).getStudents()) {
                StudentController.removeStudent(student.getEspeId(), nrc);
            }
            System.out.println("The course was remove successfully");
            // This metod cause that send a notofy to observer
            studentController.update(dataPersistence.getTeacher().getCourses().get(courseNumber));
            return 1;
        } catch (Exception e) {
            System.out.println("The course was not remove");
            return 0;
        }
    }

}
