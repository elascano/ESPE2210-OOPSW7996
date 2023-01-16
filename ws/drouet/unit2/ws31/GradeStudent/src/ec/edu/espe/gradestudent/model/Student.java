package ec.edu.espe.gradestudent.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Student {
    private int id;
    private String name;
    private float grades[];
    private float gpa;

    public Student(int id, String name, float[] grades, float gpa) {
        this.id = id;
        this.name = name;
        this.grades = grades;
        this.gpa = gpa;
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

    /**
     * @return the gpa
     */
    public float getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
    
    
}
