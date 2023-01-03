
package ec.edu.espe.TaxiDriverMaven.model;
import java.time.LocalDate;
/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class TaxiDriver {
    private int id;
    private String driversName;
    private String taxisPlate;
    private String travelsDate;
    private float profits;

    @Override
    public String toString() {
        return "Notebook{" + "Id=>" + getId() + ", driversName=>" + getDriversName() + ", taxisPlate=>" + getTaxisPlate() + ", travelsDate=>" + getTravelsDate() + ", profits=>" + getProfits() + '}';
    }


    public TaxiDriver(){
        id = 0;
        driversName = "";
        taxisPlate = "";    
        travelsDate = "";
        profits= 0.0F;
    }

    /**
     *
     * @param id
     * @param driversName
     * @param taxisPlate
     * @param travelsDate
     * @param profits
     */
    public TaxiDriver(int id, String driversName, String taxisPlate, String travelsDate, float profits) {
        this.id = id;
        this.driversName = driversName;
        this.taxisPlate = taxisPlate;
        this.travelsDate = travelsDate;
        this.profits = profits;
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
     * @return the driversName
     */
    public String getDriversName() {
        return driversName;
    }

    /**
     * @param driversName the driversName to set
     */
    public void setDriversName(String driversName) {
        this.driversName = driversName;
    }

    /**
     * @return the taxisPlate
     */
    public String getTaxisPlate() {
        return taxisPlate;
    }

    /**
     * @param taxisPlate the taxisPlate to set
     */
    public void setTaxisPlate(String taxisPlate) {
        this.taxisPlate = taxisPlate;
    }

    /**
     * @return the profits
     */
    public float getProfits() {
        return profits;
    }

    /**
     * @param profits the profits to set
     */
    public void setProfits(float profits) {
        this.profits = profits;
    }

    /**
     * @param travelsDate the travelsDate to set
     */
    public void setTravelsDate(String travelsDate) {
        this.travelsDate = travelsDate;
    }

    /**
     * @return the travelsDate
     */
    public String getTravelsDate() {
        return travelsDate;
    }
}
