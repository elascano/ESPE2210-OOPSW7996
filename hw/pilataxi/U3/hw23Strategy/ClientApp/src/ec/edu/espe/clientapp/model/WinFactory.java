
package ec.edu.espe.clientapp.model;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class WinFactory extends GUIFactory{
    @Override
    public Button createButton(){
        return new WinButton();
    }
    
    @Override
    public Menu createMenu(){
        return new WinMenu();
    }
}
