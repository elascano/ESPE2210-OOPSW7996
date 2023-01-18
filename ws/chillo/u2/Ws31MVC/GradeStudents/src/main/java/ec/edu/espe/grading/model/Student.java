package ec.edu.espe.grading.model;

/**
 *
 * @author NicolayChillo, Gaman GeekLords at DCOO-ESPE
 */
public class Student {
    private int Id;
    private String Name;
    private float grades[];
    private float GPA;

    public Student(int Id, String Name, float[] grades, float GPA) {
        this.Id = Id;
        this.Name = Name;
        this.grades = grades;
        this.GPA = GPA;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float[] getGrades() {
        return grades;
    }

    public void setGrades(float[] grades) {
        this.grades = grades;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    
    
}
