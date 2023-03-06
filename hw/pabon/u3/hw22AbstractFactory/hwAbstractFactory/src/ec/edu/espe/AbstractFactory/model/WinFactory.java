package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class WinFactory extends GUIFactory{
    
    @Override
    public  Button createButton(){
        return (new WinButton());
    }
    @Override
    public  Menu createMenu(){
        return (new WinMenu());
    }
    
}
