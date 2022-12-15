
package ec.edu.espe.farm.model;
import java.time.LocalDate;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Cow extends FarmAnimal{
   private float weight;
   private boolean givesMilk;

    public Cow(float weight, boolean givesMilk, int id, String breed, LocalDate borOn) {
        super(id, breed, borOn);
        this.weight = weight;
        this.givesMilk = givesMilk;
    }
  
    @Override
    public String toString() {
        String cow="";
        cow = "Cow{" + getId()+","
                +getBreed()+","+getBorOn()+
                ","+"weight=" + getWeight() + ","+"Gives Milk="+givesMilk+"}";
        return cow;
    
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the givesMilk
     */
    public boolean isGivesMilk() {
        return givesMilk;
    }

    /**
     * @param givesMilk the givesMilk to set
     */
    public void setGivesMilk(boolean givesMilk) {
        this.givesMilk = givesMilk;
    }
    
    
    
}
