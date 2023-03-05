package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class LinuxFactory extends GUIFactory{
    
    @Override
    public  Button createButton(){
        return (new LinuxButton());
    }
    @Override
    public  Menu createMenu(){
        return (new LinuxMenu());
    }
    
}
