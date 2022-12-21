package ec.edu.espe.urecords.model;

import java.util.ArrayList;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Instructor extends UniversityMember{
    private float salary;
    private String title;

    public Instructor(float salary, String title, int id, String name, String cedula, ArrayList<NRC> courses) {
        super(id, name, cedula, courses);
        this.salary = salary;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Instructor{" + "salary=" + salary + ", title=" + title + super.toString() + '}';
    }
    
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void registerInSystem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
