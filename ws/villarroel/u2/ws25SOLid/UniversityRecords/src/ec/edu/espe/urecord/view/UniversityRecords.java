
package ec.edu.espe.urecord.view;

import ec.edu.espe.urecord.model.Instructor;
import ec.edu.espe.urecord.model.NRC;
import ec.edu.espe.urecord.model.Student;
import ec.edu.espe.urecord.model.UniversityMember;
import java.util.ArrayList;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class UniversityRecords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UniversityMember universityMember;
        ArrayList<NRC> courses ;
        courses = new ArrayList<>();
        
        universityMember = new Instructor(3920.0F,"syst ang",1,"Edison Lascano","192837493",courses);
        System.out.println("University Member --> " + universityMember);
        System.out.println("University member Type --> " +universityMember.getClass().getSimpleName());
        
        universityMember = new Student(18.5F,1,"Stephen Druet","1829304839",courses);
        printUniversityMember(universityMember);
        
        Student student = new Student(16.5F,2,"Justin","1805386206",courses);
        printUniversityMember(student);
        
        Instructor instructor = new Instructor(2851.20F,"sw eng",2,"Bernardo Aldaz","1729382937",courses);
        printUniversityMember(instructor); 
        
        
    }
    
    public static void printUniversityMember(UniversityMember universityMember){
        System.out.println("This is a U Member --> " + universityMember);
        
    }
    
}
