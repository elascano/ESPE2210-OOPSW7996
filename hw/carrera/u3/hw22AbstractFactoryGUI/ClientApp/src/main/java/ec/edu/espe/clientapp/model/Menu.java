package ec.edu.espe.clientapp.model;

import javax.swing.JPanel;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public abstract class Menu {
    public String caption;
    public abstract void paint(JPanel panel);
}