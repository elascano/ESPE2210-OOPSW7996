package ec.edu.espe.chickenfarm.model;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class ReadCSV {

    private BufferedReader reader;
    private String line;
    private String[] parts = null;

    public void readFile(String nameFile) {
        try {
            reader = new BufferedReader(new FileReader(nameFile));
            while ((line = reader.readLine()) != null) {
                parts = line.split(";");
                printLine();
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // In the finally we close the file, to make sure
            // which closes whether all goes well or jumps
            // an exception.
            try {
                if (null != reader) {
                    reader.close();
                    line = null;
                    parts = null;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void printLine() {

        for (int i = 0; i < parts.length; i++) {
            System.out.print(parts[i]);
            if (i < 4) {
                System.out.print(";");
            }
            if (i > 4) {
                System.out.println("\n");
            }
        }

    }
}
