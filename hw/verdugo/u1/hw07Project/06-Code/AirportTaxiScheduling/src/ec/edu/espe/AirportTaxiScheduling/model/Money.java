
package ec.edu.espe.AirportTaxiScheduling.model;

/**
 *
 * @author ProgressTeam,DCCO-ESPE
 */
public class Money {

    private String name;
    private String adress;
    private int value;

    public Money(String name, String adress, int value) {
        this.name = name;
        this.adress = adress;
        this.value = value;
    }
     
    public Money() {
        this.name = "";
        this.adress = "";
        this.value = 0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

}

