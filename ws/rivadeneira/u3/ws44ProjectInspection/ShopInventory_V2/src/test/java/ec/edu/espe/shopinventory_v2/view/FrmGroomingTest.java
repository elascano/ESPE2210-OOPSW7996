
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
public class FrmGroomingTest {
    
    public FrmGroomingTest() {
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
     * Test of showData method, of class FrmGrooming.
     */
    @Test
    public void testShowData() {
        System.out.println("showData");
        FrmGrooming instance = new FrmGrooming();
        instance.showData();

    }

    /**
     * Test of lowStock method, of class FrmGrooming.
     */
    @Test
    public void testLowStock() {
        System.out.println("lowStock");
        FrmGrooming instance = new FrmGrooming();
        instance.lowStock();

    }

    /**
     * Test of main method, of class FrmGrooming.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmGrooming.main(args);

    }
    
}
