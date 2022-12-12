package ec.edu.espe.urbanizationtreasury.model;

import java.util.ArrayList;

/**
 *
 * @author WebMasterTeam, DCCO-ESPE
 */
public class Payment {
    
    public ArrayList<Float> aliquot = new ArrayList<>();;
    public ArrayList<Float> accessCard = new ArrayList<>();;
    public ArrayList<Float> accessControl = new ArrayList<>();;
    public ArrayList<Float> extraordinary = new ArrayList<>();;
    public ArrayList<String> monthOfAliquot = new ArrayList<>();
    public ArrayList<String> monthOfAccessCard = new ArrayList<>();
    public ArrayList<String> monthOfAccessControl = new ArrayList<>();
    public ArrayList<String> monthOfExtraordinary = new ArrayList<>();

    public ArrayList<Float> getAliquot() {
        return aliquot;
    }

    public void setAliquot(ArrayList<Float> aliquot) {
        this.aliquot = aliquot;
    }

    public ArrayList<Float> getAccessCard() {
        return accessCard;
    }

    public void setAccessCard(ArrayList<Float> accessCard) {
        this.accessCard = accessCard;
    }

    public ArrayList<Float> getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(ArrayList<Float> accessControl) {
        this.accessControl = accessControl;
    }

    public ArrayList<Float> getExtraordinary() {
        return extraordinary;
    }

    public void setExtraordinary(ArrayList<Float> extraordinary) {
        this.extraordinary = extraordinary;
    }

    public ArrayList<String> getMounthsOfAliquot() {
        return monthOfAliquot;
    }

    public void setMounthsOfAliquot(ArrayList<String> mounthsOfAliquot) {
        this.monthOfAliquot = mounthsOfAliquot;
    }

    public ArrayList<String> getMounthsOfAccessCard() {
        return monthOfAccessCard;
    }

    public void setMounthsOfAccessCard(ArrayList<String> mounthsOfAccessCard) {
        this.monthOfAccessCard = mounthsOfAccessCard;
    }

    public ArrayList<String> getMounthsOfAccessControl() {
        return monthOfAccessControl;
    }

    public void setMounthsOfAccessControl(ArrayList<String> mounthsOfAccessControl) {
        this.monthOfAccessControl = mounthsOfAccessControl;
    }

    public ArrayList<String> getMounthsOfExtraordinary() {
        return monthOfExtraordinary;
    }

    public void setMounthsOfExtraordinary(ArrayList<String> mounthsOfExtraordinary) {
        this.monthOfExtraordinary = mounthsOfExtraordinary;
    }
    
    
}
