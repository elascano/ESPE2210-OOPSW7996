
package ec.edu.espe.abstractfactory;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class LinuxButton extends Button{
    
    @Override
    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
    
}
