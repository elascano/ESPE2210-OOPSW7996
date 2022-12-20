package ec.edu.espe.urecord.model;

import java.util.ArrayList;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Student extends UniversityMember {

    private float GPA;

    public Student(float GPA, int id, String name, String cedula, ArrayList<NRC> courses) {
        super(id, name, cedula, courses);
        this.GPA = GPA;
    }

    @Override
    public void registerInSystem() {
        System.out.println("registered student");
    }

    @Override
    public String toString() {
        return "Student{" + "GPA=" + GPA + super.toString() + '}';
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
