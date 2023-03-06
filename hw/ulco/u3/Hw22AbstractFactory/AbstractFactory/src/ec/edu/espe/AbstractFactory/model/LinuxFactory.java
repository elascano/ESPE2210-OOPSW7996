
package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class LinuxFactory extends GUIFactory{

    public Button createButton() {
       return(new LinuxButton());
    }

    public Menu createMenu() {
       return(new LinuxMenu());
    }
    
    
}

