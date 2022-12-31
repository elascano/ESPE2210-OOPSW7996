package ec.edu.espe.studentmanager.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class Student {

    private String id;
    private String name;
    private float[] grades;

    public Student(String id, String name, float[] grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + "[" + grades[0] + ", " + grades[1] + ", " + grades[2] + "]";
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
     * @return the grades
     */
    public float[] getGrades() {
        return grades;
    }

    /**
     * @param grades the grades to set
     */
    public void setGrades(float[] grades) {
        this.grades = grades;
    }

}
