package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class WinButton extends Button {

    /**
     *
     */
    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}
