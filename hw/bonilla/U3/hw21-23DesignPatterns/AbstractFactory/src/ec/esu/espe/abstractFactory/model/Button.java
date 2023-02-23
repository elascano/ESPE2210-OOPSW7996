package ec.esu.espe.abstractFactory.model;
/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public abstract class Button {
    public String caption;

    public abstract void paint();

    @Override
    public String toString() {
        return "Button{" + "caption=" + caption + '}';
    }
}
