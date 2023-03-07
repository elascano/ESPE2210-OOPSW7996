package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public abstract class Button {
    
    public String caption;

    @Override
    public String toString() {
        return "Button{" + "caption=" + caption + '}';
    }

    public abstract void paint();
}
