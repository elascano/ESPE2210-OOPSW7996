package ec.edu.espe.urecords.view;

import ec.edu.espe.urecords.model.Instructor;
import ec.edu.espe.urecords.model.NRC;
import ec.edu.espe.urecords.model.Student;
import ec.edu.espe.urecords.model.UniversityMember;
import java.util.ArrayList;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class UniversityRecords {
    
    public static void main(String[] args) {
        
        UniversityMember universityMember;
        ArrayList<NRC> courses;
        
        courses = new ArrayList<>();
        
        universityMember = new Instructor(3920.0F, " syst ang ", 1, " Edison Lascano ", " 1710893114 ", courses);
        printUniversityMember(universityMember);
        System.out.println("university member type " + universityMember.getClass().getSimpleName());
        
        universityMember = new Student(18.5F, 1, " Stepehn Drouet ", " 1726952946 ", courses);
        printUniversityMember(universityMember);
        
        Student student = new Student(16.5F, 2, " Justin ", " 1750890699 ", courses);
        printUniversityMember(student);
        
        Instructor instructor = new Instructor(2851.20f, " sw eng ", 2, " Bernardo Aldaz ", " 1756046452 ", courses);
        printUniversityMember(instructor);
        
    }
    
    public static void printUniversityMember(UniversityMember universityMember) {
        
        System.out.println("this is a university member -> " + universityMember);
        
    }
    
}
