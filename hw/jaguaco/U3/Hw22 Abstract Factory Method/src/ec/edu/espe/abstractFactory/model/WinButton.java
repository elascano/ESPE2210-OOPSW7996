package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class WinButton extends Button {

    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}
