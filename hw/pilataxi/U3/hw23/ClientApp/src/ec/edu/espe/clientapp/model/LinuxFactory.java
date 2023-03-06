
package ec.edu.espe.clientapp.model;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class LinuxFactory extends GUIFactory{
    @Override
    public Button createButton(){
       return new LinuxButton();
    }
    
    @Override
    public Menu createMenu(){
       return new LinuxMenu();
    }
}
