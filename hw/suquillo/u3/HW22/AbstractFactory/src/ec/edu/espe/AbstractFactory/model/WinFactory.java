package ec.edu.espe.AbstractFactory.model;
/**
 *
 * @author Martín Suquillo,WebMasterTeam,DCCO-ESPE
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
