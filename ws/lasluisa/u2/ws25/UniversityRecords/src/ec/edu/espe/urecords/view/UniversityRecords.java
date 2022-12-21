package ec.edu.espe.urecords.view;

import ec.edu.espe.urecords.model.Instructor;
import ec.edu.espe.urecords.model.NRC;
import ec.edu.espe.urecords.model.Student;
import ec.edu.espe.urecords.model.UniversityMember;
import java.util.ArrayList;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class UniversityRecords {

    public static void main(String[] args) {
        UniversityMember universityMember;
        ArrayList<NRC> courses = new ArrayList<NRC>();

        universityMember = new Instructor(3920.0F, "syst ang", 1, "Edison Lascano", "1710893114", courses);
        printUniversityMember(universityMember);
        System.out.println("university member type -> " + universityMember.getClass().getSimpleName());
        
        universityMember = new Student(18.5F, 2, "Erick Lasluisa", "1726249442", courses);
        printUniversityMember(universityMember);
        
        Student student = new Student(16.5F, 3, "Justin", "1805386206", courses);
        printUniversityMember(student);
        
        Instructor instructor = new Instructor(2832.0F, "syst ang", 2, "Bernardo Aldaz", "1756046452", courses);
        printUniversityMember(universityMember);
    }

    private static void printUniversityMember(UniversityMember universityMember) {
        System.out.println("universityMember = " + universityMember);
    }

}
