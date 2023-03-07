
package ec.edu.espe.clientapp.model;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class WinButton extends Button{
    @Override
    public void paint(){
        System.out.println("I'm a WinButton: " + caption);
    }
}
