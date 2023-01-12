package ec.edu.espe.inclass.controller;

import ec.edu.espe.inclass.model.Course;
import java.util.ArrayList;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class DBManager {

    public static Course toCourse(Object[] courseList) {
        Course course;

        course = new Course((String) courseList[0], (Integer) courseList[1], (Integer) courseList[2]);

        return course;
    }

    public static ArrayList read(ArrayList<Object> coursesList) {
        ArrayList<Course> courses;
        Object[] courseList;

        courses = new ArrayList<>();

        for (int i = 0; i < coursesList.size(); i++) {
            courseList = (Object[]) coursesList.get(i);
            courses.add(toCourse(courseList));
        }

        return courses;
    }
    
}
