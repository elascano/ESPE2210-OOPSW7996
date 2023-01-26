package ec.edu.espe.CountrySystem.controller;
import ec.edu.espe.CountrySystem.model.Country;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class CountryController {
    public static void detectWrongStringInput(char c, Frame frame){
        if((c != KeyEvent.VK_BACK_SPACE) && (!(Character.isAlphabetic(c)))&&(c != KeyEvent.VK_SPACE)){
            JOptionPane.showMessageDialog(frame, c + " is not accepted here.","warning imput data",
                    JOptionPane.WARNING_MESSAGE);
        } 
    } 
    
    public static void detectWrongNumberInput(char c, Frame frame){
        if((c != KeyEvent.VK_BACK_SPACE) && !(Character.isDigit(c)) && 
           (c != KeyEvent.VK_SPACE)){
            JOptionPane.showMessageDialog(frame, c + " is not accepted here.",
                    "warning imput data",JOptionPane.WARNING_MESSAGE);
        } 
    } 
    
    public static void loadDatatoTable(JTable table, ArrayList<Country> countries) {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        
        for(Country country : countries){
     
            String countryToBeAdded[] ={country.getName(), 
            Long.toString(country.getPopulation()), country.getCurrentPresident()};
            
            model.addRow(countryToBeAdded);
        }
        
    }
}
