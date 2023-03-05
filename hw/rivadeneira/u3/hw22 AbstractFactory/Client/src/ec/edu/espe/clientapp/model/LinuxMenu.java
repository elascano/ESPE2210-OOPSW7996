
package ec.edu.espe.clientapp.model;


/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class LinuxMenu extends Menu {
    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
}