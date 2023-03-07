
package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class LinuxFactory extends GUIFactory{

    public Button createButton() {
       return(new LinuxButton());
    }

    public Menu createMenu() {
       return(new LinuxMenu());
    }
    
    
}

