package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class LinuxFactory extends GUIFactory {
    
    @Override
    public Button createButton(){
        return (new LinuxButton());
    }    

    @Override
    public Menu createMenu() {
        return (new LinuxMenu());
    }
    
}
