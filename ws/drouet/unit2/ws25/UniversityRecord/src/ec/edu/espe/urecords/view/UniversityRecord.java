package ec.edu.espe.urecords.view;

import ec.edu.espe.urecords.model.Instructor;
import ec.edu.espe.urecords.model.UniversityMember;
import ec.edu.espe.urecords.model.NRC;
import ec.edu.espe.urecords.model.Student;
import java.util.ArrayList;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class UniversityRecord {

    public static void main(String[] args) {
        UniversityMember universityMember;
        ArrayList<NRC> courses;

        courses = new ArrayList<>();

        universityMember = new Instructor(3920.8F, "syst ang", 1, "Edison Lascano", "1710893114", courses);
        printUniversityMember(universityMember);

        universityMember = new Student(18.5F, 1, "Stephen Drouet", "1726952946", courses);
        printUniversityMember(universityMember);
        
        Student student = new Student(16.5F, 2, "Ashley Santos", "1726454665", courses);
        printUniversityMember(student);
        
        Instructor instructor = new Instructor(3920.8F, "syst and tel", 2, "Santiago Valencia", "1768464684", courses);
        printUniversityMember(instructor);

    }

    private static void printUniversityMember(UniversityMember universityMember) {
        System.out.println("University member -> " + universityMember);
    }
}
