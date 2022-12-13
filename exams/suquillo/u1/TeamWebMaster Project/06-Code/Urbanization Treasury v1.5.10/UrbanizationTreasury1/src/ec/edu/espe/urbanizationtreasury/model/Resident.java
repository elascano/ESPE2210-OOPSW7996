package ec.edu.espe.urbanizationtreasury.model;

import ec.edu.espe.urbanizationtreasury.model.Payment;
import java.util.ArrayList;

/**
 *
 * @author WebMasterTeam, DCCO-ESPE
 */
public class Resident {
    
    private long dni;
    private String name;
    private int batchNumber;
    public Payment payments = new Payment();;
    private String mounths;
    public ArrayList<String> mounthsOfAliquot = new ArrayList<>();
    public ArrayList<String> mounthsOfAccessCard = new ArrayList<>();
    public ArrayList<String> mounthsOfAccessControl = new ArrayList<>();
    public ArrayList<String> mounthsOfExtraordinary = new ArrayList<>();

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

    public ArrayList<String> getMounthsOfAliquots() {
        return mounthsOfAliquot;
    }

    public void mounthsOfAliquot(ArrayList<String> mounthsOfPayments) {
        this.mounthsOfAliquot = mounthsOfPayments;
    }

    public ArrayList<String> getMounthsOfAccessCard() {
        return mounthsOfAccessCard;
    }

    public void setMounthsOfAccessCard(ArrayList<String> mounthsOfAccessCard) {
        this.mounthsOfAccessCard = mounthsOfAccessCard;
    }

    public ArrayList<String> getMounthsOfAccessControl() {
        return mounthsOfAccessControl;
    }

    public void setMounthsOfAccessControl(ArrayList<String> mounthsOfAccessControl) {
        this.mounthsOfAccessControl = mounthsOfAccessControl;
    }

    public ArrayList<String> getMounthsOfExtraordinary() {
        return mounthsOfExtraordinary;
    }

    public void setMounthsOfExtraordinary(ArrayList<String> mounthsOfExtraordinary) {
        this.mounthsOfExtraordinary = mounthsOfExtraordinary;
    }
    
}
