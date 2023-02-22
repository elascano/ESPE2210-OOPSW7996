package ec.edu.espe.clientapp.model;

import javax.swing.JMenu;
import javax.swing.JPanel;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class LinuxMenu extends Menu{
    @Override
    public void paint(JPanel panel){
        JMenu menu = new JMenu("Linux Menu: " + caption);
        panel.add(menu);
    }
}
