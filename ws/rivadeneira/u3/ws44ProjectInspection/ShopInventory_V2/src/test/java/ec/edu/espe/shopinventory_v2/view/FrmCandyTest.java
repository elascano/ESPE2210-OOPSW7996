
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
public class FrmCandyTest {
    
    public FrmCandyTest() {
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
     * Test of showData method, of class FrmCandy.
     */
    @Test
    public void testShowData() {
        System.out.println("showData");
        FrmCandy instance = new FrmCandy();
        instance.showData();

    }

    /**
     * Test of lowStock method, of class FrmCandy.
     */
    @Test
    public void testLowStock() {
        System.out.println("lowStock");
        FrmCandy instance = new FrmCandy();
        instance.lowStock();

    }

    /**
     * Test of main method, of class FrmCandy.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmCandy.main(args);
    }
    
}
