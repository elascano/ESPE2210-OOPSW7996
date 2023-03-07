
package ec.edu.espe.fashionStore.controller;

import com.mongodb.client.MongoDatabase;
import ec.edu.espe.fashionstore.model.ClothCatalogue;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class ControllerClothCatalogueTest {
    
    public ControllerClothCatalogueTest() {
    }

    @Test
    public void testInsertDocumentMongo() {
        System.out.println("insertDocumentMongo");
        MongoDatabase database = null;
        ClothCatalogue clothCatalogue = null;
        ControllerClothCatalogue.insertDocumentMongo(database, clothCatalogue);
        fail("The test case is a prototype.");
    }

    @Test
    public void testReadMongo() {
        System.out.println("readMongo");
        MongoDatabase database = null;
        int id = 0;
        ClothCatalogue expResult = null;
        ClothCatalogue result = ControllerClothCatalogue.readMongo(database, id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testNoRepeatOrder() {
        System.out.println("noRepeatOrder");
        MongoDatabase database = null;
        ClothCatalogue clothCatalogue = null;
        boolean existClothModel = false;
        boolean expResult = false;
        boolean result = ControllerClothCatalogue.noRepeatOrder(database, clothCatalogue, existClothModel);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateMongo() {
        System.out.println("updateMongo");
        MongoDatabase database = null;
        ClothCatalogue clothCatalogue = null;
        ControllerClothCatalogue.updateMongo(database, clothCatalogue);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeleteMongo() {
        System.out.println("deleteMongo");
        MongoDatabase database = null;
        ClothCatalogue clothCatalogue = null;
        ControllerClothCatalogue.deleteMongo(database, clothCatalogue);
        fail("The test case is a prototype.");
    }
    
}
