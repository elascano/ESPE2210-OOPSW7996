package ec.edu.espe.inclass.controller;

import ec.edu.espe.inclass.model.Teacher;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class TeacherControllerTest {

    public TeacherControllerTest() {
    }

    /**
     * Test of teacherToJsonForDB method, of class TeacherController.
     */
    @Test
    public void testTeacherToJsonForDB() {
        System.out.println("teacherToJsonForDB");
        Teacher teacher = new Teacher("L00242411", "Santiago");
        String expResult = "{\"name\":\"Santiago\",\"espeId\":\"L00242411\"}";
        String result = TeacherController.teacherToJsonForDB(teacher);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of teacherToJsonForDB (empty) method, of class TeacherController.
     */
    @Test
    public void testTeacherToJsonForDBEmpty() {
        System.out.println("teacherToJsonForDB");
        Teacher teacher = new Teacher("0", "0");
        String expResult = "{\"name\":\"0\",\"espeId\":\"0\"}";
        String result = TeacherController.teacherToJsonForDB(teacher);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertJsonToTeacher method, of class TeacherController.
     */
    @Test
    public void testJsonToTeacher() {
        System.out.println("jsonToTeacher");
        String json = "{\"password\":\"0\",\"name\":\"0\",\"espeId\":\"0\"}";
        Teacher expResult = new Teacher("0", "0");
        expResult.setPassword("0");
        Teacher result = TeacherController.convertJsonToTeacher(json);
        assertEquals(expResult, result);
    }

    /**
     * Test of loginTeacher method, of class TeacherController.
     */
    @Test
    public void testLoginTeacher() {
        System.out.println("loginTeacher");
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        dataPersistence.connectMongoDB();
        String espeId = "L00242411";
        String password = "1234";
        int expResult = 1;
        int result = TeacherController.loginTeacher(espeId, password);
        assertEquals(expResult, result);

    }
    
     /**
     * Test of loginTeacher with wrong password method, of class TeacherController.
     */
    @Test
    public void testLoginTeacherWrongPassword() {
        System.out.println("loginTeacher");
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        dataPersistence.connectMongoDB();
        String espeId = "L00242411";
        String password = "12345";
        int expResult = 0;
        int result = TeacherController.loginTeacher(espeId, password);
        assertEquals(expResult, result);

    }
     /**
     * Test of loginTeacher with wrong user method, of class TeacherController.
     */
    @Test
    public void testLoginTeacherWrongUser() {
        System.out.println("loginTeacher");
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        dataPersistence.connectMongoDB();
        String espeId = "L00000000";
        String password = "1234";
        int expResult = 0;
        int result = TeacherController.loginTeacher(espeId, password);
        assertEquals(expResult, result);

    }

}
