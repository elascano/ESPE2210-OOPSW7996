package ec.edu.espe.urecords.model;

import java.util.ArrayList;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Student extends UniversityMember{
    private float GPA;

    public Student(int id, String name, String cédula, ArrayList<NRC> courses, float GPA) {
        super(id, name, cédula, courses);
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" + "GPA=" + GPA + ", " + super.toString()+'}';
    }




    @Override
    public void registerInTheSystem() {
        System.out.println("Registering student");
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
