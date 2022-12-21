package ec.edu.espe.urecords.model;

import java.util.ArrayList;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Student extends UniversityMember{
    private float GPA;

    public Student(float GPA, int id, String name, String cedula, ArrayList<NRC> courses) {
        super(id, name, cedula, courses);
        this.GPA = GPA;
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

    @Override
    public void registerInTheSystem() {
     
    }
    
}
