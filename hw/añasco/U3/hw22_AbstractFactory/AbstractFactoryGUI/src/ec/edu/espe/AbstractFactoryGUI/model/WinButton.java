package ec.edu.espe.AbstractFactoryGUI.model;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class WinButton extends Button{

    @Override
    public void style(JFrame frame) {
        frame.setSize(643, 390);
        button.setSize(28, 28);
        button.setBackground(new Color(0,0,0));
        button.setLocation(8, 315);
        button.setBorder(null);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setIcon(new javax.swing.ImageIcon(getClass()
                .getResource("/ec/edu/espe/AbstractFactoryGUI/pictures/windowsMiniIcon.png")));
    }
     
}
