package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
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
