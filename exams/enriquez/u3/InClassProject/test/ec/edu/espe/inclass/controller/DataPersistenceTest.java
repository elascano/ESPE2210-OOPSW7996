package ec.edu.espe.inclass.controller;

import ec.edu.espe.inclass.model.Course;
import ec.edu.espe.inclass.model.Student;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class DataPersistenceTest {
    
    public DataPersistenceTest() {
    }
    
    /**
     * Test of connectMongoDB method, of class DataPersistence.
     */
    @Test
    public void testConnectMongoDB() {
        System.out.println("connectMongoDB");
        DataPersistence instance = DataPersistence.getInstance();
        boolean expResult = true;
        boolean result = instance.connectMongoDB();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of updateData method, of class DataPersistence.
     */
    @Test
    public void testUpdateData() {
        System.out.println("updateData");
        DataPersistence instance = DataPersistence.getInstance();
        instance.connectMongoDB();
        boolean expResult = true;
        boolean result = instance.updateData();
        assertEquals(expResult, result);
    }

    /**
     * Test of updateData method, of class DataPersistence.
     */
    @Test
    public void testUpdateDataOffLine() {
        System.out.println("updateData");
        DataPersistence instance = DataPersistence.getInstance();
        boolean expResult = false;
        boolean result = instance.updateData();
        assertEquals(expResult, result);
    }

    /**
     * Test of updateStudentsInDB method, of class DataPersistence.
     */
    @Test
    public void testUpdateStudentsInDBOnline() {
        System.out.println("updateStudentsInDB");      
        Course course = null;        
        DataPersistence instance = DataPersistence.getInstance();    
        instance.connectMongoDB();
        boolean expResult = true;
        boolean result = instance.updateStudentsInDB(course);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of updateStudentsInDB method, of class DataPersistence.
     */
    @Test
    public void testUpdateStudentsCourseEmpty() {
        System.out.println("updateStudentsInDB");      
        Course course = new Course("prueba", 100);
        DataPersistence instance = DataPersistence.getInstance();    
        instance.connectMongoDB();
        boolean expResult = true;
        boolean result = instance.updateStudentsInDB(course);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of updateStudentsInDB method, of class DataPersistence.
     */
    @Test
    public void testUpdateStudentsCourseOneStudentWrong() {
        System.out.println("updateStudentsInDB");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("1236", ""));
        Course course = new Course("prueba", 100);
        course.setStudents(students);
        DataPersistence instance = DataPersistence.getInstance();    
        instance.connectMongoDB();
        boolean expResult = false;
        boolean result = instance.updateStudentsInDB(course);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of updateStudentsInDB method, of class DataPersistence.
     */
    @Test
    public void testUpdateStudentsCourseOneStudentWrong2() {
        System.out.println("updateStudentsInDB");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("", ""));
        Course course = new Course("prueba", 100);
        course.setStudents(students);
        DataPersistence instance = DataPersistence.getInstance();    
        instance.connectMongoDB();
        boolean expResult = false;
        boolean result = instance.updateStudentsInDB(course);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of updateStudentsInDB method, of class DataPersistence.
     */
    @Test
    public void testUpdateStudentsCourseOneStudentWrong3() {
        System.out.println("updateStudentsInDB");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("L00243030", "Stephen"));
        Course course = new Course("prueba", 100);
        course.setStudents(students);
        DataPersistence instance = DataPersistence.getInstance();    
        instance.connectMongoDB();
        boolean expResult = false;
        boolean result = instance.updateStudentsInDB(course);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of updateStudentsInDB method, of class DataPersistence.
     */
    @Test
    public void testUpdateStudentsCourseWrong() {
        System.out.println("updateStudentsInDB");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("L00243030", "Stephen"));
        Course course = new Course("", 100);
        course.setStudents(students);
        DataPersistence instance = DataPersistence.getInstance();    
        instance.connectMongoDB();
        boolean expResult = false;
        boolean result = instance.updateStudentsInDB(course);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of updateStudentsInDB method, of class DataPersistence.
     */
    @Test
    public void testUpdateStudentsCourseWrong2() {
        System.out.println("updateStudentsInDB");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("L00243030", "Stephen"));
        Course course = new Course("prueba", -10);
        course.setStudents(students);
        DataPersistence instance = DataPersistence.getInstance();    
        instance.connectMongoDB();
        boolean expResult = false;
        boolean result = instance.updateStudentsInDB(course);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of updateStudentsInDB method, of class DataPersistence.
     */
    @Test
    public void testUpdateStudentsInDBOffline() {
        System.out.println("updateStudentsInDB");
        Course course = null;
        DataPersistence instance = DataPersistence.getInstance();
        boolean expResult = false;
        boolean result = instance.updateStudentsInDB(course);
        assertEquals(expResult, result);
    }
    
}
