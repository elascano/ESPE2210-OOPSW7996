package ec.edu.espe.AbstractFactory.model;
/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class WinButton extends Button{
    @Override
    public void paint(){
        System.out.println("I'm a WinButton: "+caption);
    }
}
