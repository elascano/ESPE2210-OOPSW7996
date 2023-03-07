package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class LinuxMenu extends Menu{
    
    @Override
    public void paint(){
        System.out.println("I'm a LinuxMenu: "+caption);
        
    }
}
