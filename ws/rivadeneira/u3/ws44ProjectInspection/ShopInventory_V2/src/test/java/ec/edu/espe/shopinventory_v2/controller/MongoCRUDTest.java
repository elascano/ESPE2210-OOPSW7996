
package ec.edu.espe.shopinventory_v2.controller;

import ec.edu.espe.shopinventory_v2.model.Product;
import ec.edu.espe.shopinventory_v2.model.ProductWithVAT;
import org.bson.Document;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class MongoCRUDTest {
    
    public MongoCRUDTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addToMongo method, of class MongoCRUD.
     */
    @Test
    public void testAddToMongo() {
        System.out.println("addToMongo");
        Document product = null;
        String collection = "";
        MongoCRUD.addToMongo(product, collection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readMongo method, of class MongoCRUD.
     */
    @Test
    public void testReadMongo() {
        System.out.println("readMongo");
        int id = 0;
        String collection = "";
        MongoCRUD.readMongo(id, collection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMongo method, of class MongoCRUD.
     */
    @Test
    public void testUpdateMongo() {
        System.out.println("updateMongo");
        int id = 0;
        String collection = "";
        Product product = null;
        MongoCRUD.updateMongo(id, collection, product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMongoVAT method, of class MongoCRUD.
     */
    @Test
    public void testUpdateMongoVAT() {
        System.out.println("updateMongoVAT");
        int id = 0;
        String collection = "";
        ProductWithVAT product = null;
        MongoCRUD.updateMongoVAT(id, collection, product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMongo method, of class MongoCRUD.
     */
    @Test
    public void testDeleteMongo() {
        System.out.println("deleteMongo");
        int id = 0;
        String collection = "";
        MongoCRUD.deleteMongo(id, collection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
