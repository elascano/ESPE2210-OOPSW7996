
package ec.edu.espe.chickenfarm.model;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class WriteCSV {
    
    public void writeFile(Chicken chicken) {
        
        FileWriter file = null;
        PrintWriter print_write;
        
        try {
            file = new FileWriter("./ChickenData.csv", true);
            print_write = new PrintWriter(file);
            print_write.write(chicken.toCSV() + "\n");
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //Again we take advantage of finally to make sure the file is closed.
                if (null != file) {
                    file.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    
    
    
    
}
