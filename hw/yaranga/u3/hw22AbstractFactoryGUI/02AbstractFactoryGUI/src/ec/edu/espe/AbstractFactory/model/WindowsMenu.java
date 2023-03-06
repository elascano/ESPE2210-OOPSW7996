package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class WindowsMenu extends Menu {

    public WindowsMenu() {
    }

    @Override
    public String paint() {
        String widget = "I'm a WindowsMenu: "+caption;
        
        return widget;
    }

}
