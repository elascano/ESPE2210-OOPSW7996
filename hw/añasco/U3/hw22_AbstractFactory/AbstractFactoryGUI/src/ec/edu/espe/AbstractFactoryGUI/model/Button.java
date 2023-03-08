package ec.edu.espe.AbstractFactoryGUI.model;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public abstract class Button {
    JButton button;
    
    public void init(JFrame frame){
        
        button = new JButton();
        frame.add(button);
        button.setVisible(true);
        frame.getContentPane().setBackground(new Color(0,0,0));
        
    }   
    
    public abstract void style(JFrame frame);
}
