
package ec.edu.espe.abstractfactory;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class LinuxMenu extends Menu{

    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
    
}
