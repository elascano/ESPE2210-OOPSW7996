package ec.edu.espe.urecords.view;

import ec.edu.espe.urecords.model.Instructor;
import ec.edu.espe.urecords.model.NRC;
import ec.edu.espe.urecords.model.Student;
import ec.edu.espe.urecords.model.UniversityMember;
import java.util.ArrayList;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class UniversityRecords {
    public static void main(String[] args) {
        UniversityMember universityMember;
        ArrayList<NRC> courses;
        courses = new ArrayList<>();
        
        universityMember = new Instructor(3920.0F, "syst ang",1,"Edison Lascano", "1710467128",courses);
        System.out.println("University member--> " + universityMember);
        System.out.println("University member type--> " + universityMember.getClass().getSimpleName());
        
        printUniversityMember(universityMember);
        
        universityMember = new Student(17.3F,1,"Silvia Añasco","1753951027",courses); 
        printUniversityMember(universityMember);
        
        Student student = new Student(18.5F,2,"Stephen Drouet","1753951026",courses);
        printUniversityMember(student);
        
        Instructor instructor = new Instructor(2851.20F,"sw eng", 2, "Bernardo Aldaz","1756046452",courses);
        printUniversityMember(instructor);
        
    }
    
    public static void printUniversityMember(UniversityMember universityMember){
        System.out.println("this is university Member---> " + universityMember);
    }
}
