package ec.edu.espe.ecomarket.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.ecomarket.model.Customer;
import ec.edu.espe.ecomarket.model.User;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class BasicControllerTest {

    public BasicControllerTest() {
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
     * Test of parseDocumentToClass method, of class BasicController.
     */
    @Test
    public void testParseDocumentToClass() {
        Connection.connectionDataBase();
        Customer customer = new Customer("1720985566", "Harry", 9877554, false, "28-08-2022", "Quito");
        CustomerController customerController = new CustomerController();
        System.out.println("parseJsonToClass");
        Document document = customerController.buildDocument(customer);

        Object expResult = customer;
        Customer customerExpected;
        customerExpected = customerController.parseDocumentToClass(document);
        Object result = customerExpected;
        assertEquals(expResult.toString(), result.toString());

    }

    /**
     * Test of getMongoCollection method, of class BasicController.
     */
    @Test
    public void testGetMongoCollection() {
        Connection.connectionDataBase();
        System.out.println("getMongoCollection");
        UserController userController = new UserController();
        MongoCollection expResult = userController.getMongoCollection();
        MongoCollection result = Connection.connectionDataBase().getCollection("users");
        assertEquals(expResult.getNamespace().getCollectionName(), result.getNamespace().getCollectionName());

    }

    /**
     * Test of create method, of class BasicController.
     */
    @Test
    public void testCreate() {
        Connection.connectionDataBase();
        UserController userController = new UserController();
        User user = new User("Melina", "123");
        System.out.println("create");
        Document document = userController.buildDocument(user);
        userController.create(document);
        Document result = userController.read("Melina", "user");
        assertTrue(result != null);
    }

    /**
     * Test of read method, of class BasicController.
     */
    @Test
    public void testRead_String_String() {
        Connection.connectionDataBase();
        EmployeeController stylistController = new EmployeeController();

        System.out.println("read");
        String id = "1755231683";
        String fieldName = "identificationCard";

        Document expResult = new Document();
        expResult.append("_id", new ObjectId("62da0cca5d5a16610efa0234"))
                .append("identificationCard", "1755231683").append("name", "Mero")
                .append("number", "12")
                .append("payment", 12.0)
                .append("appointment", "13-07-2022")
                .append("address", "asd");
        Document result = stylistController.read(id, fieldName);

        assertEquals(expResult, result);

    }

    /**
     * Test of read method, of class BasicController.
     */
    @Test
    public void testRead_Document() {
        System.out.println("read");
        Connection.connectionDataBase();
        EmployeeController stylistController = new EmployeeController();
        Document document = new Document();
        document.append("_id", new ObjectId("62da0cca5d5a16610efa0234"))
                .append("identificationCard", "1755231683").append("name", "Mero")
                .append("number", "12")
                .append("payment", 12.0)
                .append("appointment", "13-07-2022")
                .append("address", "asd");

        Document expResult = document;
        Document result = stylistController.read(document);
        assertEquals(expResult, result);

    }

    /**
     * Test of delete method, of class BasicController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Connection.connectionDataBase();
        UserController userController = new UserController();

        String id = "user";
        Object idValue = "Melina";

        DeleteResult result = userController.delete(id, idValue);
        assertTrue(result.getDeletedCount() > 0);
        assertFalse(result.getDeletedCount() == 0);

    }

    /**
     * Test of update method, of class BasicController.
     */
    @Test
    public void testUpdate_4args() {
        System.out.println("update");
        Connection.connectionDataBase();
        UserController userController = new UserController();
        String id = "user";
        String idValue = "1";
        String updateKey = "user";
        String valueUpdate = "2";

        userController.update(id, idValue, updateKey, valueUpdate);
        Document result = userController.read(valueUpdate, updateKey);

        assertTrue(result != null);
        assertFalse(result == null);

        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of update method, of class BasicController.
     */
    @Test
    public void testUpdate_Document_Document() {
        System.out.println("update");
        Connection.connectionDataBase();
        UserController userController = new UserController();
        User user = new User("Melina", "123");
        User userUpdate = new User("Harry", "123");
        Document query = userController.buildDocument(user);
        Document upload = userController.buildDocument(userUpdate);
        
        userController.update(query, upload);
        Document result = userController.read(upload);
        assertTrue(result!=null);
        assertFalse(result==null);
        
    }

}
