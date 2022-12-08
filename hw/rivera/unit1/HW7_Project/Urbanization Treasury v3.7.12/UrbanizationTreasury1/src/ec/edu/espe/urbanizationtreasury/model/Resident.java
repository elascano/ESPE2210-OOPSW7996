
package ec.edu.espe.urbanizationtreasury.model;

/**
 *
 * @author WebMasterTeam, DCCO-ESPE
 */
public class Resident {
    
    private long dni;
    private String name;
    private int batchNumber;
    public Payment payment = new Payment();
    private String mounths;

    public Resident() {
        this.dni = 0;
        this.name = "";
        this.batchNumber = 0;
        this.mounths = "";
    }
    
    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getMounths() {
        return mounths;
    }

    public void setMounths(String mounths) {
        this.mounths = mounths;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    

}
