package ec.edu.espe.AbstractFactory.model;
/**
 *
 * @author Martín Suquillo,WebMasterTeam,DCCO-ESPE
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
