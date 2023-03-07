
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
public class FrmLogInTest {
    
    public FrmLogInTest() {
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
     * Test of enableBottom method, of class FrmLogIn.
     */
    @Test
    public void testEnableBottom() {
        System.out.println("enableBottom");
        FrmLogIn instance = new FrmLogIn();
        instance.enableBottom();

    }

    /**
     * Test of main method, of class FrmLogIn.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmLogIn.main(args);

    }
    
}
