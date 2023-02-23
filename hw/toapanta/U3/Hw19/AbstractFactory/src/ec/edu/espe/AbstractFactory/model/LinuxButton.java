package ec.edu.espe.AbstractFactory.model;
/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class LinuxButton extends Button{
    
    @Override
    public void paint(){
        System.out.println("I am a LinuxButton: "+caption);
    }
}
