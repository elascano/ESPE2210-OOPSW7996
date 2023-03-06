package ec.edu.espe.AbstractFactory.model;
/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class LinuxButton extends Button{
    
    @Override
    public void paint(){
        System.out.println("I'm a LinuxButton: "+caption);
    }
}
