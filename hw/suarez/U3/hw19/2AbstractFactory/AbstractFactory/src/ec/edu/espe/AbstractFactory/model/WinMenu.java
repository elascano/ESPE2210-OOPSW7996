package ec.edu.espe.AbstractFactory.model;
/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class WinMenu extends Menu{
    @Override
    public void paint(){
        System.out.println("I am a WinMenu: "+caption);
    }
}
