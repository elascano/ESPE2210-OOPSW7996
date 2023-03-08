package ec.edu.espe.AbstractFactoryGUI.model;

import javax.swing.JButton;
/*
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory(JButton button){
        
        if("Windows".equals(button.getText()))
            return(new WinFactory());
        else
            return(new LinuxFactory());
    }
    
    public abstract Button createButton();
}
