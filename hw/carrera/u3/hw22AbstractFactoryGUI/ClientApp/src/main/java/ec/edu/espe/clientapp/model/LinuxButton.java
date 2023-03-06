package ec.edu.espe.clientapp.model;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class LinuxButton extends Button{

    @Override
    public void paint(JPanel panel) {
        JButton button = new JButton("LinuxButton: " + caption);
        panel.add(button);
    }
    
}
