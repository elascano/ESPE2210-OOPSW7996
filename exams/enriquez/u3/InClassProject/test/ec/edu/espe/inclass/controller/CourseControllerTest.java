package ec.edu.espe.inclass.controller;

import ec.edu.espe.inclass.model.Course;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class CourseControllerTest {

    public CourseControllerTest() {
    }

    /**
     * Test of convertCourseToJsonForDB method, of class CourseController.
     */
    @Test
    public void testCourseToJsonForDB() {
        System.out.println("courseToJsonForDB");
        Course course = null;
        String expResult = "";
        String result = CourseController.convertCourseToJsonForDB(course);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertCourseToJsonForDB method, of class CourseController.
     */
    @Test
    public void testCourseToJsonForDBCourseWrong1() {
        System.out.println("courseToJsonForDB");
        Course course = new Course("prueba", -10);
        String expResult = "";
        String result = CourseController.convertCourseToJsonForDB(course);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertCourseToJsonForDB method, of class CourseController.
     */
    @Test
    public void testCourseToJsonForDBCourseWrong2() {
        System.out.println("courseToJsonForDB");
        Course course = new Course("", -10);
        String expResult = "";
        String result = CourseController.convertCourseToJsonForDB(course);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertCourseToJsonForDB method, of class CourseController.
     */
    @Test
    public void testCourseToJsonForDBCourseWrong3() {
        System.out.println("courseToJsonForDB");
        Course course = new Course("", 1054);
        String expResult = "";
        String result = CourseController.convertCourseToJsonForDB(course);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertCourseToJsonForDB method, of class CourseController.
     */
    @Test
    public void testCourseToJsonForDBCourseWrong4() {
        System.out.println("courseToJsonForDB");
        Course course = new Course("", 1054464698);
        String expResult = "";
        String result = CourseController.convertCourseToJsonForDB(course);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertCourseToJsonForDB method, of class CourseController.
     */
    @Test
    public void testCourseToJsonForDBCourseWrong5() {
        System.out.println("courseToJsonForDB");
        Course course = new Course("this is a text to long, with this can test de function and the name of the course validation", 125);
        String expResult = "";
        String result = CourseController.convertCourseToJsonForDB(course);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertCourseToJsonForDB method, of class CourseController.
     */
    @Test
    public void testCourseToJsonForDBCourseWrong6() {
        System.out.println("courseToJsonForDB");
        Course course = new Course("this is a text to long, with this can test de function and the name of the course validation", 1253563345);
        String expResult = "";
        String result = CourseController.convertCourseToJsonForDB(course);
        assertEquals(expResult, result);
    }

    /**
     * Test of loadCourses method, of class CourseController.
     */
    @Test
    public void testLoadCourses() {
        System.out.println("loadCourses");
        ArrayList<String> jsons = null;
        ArrayList expResult = null;
        ArrayList result = CourseController.loadCourses(jsons);
        assertEquals(expResult, result);
    }

    /**
     * Test of loadCourses method, of class CourseController.
     */
    @Test
    public void testLoadCoursesJsonEmpty() {
        System.out.println("loadCourses");
        ArrayList<String> jsons = new ArrayList<>();
        jsons.add("");
        ArrayList expResult = null;
        ArrayList result = CourseController.loadCourses(jsons);
        assertEquals(expResult, result);
    }

    /**
     * Test of loadCourses method, of class CourseController.
     */
    @Test
    public void testLoadCoursesJsonEmpty2() {
        System.out.println("loadCourses");
        ArrayList<String> jsons = new ArrayList<>();
        jsons.add("");
        jsons.add("");
        ArrayList expResult = null;
        ArrayList result = CourseController.loadCourses(jsons);
        assertEquals(expResult, result);
    }

    /**
     * Test of loadCourses method, of class CourseController.
     */
    @Test
    public void testLoadCoursesJsonWrong() {
        System.out.println("loadCourses");
        ArrayList<String> jsons = new ArrayList<>();
        jsons.add("this is no json");
        ArrayList expResult = null;
        ArrayList result = CourseController.loadCourses(jsons);
        assertEquals(expResult, result);
    }

    /**
     * Test of loadCourses method, of class CourseController.
     */
    @Test
    public void testLoadCoursesJsonWrong2() {
        System.out.println("loadCourses");
        ArrayList<String> jsons = new ArrayList<>();
        jsons.add("{\"name\": math}");
        ArrayList expResult = null;
        ArrayList result = CourseController.loadCourses(jsons);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertJsonToCourse method, of class CourseController.
     */
    @Test
    public void testJsonToCourse() {
        System.out.println("jsonToCourse");
        String json = null;
        Course expResult = null;
        Course result = CourseController.convertJsonToCourse(json);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertJsonToCourse method, of class CourseController.
     */
    @Test
    public void testJsonToCourseJsonEmpty() {
        System.out.println("jsonToCourse");
        String json = "";
        Course expResult = null;
        Course result = CourseController.convertJsonToCourse(json);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertJsonToCourse method, of class CourseController.
     */
    @Test
    public void testJsonToCourseJsonWrong() {
        System.out.println("jsonToCourse");
        String json = "this is no json";
        Course expResult = null;
        Course result = CourseController.convertJsonToCourse(json);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertJsonToCourse method, of class CourseController.
     */
    @Test
    public void testJsonToCourseJsonWrong2() {
        System.out.println("jsonToCourse");
        String json = "{\"name\": math}";
        Course expResult = null;
        Course result = CourseController.convertJsonToCourse(json);
        assertEquals(expResult, result);
    }

    /**
     * Test of findCourse method, of class CourseController.
     */
    @Test
    public void testFindCourseNull() {
        System.out.println("findCourse");
        ArrayList<Course> courses = null;
        int nrc = 0;
        int expResult = -1;
        int result = CourseController.findCourse(courses, nrc);
        assertEquals(expResult, result);
    }

    /**
     * Test of findCourse method, of class CourseController.
     */
    @Test
    public void testFindCourseWrong1() {
        System.out.println("findCourse");
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("test", -5));
        courses.add(new Course("test", -7));
        courses.add(new Course("test", -9));
        int nrc = -7;
        int expResult = -1;
        int result = CourseController.findCourse(courses, nrc);
        assertEquals(expResult, result);
    }

    /**
     * Test of findCourse method, of class CourseController.
     */
    @Test
    public void testFindCourseWrong2() {
        System.out.println("findCourse");
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("", 5));
        courses.add(new Course("", 7));
        courses.add(new Course("", 9));
        int nrc = 7;
        int expResult = -1;
        int result = CourseController.findCourse(courses, nrc);
        assertEquals(expResult, result);
    }

    /**
     * Test of findCourse method, of class CourseController.
     */
    @Test
    public void testFindSomeCourseWrong() {
        System.out.println("findCourse");
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Math", 5));
        courses.add(new Course("History", -7));
        courses.add(new Course("OOP", 9));
        int nrc = 9;
        int expResult = -1;
        int result = CourseController.findCourse(courses, nrc);
        assertEquals(expResult, result);
    }

    /**
     * Test of findCourse method, of class CourseController.
     */
    @Test
    public void testFindSomeCourseWrong2() {
        System.out.println("findCourse");
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Math", 5));
        courses.add(new Course("", 7));
        courses.add(new Course("OOP", 9));
        int nrc = 9;
        int expResult = -1;
        int result = CourseController.findCourse(courses, nrc);
        assertEquals(expResult, result);
    }

    /**
     * Test of findCourse method, of class CourseController.
     */
    @Test
    public void testFindCourseNrcWrong() {
        System.out.println("findCourse");
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Math", 5));
        courses.add(new Course("History", 7));
        courses.add(new Course("OOP", 9));
        int nrc = -9;
        int expResult = -1;
        int result = CourseController.findCourse(courses, nrc);
        assertEquals(expResult, result);
    }

    /**
     * Test of findCourse method, of class CourseController.
     */
    @Test
    public void testFindSomeCourseOK() {
        System.out.println("findCourse");
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Math", 5));
        courses.add(new Course("History", 7));
        courses.add(new Course("OOP", 9));
        int nrc = 9;
        int expResult = 2;
        int result = CourseController.findCourse(courses, nrc);
        assertEquals(expResult, result);
    }

    /**
     * Test of findCourse method, of class CourseController.
     */
    @Test
    public void testFindCourseNrc() {
        System.out.println("findCourse");
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("C1", 4123));
        courses.add(new Course("C2", 1496));
        courses.add(new Course("C3", 1218));
        courses.add(new Course("C4", 8898));
        int nrc = 1496;
        int expResult = 1;
        int result = CourseController.findCourse(courses, nrc);
        assertEquals(expResult, result);
    }

    /**
     * Test of findCourse method, of class CourseController.
     */
    @Test
    public void testFindCourseNoNrc() {
        System.out.println("findCourse");
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("1", 4123));
        courses.add(new Course("2", 1496));
        courses.add(new Course("3", 1218));
        courses.add(new Course("4", 8898));
        int nrc = -8498;
        int expResult = -1;
        int result = CourseController.findCourse(courses, nrc);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeCourse method, of class CourseController.
     */
    @Test
    public void testRemoveCourseNoConnectionWrongData() {
        System.out.println("removeCourse");
        int courseNumber = -20;
        int expResult = 0;
        int result = CourseController.removeCourse(courseNumber);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeCourse method, of class CourseController.
     */
    @Test
    public void testRemoveCourseNoConnectionOKData() {
        System.out.println("removeCourse");
        int courseNumber = 20;
        int expResult = 0;
        int result = CourseController.removeCourse(courseNumber);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeCourse method, of class CourseController.
     */
    @Test
    public void testRemoveCourseMongoConnectionWrongData() {
        System.out.println("removeCourse");
        DataPersistence dataPersistence = DataPersistence.getInstance();
        dataPersistence.connectMongoDB();
        dataPersistence.updateData();
        int courseNumber = -20;
        int expResult = 0;
        int result = CourseController.removeCourse(courseNumber);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeCourse method, of class CourseController.
     */
    @Test
    public void testRemoveCourseMongoConnectionWrongData2() {
        System.out.println("removeCourse");
        DataPersistence dataPersistence = DataPersistence.getInstance();
        dataPersistence.connectMongoDB();
        dataPersistence.updateData();
        int courseNumber = 498489415;
        int expResult = 0;
        int result = CourseController.removeCourse(courseNumber);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeCourse method, of class CourseController.
     */
    @Test
    public void testRemoveCourseMongoConnectionOKData() {
        System.out.println("removeCourse");
        DataPersistence dataPersistence = DataPersistence.getInstance();
        dataPersistence.connectMongoDB();
        dataPersistence.updateData();
        int courseNumber = 20;
        int expResult = 0;
        int result = CourseController.removeCourse(courseNumber);
        assertEquals(expResult, result);
    }

}
