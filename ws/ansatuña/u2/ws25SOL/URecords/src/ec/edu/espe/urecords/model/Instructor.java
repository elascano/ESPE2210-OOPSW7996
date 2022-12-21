
package ec.edu.espe.urecords.model;

import java.util.ArrayList;

/**
 *
 * @author NW USER
 */
public class Instructor extends UniversityMember{
private float salary;
private String title;

    @Override
    public String toString() {
        return "Instructor{" +"id="+id+ ", salary=" + salary + ", title=" + title + ", name="+name+", cedula="+cedula+", courses"+courses+'}';
    }

    public Instructor(float salary, String title, int id, String name, String cedula, ArrayList<NRC> courses) {
        super(id, name, cedula, courses);
        this.salary = salary;
        this.title = title;
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
    public void registerInTheSystem() {
        System.out.println("Registering Innstructor in the system...");
    }
    
}
