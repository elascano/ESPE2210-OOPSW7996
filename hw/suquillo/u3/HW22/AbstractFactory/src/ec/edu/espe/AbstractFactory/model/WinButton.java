package ec.edu.espe.AbstractFactory.model;
/**
 *
 * @author Martín Suquillo,WebMasterTeam,DCCO-ESPE
 */
public class WinButton extends Button{
    @Override
    public void paint(){
        System.out.println("I am a WinButton: "+caption);
    }
}
