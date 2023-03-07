
package ec.edu.espe.shopinventory_v2.view;

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
public class FrmMeatTest {
    
    public FrmMeatTest() {
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
     * Test of showData method, of class FrmMeat.
     */
    @Test
    public void testShowData() {
        System.out.println("showData");
        FrmMeat instance = new FrmMeat();
        instance.showData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lowStock method, of class FrmMeat.
     */
    @Test
    public void testLowStock() {
        System.out.println("lowStock");
        FrmMeat instance = new FrmMeat();
        instance.lowStock();

    }

    /**
     * Test of main method, of class FrmMeat.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmMeat.main(args);

    }
    
}
