package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class WinMenu extends Menu{
   
    @Override
    public void paint(){
        System.out.println("I'm a WinMenu: " + caption);
    }
}
