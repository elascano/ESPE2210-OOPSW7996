package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class WinMenu extends Menu{
    
    @Override
    public void paint(){
        System.out.println("I'm a WinMenu: "+ caption);
    }
}
