package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Joel Rivera, WebMasterTeam, DCCO-ESPE
 */

public class LinuxMenu extends Menu {

    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
}
