
package ec.edu.espe.POOExam1PCable.model;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Cable {
    private int idCable;
    private float numberOfmeter;
    private String typeOfCable;
    private String typeOfConductor;

    /**
     * @return the idCable
     */
    public int getIdCable() {
        return idCable;
    }

    /**
     * @param idCable the idCable to set
     */
    public void setIdCable(int idCable) {
        this.idCable = idCable;
    }

    /**
     * @return the numberOfmeter
     */
    public float getNumberOfmeter() {
        return numberOfmeter;
    }

    /**
     * @param numberOfmeter the numberOfmeter to set
     */
    public void setNumberOfmeter(float numberOfmeter) {
        this.numberOfmeter = numberOfmeter;
    }

    /**
     * @return the typeOfCable
     */
    public String getTypeOfCable() {
        return typeOfCable;
    }

    /**
     * @param typeOfCable the typeOfCable to set
     */
    public void setTypeOfCable(String typeOfCable) {
        this.typeOfCable = typeOfCable;
    }

    /**
     * @return the typeOfConductor
     */
    public String getTypeOfConductor() {
        return typeOfConductor;
    }

    /**
     * @param typeOfConductor the typeOfConductor to set
     */
    public void setTypeOfConductor(String typeOfConductor) {
        this.typeOfConductor = typeOfConductor;
    }

    public Cable(int idCable, float numberOfmeter, String typeOfCable, String typeOfConductor) {
        this.idCable = idCable;
        this.numberOfmeter = numberOfmeter;
        this.typeOfCable = typeOfCable;
        this.typeOfConductor = typeOfConductor;
    }
    
}
