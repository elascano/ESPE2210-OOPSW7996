package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class WinMenu extends Menu{
    
    @Override
    public void paint(){
        System.out.println("I'm a WinMenu: "+ caption);
    }
}
