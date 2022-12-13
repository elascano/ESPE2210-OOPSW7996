/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.urbanizationtreasury.model;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class Report {
    private float debt;
    private long dniResident;
    private String nameResident;
    private int batchNumberResiden;
    private String calendary;

    /**
     * @return the debt
     */
    public float getDebt() {
        return debt;
    }

    /**
     * @param debt the debt to set
     */
    public void setDebt(float debt) {
        this.debt = debt;
    }

    /**
     * @return the dniResident
     */
    public long getDniResident() {
        return dniResident;
    }

    /**
     * @param dniResident the dniResident to set
     */
    public void setDniResident(long dniResident) {
        this.dniResident = dniResident;
    }

    /**
     * @return the nameResident
     */
    public String getNameResident() {
        return nameResident;
    }

    /**
     * @param nameResident the nameResident to set
     */
    public void setNameResident(String nameResident) {
        this.nameResident = nameResident;
    }

    /**
     * @return the batchNumberResiden
     */
    public int getBatchNumberResiden() {
        return batchNumberResiden;
    }

    /**
     * @param batchNumberResiden the batchNumberResiden to set
     */
    public void setBatchNumberResiden(int batchNumberResiden) {
        this.batchNumberResiden = batchNumberResiden;
    }

    /**
     * @return the calendary
     */
    public String getCalendary() {
        return calendary;
    }

    /**
     * @param calendary the calendary to set
     */
    public void setCalendary(String calendary) {
        this.calendary = calendary;
    }
    
}
