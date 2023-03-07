package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author NICOLAY CHILLO, Gaman GeekLords at DCOO-ESPE
 */
public class LinuxButton extends Button{
    
    @Override
    public void paint() {
        System.out.println("Hi, I'm a LinuxButton: " + caption);
    }
}
