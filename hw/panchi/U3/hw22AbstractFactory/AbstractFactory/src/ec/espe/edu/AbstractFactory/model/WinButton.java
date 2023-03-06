package ec.espe.edu.AbstractFactory.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class WinButton extends Button{

    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
    
}
