package ec.edu.espe.inclass.controller;

import ec.edu.espe.inclass.model.Grade;
import ec.edu.espe.inclass.model.Student;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class StudentControllerTest {

    public StudentControllerTest() {
    }

    /**
     * Test of convertStudentToJsonForDB method, of class StudentController.
     */
    @Test
    public void testStudentToJsonForDB() {
        System.out.println("studentToJsonForDB");
        Student student = new Student("L00121233", "dan");
        int courseNrc = 0;
        String expResult = "{\"attendanceRecord\":{\"Attendance\":[false],\"totalClassNumber\":1},\"gradeRecord\":{\"units\":[{\"workshops\":{\"gradeValues\":[],\"totalGradePercent\":0.2},\"homeworks\":{\"gradeValues\":[],\"totalGradePercent\":0.2},\"tests\":{\"gradeValues\":[],\"totalGradePercent\":0.25},\"exam\":{\"gradeValues\":[],\"totalGradePercent\":0.35}},{\"workshops\":{\"gradeValues\":[],\"totalGradePercent\":0.2},\"homeworks\":{\"gradeValues\":[],\"totalGradePercent\":0.2},\"tests\":{\"gradeValues\":[],\"totalGradePercent\":0.25},\"exam\":{\"gradeValues\":[],\"totalGradePercent\":0.35}},{\"workshops\":{\"gradeValues\":[],\"totalGradePercent\":0.2},\"homeworks\":{\"gradeValues\":[],\"totalGradePercent\":0.2},\"tests\":{\"gradeValues\":[],\"totalGradePercent\":0.25},\"exam\":{\"gradeValues\":[],\"totalGradePercent\":0.35}}]},\"name\":\"dan\",\"espeId\":\"L00121233\",\"nrc\":0}";
        String result = StudentController.convertStudentToJsonForDB(student, courseNrc);
        assertEquals(expResult, result);
    }

    /**
     * Test of loadStudents method, of class StudentController.
     */
    @Test
    public void testLoadStudents() {
        System.out.println("loadStudents");
        ArrayList<String> jsons = new ArrayList<>();
        ArrayList expResult = null;
        ArrayList result = StudentController.loadStudents(jsons);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertJsonToStudent method, of class StudentController.
     */
    @Test
    public void testJsonToStudent() {
        System.out.println("jsonToStudent");
        String json = "";
        Student expResult = null;
        Student result = StudentController.convertJsonToStudent(json);
        assertEquals(expResult, result);
    }

    /**
     * Test of findStudent method, of class StudentController.
     */
    @Test
    public void testFindStudent() {
        System.out.println("findStudent");
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        dataPersistence.connectMongoDB();
        ArrayList<Student> students = dataPersistence.getTeacher().getCourses().get(0).getStudents();
        String id = "L00141414";
        int expResult = 0;
        int result = StudentController.findStudent(students, id);
        assertEquals(expResult, result);
    }

    /**
     * Test of findStudent not exist method, of class StudentController.
     */
    @Test
    public void testFindStudentNotExist() {
        System.out.println("findStudent");
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        dataPersistence.connectMongoDB();
        ArrayList<Student> students = dataPersistence.getTeacher().getCourses().get(0).getStudents();
        String id = "L00202020";
        int expResult = -1;
        int result = StudentController.findStudent(students, id);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateAssistancePersetn method, of class StudentController.
     */
    @Test
    public void testCalculateAssistancePersetn() {
        System.out.println("calculateAssistancePersetn");
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        dataPersistence.connectMongoDB();
        Student student = dataPersistence.getTeacher().getCourses().get(0).getStudents().get(0);
        float expResult = 72.0F;
        float result = StudentController.calculateAssistancePersetn(student);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getGradesUnit method, of class StudentController.
     */
    @Test
    public void testGetGradesUnit() {
        System.out.println("getGradesUnit");
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        dataPersistence.connectMongoDB();
        Student student = dataPersistence.getTeacher().getCourses().get(0).getStudents().get(0);
        ArrayList<Float> expResult = new ArrayList<Float>();
        expResult.add(14.5F);
        expResult.add(20.0F);
        expResult.add(20.0F);
        expResult.add(18.166666F);
        ArrayList<Float> result = StudentController.getGradesUnit(student);
        assertEquals(expResult, result);
    }

    /**
     * Test of verifyAttendancePesent method, of class StudentController.
     */
    @Test
    public void testVerifyAttendancePesent() {
        System.out.println("verifyAttendancePesent");
        float assistancePersent = 0.0F;
        boolean expResult = false;
        boolean result = StudentController.verifyAttendancePesent(assistancePersent);
        assertEquals(expResult, result);
    }

    /**
     * Test of getGrades method, of class StudentController.
     */
    @Test
    public void testGetGrades() {
        System.out.println("getGrades");
        int gradeType = 0;
        int unit = 1;
        ArrayList<Grade> expResult = new ArrayList<Grade>();
        ArrayList<Grade> result = StudentController.getGrades(gradeType, unit);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeStudent method, of class StudentController.
     */
    @Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        dataPersistence.connectMongoDB();
        String espeId = "";
        int nrc = 0;
        int expResult = 1;
        int result = StudentController.removeStudent(espeId, nrc);
        assertEquals(expResult, result);

    }

}
