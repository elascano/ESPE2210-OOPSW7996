package ec.edu.espe.urecords.view;

import ec.edu.espe.urecords.model.Instructor;
import ec.edu.espe.urecords.model.NRC;
import ec.edu.espe.urecords.model.Student;
import ec.edu.espe.urecords.model.UniversityMember;
import java.util.ArrayList;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class UniversityRercords {

    public static void main(String[] args) {

        UniversityMember universityMember;
        ArrayList<NRC> courses;

        courses = new ArrayList<>();

        universityMember = new Instructor(3920.0F, "syst eng", 1, "Edison Lascano", "171089311", courses);
        System.out.println("university member --> " + universityMember);
        System.out.println("university member type " + universityMember.getClass().getSimpleName());
        printUniversityMember(universityMember);

        Instructor instructor = new Instructor(2851.20F, "sw eng", 2, "Bernardo Aldas", "1756046452", courses);
        printUniversityMember(instructor);

        universityMember = new Student(18.5F, 1, "Stephen Drouet", "1726952946", courses);
        printUniversityMember(universityMember);

        Student student = new Student(16.5F, 2, "Justin", "1805386206", courses);
        printUniversityMember(student);

    }

    public static void printUniversityMember(UniversityMember uMember) {
        System.out.println("this is a uMember --> " + uMember);
    }
}
