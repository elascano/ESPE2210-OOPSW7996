package ec.edu.espe.clientapp.model;

import javax.swing.JMenu;
import javax.swing.JPanel;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class WinMenu extends Menu {
    @Override
    public void paint(JPanel panel){
        JMenu menu = new JMenu("Windows Menu: " + caption);
        panel.add(menu);
    }
}
