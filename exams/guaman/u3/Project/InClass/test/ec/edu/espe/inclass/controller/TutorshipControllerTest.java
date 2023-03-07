package ec.edu.espe.inclass.controller;

import ec.edu.espe.inclass.model.Tutorship;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.DBManager;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class TutorshipControllerTest {

    public TutorshipControllerTest() {
    }

    /**
     * Test of loadTutorships method, of class TutorshipController.
     */
    @Test
    public void testLoadTutorships() {
        System.out.println("loadTutorships");
        Date date = new Date();
        Tutorship tutorship = new Tutorship(date, "0", "0", "0", "0");
        ArrayList<String> jsons = new ArrayList<>();
        jsons.add(DBManager.toJson(tutorship));
        ArrayList<Tutorship> expResult = new ArrayList<>();
        expResult.add(tutorship);
        ArrayList<Tutorship> result = TutorshipController.loadTutorships(jsons);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of loadTutorships Connected MongoDB method, of class
     * TutorshipController.
     */
    @Test
    public void testLoadTutorshipsConnectedMongoDB() {
        System.out.println("loadTutorships");
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        dataPersistence.connectMongoDB();
        Tutorship tutorship = dataPersistence.getTeacher().getTutorships().get(0);
        ArrayList< String> jsons = new ArrayList<>();
        jsons.add(DBManager.toJson(tutorship));
        ArrayList<Tutorship> expResult = new ArrayList<>();
        expResult.add(tutorship);
        ArrayList<Tutorship> result = TutorshipController.loadTutorships(jsons);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of jsonToTutorship null method, of class TutorshipController.
     */
    @Test
    public void testJsonToTutorshipNull() {
        System.out.println("jsonToTutorship");
        String json = "";
        Tutorship expResult = null;
        Tutorship result = TutorshipController.jsonToTutorship(json);
        assertEquals(expResult, result);
    }

    /**
     * Test of jsonToTutorship method, of class TutorshipController.
     */
    @Test
    public void testJsonToTutorship() {
        System.out.println("jsonToTutorship");
        Date date = new Date();
        Tutorship tutorship = new Tutorship(date, "0", "0", "0", "0");
        String json = DBManager.toJson(tutorship);
        Tutorship expResult = tutorship;
        Tutorship result = TutorshipController.jsonToTutorship(json);
        assertEquals(expResult.toString(), result.toString());
    }
    
    /**
     * Test of jsonToTutorship without using toString method, of class TutorshipController.
     */
    @Test
    public void testJsonToTutorshipNoToString() {
        System.out.println("jsonToTutorship");
        Date date = new Date();
        Tutorship tutorship = new Tutorship(date, "0", "0", "0", "0");
        String json = DBManager.toJson(tutorship);
        Tutorship expResult = tutorship;
        Tutorship result = TutorshipController.jsonToTutorship(json);
        assertEquals(expResult, result);
    }

}
