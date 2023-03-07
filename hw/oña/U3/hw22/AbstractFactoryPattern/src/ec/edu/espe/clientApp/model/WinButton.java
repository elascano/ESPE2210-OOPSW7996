
package ec.edu.espe.clientApp.model;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class WinButton extends Button {
    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}
