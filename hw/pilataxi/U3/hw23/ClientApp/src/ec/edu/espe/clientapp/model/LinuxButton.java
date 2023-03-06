
package ec.edu.espe.clientapp.model;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class LinuxButton extends Button{

    @Override
    public void paint(){
        System.out.println("I'm a LinuxButton: " + caption);
    }
}
