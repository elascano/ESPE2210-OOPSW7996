package ec.edu.espe.abstractFactory.model;
/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class LinuxMenu extends Menu {

    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
}
