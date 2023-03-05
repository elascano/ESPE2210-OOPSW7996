package ec.edu.espe.clientapp.model;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class WinButton extends Button {

    @Override
    public void paint(JPanel panel) {
        JButton button = new JButton("WinButton: " + caption);
        panel.add(button);
    }
    
}
