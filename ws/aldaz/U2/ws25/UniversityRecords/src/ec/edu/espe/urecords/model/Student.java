
package ec.edu.espe.urecords.model;

import java.util.ArrayList;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class Student extends UniversityMember{
    private float GPA;

    public Student(float GPA, int id, String name, String cedula, ArrayList<NRC> courses) {
        super(id, name, cedula, courses);
        this.GPA = GPA;
    }

    @Override
    public void registerInTheSystem() {
        System.out.println("register student");
    }
    
   
    
}
