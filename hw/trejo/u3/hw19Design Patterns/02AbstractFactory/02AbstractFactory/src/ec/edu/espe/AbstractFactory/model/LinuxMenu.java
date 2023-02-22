package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class LinuxMenu extends Menu {

    LinuxMenu() {

    }

    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu" + caption);
    }

}
