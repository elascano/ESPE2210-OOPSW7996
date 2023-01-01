package ec.edu.espe.studentmanager.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class FinalGrade {

    private String id;
    private String name;
    private float finalGrade;

    public FinalGrade(String id, String name, float finalGrade) {
        this.id = id;
        this.name = name;
        this.finalGrade = finalGrade;
    }

    @Override
    public String toString() {
        return getId() + "\t" + getName() + "\t" + getFinalGrade();
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
     * @return the finalGrade
     */
    public float getFinalGrade() {
        return finalGrade;
    }

    /**
     * @param finalGrade the finalGrade to set
     */
    public void setFinalGrade(float finalGrade) {
        this.finalGrade = finalGrade;
    }

}
