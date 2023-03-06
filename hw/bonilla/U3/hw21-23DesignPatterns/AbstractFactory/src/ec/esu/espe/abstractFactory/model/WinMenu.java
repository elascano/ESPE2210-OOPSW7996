package ec.esu.espe.abstractFactory.model;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class WinMenu extends Menu{
    
    @Override
    public void paint(){
        System.out.println("Hi, I'm a WinMenu: "+ caption);
    }
}
