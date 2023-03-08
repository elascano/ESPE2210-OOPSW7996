package ec.edu.espe.AbstractFactoryGUI.model;

/*
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */

public class WinFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return (new WinButton());
    }

}
