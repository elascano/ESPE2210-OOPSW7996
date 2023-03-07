package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author NICOLAY CHILLO, Gaman GeekLords at DCOO-ESPE
 */
public abstract class Button {
    public String caption;

    public abstract void paint();

    @Override
    public String toString() {
        return "Button{" + "caption=" + caption + '}';
    }
}
