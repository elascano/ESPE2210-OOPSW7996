package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public abstract class Button {

    public String caption;

    public abstract void paint();

    @Override
    public String toString() {
        return "Button{" + "caption=" + caption + '}';
    }
}
