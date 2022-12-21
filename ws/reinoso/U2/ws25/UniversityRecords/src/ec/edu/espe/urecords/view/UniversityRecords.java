package ec.edu.espe.urecords.view;

import ec.edu.espe.urecords.model.Instructor;
import ec.edu.espe.urecords.model.NRC;
import ec.edu.espe.urecords.model.Student;
import ec.edu.espe.urecords.model.UniversityMember;
import java.util.ArrayList;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class UniversityRecords {

    public static void main(String[] args) {
        UniversityMember universityMember;
        Student student;
        Instructor instructor;
        ArrayList<NRC> courses;
        courses = new ArrayList<>();
        System.out.println("======= ws25 ========");
        System.out.println("=== Reinoso Jerly ===");
        universityMember = new Instructor(1, "Edison Lascano","1752235943" ,  courses, 3920.0F, "System Eng" );
        printUniversityMember(universityMember);
        System.out.println("University member type -> " + universityMember.getClass().getSimpleName());
       
        universityMember = new Student(1, "Stephen Drouet", "1726952946", courses, 18.5F);
        printUniversityMember(universityMember);
        System.out.println("University member type -> " + universityMember.getClass().getSimpleName());
        
        student = new Student(2, "Jerly Reinoso", "1725841652", courses, 18.53F);
        printUniversityMember(student);
        System.out.println("Student type -> " + student.getClass().getSimpleName()); 
        
        instructor  = new Instructor(2, "Bernardo Aldaz", "1756046452", courses, 3920.0F, "Software Eng");
        printUniversityMember(instructor);
        System.out.println("Instructor type -> " + instructor.getClass().getSimpleName());
        
    }
    public static void printUniversityMember(UniversityMember universityMember){
        System.out.println("This is a university Member -> "+ universityMember);
    }
}
