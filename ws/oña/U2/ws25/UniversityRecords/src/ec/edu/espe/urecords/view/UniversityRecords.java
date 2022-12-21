
package ec.edu.espe.urecords.view;
import ec.edu.espe.urecords.model.Instructor;
import ec.edu.espe.urecords.model.UniversityMember;
import ec.edu.espe.urecords.model.NRC;
import ec.edu.espe.urecords.model.Student;
import java.util.ArrayList;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class UniversityRecords {
    public static void main(String[] args) {
    UniversityMember universityMember;
    ArrayList<NRC> courses;
    courses = new ArrayList<>();
    
    universityMember =new Instructor(3920.0F, "Systang", 1, "Edison Lacano", "1725675241", courses);
        System.out.println("University member -->"+universityMember);
        System.out.println("University member type  "+universityMember.getClass().getSimpleName());
        printUniversityMmeber(universityMember);
        
        
        universityMember = new Student(16.5F, 1, "Stepehn Drouet", "1726952946", courses);
        printUniversityMmeber(universityMember);
        
        Student student = new Student(16.5F, 2, "Justin", "25748964547", courses);
        printUniversityMmeber(student);
        
        Instructor instructor = new Instructor(2851.20F, "sw eng", 2, "Bernardo Aldaz", "1725894762", courses);
        printUniversityMmeber(instructor);
    }
    
    public static void printUniversityMmeber(UniversityMember universityMember) {
        System.out.println("Thi is a university Mmeber -->"+universityMember);
        
    }
    
    
}
