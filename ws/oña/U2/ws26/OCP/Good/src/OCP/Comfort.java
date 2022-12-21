
package OCP;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Comfort implements DrivingMode{
    
    private static final int POWER=400;
    private static final int SUSPENSION_HEIGHT=20;
    
    
    public int getPower(){
          return POWER;
    }
      
    public int getSuspensionHeight(){
          return SUSPENSION_HEIGHT;
    }
      
}