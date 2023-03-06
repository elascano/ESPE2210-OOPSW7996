package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public abstract class Button {
    public String caption;

    public abstract void paint();

    @Override
    public String toString() {
        return "Button{" + "caption=" + caption + '}';
    }
        
}
