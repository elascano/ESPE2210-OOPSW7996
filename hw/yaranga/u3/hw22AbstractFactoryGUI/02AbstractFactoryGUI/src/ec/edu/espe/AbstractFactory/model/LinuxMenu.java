package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class LinuxMenu extends Menu {

    LinuxMenu() {

    }

    @Override
    public String paint() {
        String widget = "I'm a LinuxMenu: "+caption;
        
        return widget;
    }

}
