package ec.edu.espe.AbstractFactory.view;

import ec.edu.espe.AbstractFactory.model.Button;
import ec.edu.espe.AbstractFactory.model.GUIFactory;
/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class ClientOperatingSystem {

    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Activate";
        aButton.paint();
    }
    
}
