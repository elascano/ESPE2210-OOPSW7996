package ec.esu.espe.abstractFactory.model;
/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class WinButton extends Button{
    
    @Override
    public void paint() {
        System.out.println("Hi, I'm a WinButton: " + caption);
    }
}
