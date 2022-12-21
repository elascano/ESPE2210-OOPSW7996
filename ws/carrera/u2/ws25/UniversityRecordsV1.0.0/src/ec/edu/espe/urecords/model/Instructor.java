package ec.edu.espe.urecords.model;

import java.util.ArrayList;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Instructor extends UniversityMember {
    private float salary;
    private String title;

    public Instructor(int id, String name, String cédula, ArrayList<NRC> courses, float salary, String title) {
        super(id, name, cédula, courses);
        this.salary = salary;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Instructor{" + "salary=" + salary + ", title=" + title + ", " +super.toString()+'}';
    }



    @Override
    public void registerInTheSystem() {
        System.out.println("Registering instructor");
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
