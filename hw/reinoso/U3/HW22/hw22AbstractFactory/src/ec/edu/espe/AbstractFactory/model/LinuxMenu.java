package ec.edu.espe.AbstractFactory.model;
/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class LinuxMenu extends Menu{
    
    @Override
    public void paint(){
        System.out.println("I'm a LinuxMenu: "+caption);
    }
}
