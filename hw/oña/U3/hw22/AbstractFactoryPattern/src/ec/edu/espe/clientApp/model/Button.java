
package ec.edu.espe.clientApp.model;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public abstract class Button {
    public String caption;

    public abstract void paint();

    @Override
    public String toString() {
        return "Button{" + "caption=" + caption + '}';
    }
    
    
}
