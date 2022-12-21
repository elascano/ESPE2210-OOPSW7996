
package ocp;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class Economy implements DrivingMode{
    
    private static final int POWER=300;
    private static final int SUSPENSION_HEIGHT=20;
    
    
    public int getPower(){
          return POWER;
    }
      
    public int getSuspensionHeight(){
          return SUSPENSION_HEIGHT;
    }
    
}
