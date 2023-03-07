
package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Tarif extends Service{
    private String exitAdress ;
    private String arrivalAdress ;
    private int kilometres ;
    private float valueToPay ;

    @Override
    public String toString() {
        return "Tarif{" + "exitAdress=" + exitAdress + ", arrivalAdress=" + arrivalAdress + ", kilometres=" + kilometres + ", valueToPay=" + valueToPay + '}';
    }
public Tarif() {
        this.exitAdress = "";
        this.arrivalAdress = "";
        this.kilometres = 0;
        this.valueToPay = 0.0F;
    }

    public Tarif(String exitAdress, String arrivalAdress, int kilometres, float valueToPay) {
        this.exitAdress = exitAdress;
        this.arrivalAdress = arrivalAdress;
        this.kilometres = kilometres;
        this.valueToPay = valueToPay;
    }

    /**
     * @return the exitAdress
     */
    public String getExitAdress() {
        return exitAdress;
    }

    /**
     * @param exitAdress the exitAdress to set
     */
    public void setExitAdress(String exitAdress) {
        this.exitAdress = exitAdress;
    }

    /**
     * @return the arrivalAdress
     */
    public String getArrivalAdress() {
        return arrivalAdress;
    }

    /**
     * @param arrivalAdress the arrivalAdress to set
     */
    public void setArrivalAdress(String arrivalAdress) {
        this.arrivalAdress = arrivalAdress;
    }

    /**
     * @return the kilometres
     */
    public int getKilometres() {
        return kilometres;
    }

    /**
     * @param kilometres the kilometres to set
     */
    public void setKilometres(int kilometres) {
        this.kilometres = kilometres;
    }

    /**
     * @return the valueToPay
     */
    public float getValueToPay() {
        return valueToPay;
    }

    /**
     * @param valueToPay the valueToPay to set
     */
    public void setValueToPay(float valueToPay) {
        this.valueToPay = valueToPay;
    }

}
