package ec.edu.espe.urecords.view;

import ec.edu.espe.urecords.model.Instructor;
import ec.edu.espe.urecords.model.NRC;
import ec.edu.espe.urecords.model.Student;
import ec.edu.espe.urecords.model.UniversityMember;
import java.util.ArrayList;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class UniversityRecords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        UniversityMember universityMember;
        ArrayList<NRC> courses;
        
        courses = new ArrayList<>();
        
        universityMember = new Instructor(3920.0F, "Syst ang", 1, "EdisonLascano", "1710893114", courses);
        System.out.println("university member --> " + universityMember);
        System.out.println("University member type " + universityMember.getClass().getSimpleName());
        
        printUniversityMember(universityMember);
        
        universityMember = new Student(18.5F, 1, "Stephen Drouet", "1726952946", courses);
        printUniversityMember(universityMember);
        
        Student student = new Student(16.5F, 2, "Justin", "1805386286", courses);
        printUniversityMember(student);
        
        Instructor instructor = new Instructor(2851.0F, "Sw ang", 2, "Bernardo Aldaz", "1722263009", courses);
        printUniversityMember(instructor);
        
    }
    
    public static void printUniversityMember(UniversityMember universityMember){
        System.out.println("This is a uMember --> " + universityMember);
    }
    
}
