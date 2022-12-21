package ec.edu.espe.urecords.view;

import ec.edu.espe.urecords.model.Instructor;
import ec.edu.espe.urecords.model.NRC;
import ec.edu.espe.urecords.model.Student;
import ec.edu.espe.urecords.model.UniversityMember;
import java.util.ArrayList;

/**
 *
 * @author NW USER
 */
public class URecords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UniversityMember universityMember;
        ArrayList<NRC> courses;
        courses = new ArrayList<>();
        
        universityMember = new Instructor(5000, "Profesor", 1, "Juan", "1726382524", courses);
        System.out.println("univerity member ->" + universityMember);
        System.out.println("university meber" + universityMember.getClass().getSimpleName());
        
        universityMember=new Student(18.58F, 1, "Stephen Drouet", "1548923", courses);
        printUniversityMember(universityMember);
        
        Student student=new Student(17.20F, 2, "idk", "8541269", courses);
        printUniversityMember(student);
        
        Instructor instructor=new Instructor(6000, "doctor", 2, "Daniel", "17452368", courses);
        printUniversityMember(instructor);
    }

    public static void printUniversityMember(UniversityMember universityMember) {
        System.out.println("this is a university member ->" + universityMember);
    }
}
