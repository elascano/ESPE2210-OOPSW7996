
package espe.edu.ec.crud.model;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO_ESPE
 */
public class Average {
    
    private int id;
    private String StudentPassword;
    private double average;

    @Override
    public String toString() {
        return "Average{" + "StudentPassword=" + StudentPassword + ", average=" + average + '}';
    }
    
    public Average() {
        StudentPassword = "";
        average = 0;
    }

    public Average(String StudentName, double average) {
        this.StudentPassword = StudentName;
        this.average = average;
    }

    /**
     * @return the StudentPassword
     */
    public String getStudentPassword() {
        return StudentPassword;
    }

    /**
     * @param StudentPassword the StudentName to set
     */
    public void setStudentPassword(String StudentPassword) {
        this.StudentPassword = StudentPassword;
    }

    /**
     * @return the average
     */
    public double getAverage() {
        return average;
    }

    /**
     * @param average the average to set
     */
    public void setAverage(double average) {
        this.average = average;
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
}
