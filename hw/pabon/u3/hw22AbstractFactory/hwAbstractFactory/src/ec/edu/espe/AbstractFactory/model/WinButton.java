package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class WinButton extends Button{
    @Override
    public void paint(){
        
        System.out.println("I'm a WinButton: "+caption);
        
    }
}
