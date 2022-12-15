
package ec.edu.espe.farm.model;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class FarmAnimal {
    private int id;
    private String breed;
    private LocalDate borOn;
    
    public int getAgeInMonths(){
        LocalDate now = LocalDate.now();
        int days=0;
        int years =0;
        years = Period.between(borOn, now).getYears();
        days = Period.between(borOn, now).getDays();
        return years;
    }
    //Accion alimentar
    //public abstract void feed(float amountOfFood);
    public boolean isProducingMilk(){
        return true;
    }
    

    public FarmAnimal(int id, String breed, LocalDate borOn) {
        this.id = id;
        this.breed = breed;
        this.borOn = borOn;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", borOn=" + borOn + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the borOn
     */
    public LocalDate getBorOn() {
        return borOn;
    }

    /**
     * @param borOn the borOn to set
     */
    public void setBorOn(LocalDate borOn) {
        this.borOn = borOn;
    }
    
    
    
  
    
}
