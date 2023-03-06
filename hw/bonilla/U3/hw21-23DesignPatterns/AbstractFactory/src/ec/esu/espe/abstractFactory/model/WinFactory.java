package ec.esu.espe.abstractFactory.model;
/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class WinFactory extends GUIFactory{
    
    @Override
    public Button createButton() {
        return (new WinButton());
    }

    @Override
    public Menu createMenu() {
        return (new WinMenu());
    }
}
