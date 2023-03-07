
package ec.edu.espe.fashionStore.controller;

import com.mongodb.client.MongoDatabase;
import ec.edu.espe.fashionstore.model.ItemCatalogue;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class ControllerItemCatalogueTest {
    
    public ControllerItemCatalogueTest() {
    }

    @Test
    public void testInsertDocumentMongo() {
        System.out.println("insertDocumentMongo");
        MongoDatabase database = null;
        ItemCatalogue itemCatalogue = null;
        ControllerItemCatalogue.insertDocumentMongo(database, itemCatalogue);
        fail("The test case is a prototype.");
    }

    @Test
    public void testReadMongo() {
        System.out.println("readMongo");
        MongoDatabase database = null;
        int id = 0;
        ItemCatalogue expResult = null;
        ItemCatalogue result = ControllerItemCatalogue.readMongo(database, id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testNoRepeatOrder() {
        System.out.println("noRepeatOrder");
        MongoDatabase database = null;
        ItemCatalogue itemCatalogue = null;
        boolean existItemModel = false;
        boolean expResult = false;
        boolean result = ControllerItemCatalogue.noRepeatOrder(database, itemCatalogue, existItemModel);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateMongo() {
        System.out.println("updateMongo");
        MongoDatabase database = null;
        ItemCatalogue itemCatalogue = null;
        ControllerItemCatalogue.updateMongo(database, itemCatalogue);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeleteMongo() {
        System.out.println("deleteMongo");
        MongoDatabase database = null;
        ItemCatalogue itemCatalogue = null;
        ControllerItemCatalogue.deleteMongo(database, itemCatalogue);
        fail("The test case is a prototype.");
    }
    
}
