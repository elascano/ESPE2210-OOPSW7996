package ec.esu.espe.abstractFactory.model;
/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class LinuxMenu extends Menu{
    
    @Override
    public void paint() {
        System.out.println("Hi, I'm a LinuxMenu: " + caption);
    }
}
