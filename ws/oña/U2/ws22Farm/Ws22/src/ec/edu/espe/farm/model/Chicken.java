
package ec.edu.espe.farm.model;
import java.time.LocalDate;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Chicken extends FarmAnimal{
    private boolean isMolting;

    public void feed(float amountOfFood) {
         System.out.println("Feeding a Chicken with"+amountOfFood);
    }
    public void feed(float amountOfFood, String typrOfFood){
           System.out.println("Feeding an animal with food-->"+typrOfFood+", amount: "+amountOfFood);
   }
    
    public Chicken(boolean isMolting, int id, String breed, LocalDate borOn) {
        super(id, breed, borOn);
        this.isMolting = isMolting;
    }
//ver las cosas
    @Override
    public String toString() {
        String chicken="";
        chicken = "Chicken{" + getId()+","
                +getBreed()+","+getBorOn()+
                ","+"is Molting=" + isMolting + "}";
        return chicken;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public String feed(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    } 
    
    
