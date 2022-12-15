
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Pig extends FarmAnimal{
    private float actualWeight;

    public Pig(float actualWeight, int id, String breed, LocalDate borOn) {
        super(id, breed, borOn);
        this.actualWeight = actualWeight;
    }

   
    @Override
    public String toString() {
        String pig = "";
        pig ="Pig{" + getId()+","
                +getBreed()+","+getBorOn()+
                ","+"Actual Weight="+actualWeight+
                 "}";
        return pig;
    }

    /**
     * @return the actualWeight
     */
    public float getActualWeight() {
        return actualWeight;
    }

    /**
     * @param actualWeight the actualWeight to set
     */
    public void setActualWeight(float actualWeight) {
        this.actualWeight = actualWeight;
    }

   
    
    
}
