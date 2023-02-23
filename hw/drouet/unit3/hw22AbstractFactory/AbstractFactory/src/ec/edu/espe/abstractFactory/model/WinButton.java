package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class WinButton extends Button {

    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}
