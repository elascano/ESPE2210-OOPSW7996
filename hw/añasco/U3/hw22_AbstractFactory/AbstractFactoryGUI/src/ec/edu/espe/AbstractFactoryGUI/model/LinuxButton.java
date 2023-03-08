package ec.edu.espe.AbstractFactoryGUI.model;

import java.awt.Color;
import javax.swing.JFrame;

/*
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class LinuxButton extends Button{

    @Override
    public void style(JFrame frame) {
        frame.setSize(690, 345);
        button.setSize(35, 35);
        button.setBackground(new Color(0,0,0));
        button.setLocation(633, 50);
        button.setBorder(null);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setOpaque(false);
        button.setIcon(new javax.swing.ImageIcon(getClass().
                getResource("/ec/edu/espe/AbstractFactoryGUI/pictures/firefoxIcon.png")));
    }
}
