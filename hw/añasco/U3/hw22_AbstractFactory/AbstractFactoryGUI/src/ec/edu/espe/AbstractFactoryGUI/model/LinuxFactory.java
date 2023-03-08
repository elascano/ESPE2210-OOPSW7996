package ec.edu.espe.AbstractFactoryGUI.model;

import java.awt.Frame;



/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class LinuxFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return (new LinuxButton());
    }

}
