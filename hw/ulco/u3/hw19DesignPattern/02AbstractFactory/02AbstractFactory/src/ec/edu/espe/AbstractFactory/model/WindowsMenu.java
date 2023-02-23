package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class WindowsMenu extends Menu {

    public WindowsMenu() {
    }

    @Override
    public void paint() {
        System.out.println("I'm a WindowsMenu:" + caption);
    }

}
