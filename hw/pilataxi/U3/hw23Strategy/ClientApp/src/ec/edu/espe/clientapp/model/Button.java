
package ec.edu.espe.clientapp.model;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public abstract class Button {
    public String caption;
    
    public abstract void paint();  

    @Override
    public String toString() {
        return "Button{" + "caption=" + caption + '}';
    }        
}
