
package ec.edu.espe.grading.model;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class Student {
    private int id;
    private String name;
    private float grade[];
    private float GPA;

    public Student(int id, String name, float[] grade, float GPA) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.GPA = GPA;
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
     * @return the grade
     */
    public float[] getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(float[] grade) {
        this.grade = grade;
    }

    /**
     * @return the GPA
     */
    public float getGPA() {
        return GPA;
    }

    /**
     * @param GPA the GPA to set
     */
    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    
    
}
