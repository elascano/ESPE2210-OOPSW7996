
package ec.edu.espe.clientapp.model;


/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class WinButton extends Button {
    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
} 