package ec.edu.espe.AbstractFactory.model;
/**
 *
 * @author Martín Suquillo,WebMasterTeam,DCCO-ESPE
 */
public class LinuxMenu extends Menu{
    
    @Override
    public void paint(){
        System.out.println("I am a LinuxMenu: "+caption);
    }
}
