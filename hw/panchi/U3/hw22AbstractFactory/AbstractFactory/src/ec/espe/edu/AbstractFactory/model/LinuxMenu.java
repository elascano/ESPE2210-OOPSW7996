package ec.espe.edu.AbstractFactory.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class LinuxMenu extends Menu{

    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
    
}
