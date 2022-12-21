package ec.edu.espe.urecords.view;

import ec.edu.espe.urecords.model.Instructor;
import ec.edu.espe.urecords.model.NRC;
import ec.edu.espe.urecords.model.Student;
import ec.edu.espe.urecords.model.UniversityMember;
import java.util.ArrayList;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class UniversityRecords {
    
    public static void main(String[] args) {
     
        UniversityMember universityMember;
        ArrayList<NRC> courses;
    
        courses = new ArrayList<>();
    
        universityMember = new Instructor(3920.0F, "syst eng", 1, "Edison Lascano", "1710893114", courses);
        
        System.out.println("university member --->" + universityMember);
        System.out.println("University member Type --->" + universityMember.getClass().getSimpleName());
        
        printUniversityMember(universityMember);
        
        universityMember = new Student(18.5F, 1, "asdasd", "1727275198", courses);
        printUniversityMember(universityMember);
        
        Student student = new Student(16.5F, 2, "QWEQWE", "1727275198", courses);
        printUniversityMember(student);
        
        Instructor instructor;
        
        instructor = new Instructor(2851.0F, "sw eng", 2, "Bernardo Aldaz", "1756046452", courses);
        printUniversityMember(instructor);   
    }
    
    public static void printUniversityMember(UniversityMember universityMember){
        System.out.println("This is a university member --->" + universityMember);
    }
}
