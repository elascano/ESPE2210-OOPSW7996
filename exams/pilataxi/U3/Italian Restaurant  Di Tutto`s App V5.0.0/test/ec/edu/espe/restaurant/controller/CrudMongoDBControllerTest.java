package ec.edu.espe.restaurant.controller;

import ec.edu.espe.restaurant.controller.CrudMongoDBController;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class CrudMongoDBControllerTest {
    
    public CrudMongoDBControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createToDatabase method, of class CrudMongoDBController.
     */
    @Test
    public void testCreateToDatabase() {
        System.out.println("createToDatabase");
        Document document = null;
        CrudMongoDBController instance = null;
        instance.createToDatabase(document);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readToDatabase method, of class CrudMongoDBController.
     */
    @Test
    public void testReadToDatabase() {
        System.out.println("readToDatabase");
        String key = "";
        String value = "";
        CrudMongoDBController instance = null;
        Document expResult = null;
        Document result = instance.readToDatabase(key, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of uploadToDatabase method, of class CrudMongoDBController.
     */
    @Test
    public void testUploadToDatabase() {
        System.out.println("uploadToDatabase");
        Document query = null;
        Document upload = null;
        CrudMongoDBController instance = null;
        instance.uploadToDatabase(query, upload);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteToDatabase method, of class CrudMongoDBController.
     */
    @Test
    public void testDeleteToDatabase() {
        System.out.println("deleteToDatabase");
        Document document = null;
        CrudMongoDBController instance = null;
        instance.deleteToDatabase(document);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMongoCollection method, of class CrudMongoDBController.
     */
    @Test
    public void testGetMongoCollection() {
        System.out.println("getMongoCollection");
        CrudMongoDBController instance = null;
        MongoCollection<Document> expResult = null;
        MongoCollection<Document> result = instance.getMongoCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class CrudMongoDBController.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        Document document = null;
        CrudMongoDBController instance = null;
        Document expResult = null;
        Document result = instance.read(document);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
