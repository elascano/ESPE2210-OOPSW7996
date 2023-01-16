
package espe.edu.ec.desingwithcrud.model;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class Average {
    
    private int id;
    private String StudentName;
    private double average;

    @Override
    public String toString() {
        return "Average{" + "StudentName=" + StudentName + ", average=" + average + '}';
    }
    
    public Average() {
        StudentName = "";
        average = 0;
    }

    public Average(String StudentName, double average) {
        this.StudentName = StudentName;
        this.average = average;
    }

    /**
     * @return the StudentName
     */
    public String getStudentName() {
        return StudentName;
    }

    /**
     * @param StudentName the StudentName to set
     */
    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
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
