package ec.edu.espe.urecords.model;

import java.util.ArrayList;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Instructor extends UniversityMember{
    
    private float salary;
    private String title;
    
    @Override
    public void registerInTheSystem() {
        System.out.println("registering an instructor");
    }

    public Instructor(float salary, String title, int id, String name, String cedula, ArrayList<NRC> courses) {
        super(id, name, cedula, courses);
        this.salary = salary;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Instructor{" + "salary=" + salary + ", title=" + title + super.toString() +'}';
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
