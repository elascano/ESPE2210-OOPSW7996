package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class LinuxMenu extends Menu {

    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
}
