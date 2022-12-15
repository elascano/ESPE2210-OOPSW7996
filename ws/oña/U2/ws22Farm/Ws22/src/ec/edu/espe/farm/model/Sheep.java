
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Sheep extends FarmAnimal{
    private LocalDate lastSheeringDate;

    public Sheep(LocalDate lastSheeringDate, int id, String breed, LocalDate borOn) {
        super(id, breed, borOn);
        this.lastSheeringDate = lastSheeringDate;
    }
    
    
    @Override
    public String toString() {
       String sheep = "";
        sheep ="Sheep{" + getId()+","
                +getBreed()+","+getBorOn()+","+
                "Last Sheering Date="+lastSheeringDate+
                 "}";
        return sheep;
    }
    
}
