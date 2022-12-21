package ec.edu.espe.urecords.view;

import ec.edu.espe.urecords.model.Instructor;
import ec.edu.espe.urecords.model.NRC;
import ec.edu.espe.urecords.model.Student;
import ec.edu.espe.urecords.model.UniversityMember;
import java.util.ArrayList;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class UniversityRecords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UniversityMember universityMember;
        Student student;
        Instructor instructor;
        ArrayList<NRC> courses;
        courses = new ArrayList<>();
        System.out.println("Nahir carrera ws25");
        universityMember = new Instructor(1, "Edison Lascano","1752235943" ,  courses, 3920.0F, "System Eng" );
        printUniversityMember(universityMember);
        System.out.println("University member type -> " + universityMember.getClass().getSimpleName());
       
        universityMember = new Student(1, "Stephen Drouet", "1726952946", courses, 18.5F);
        printUniversityMember(universityMember);
        System.out.println("University member type -> " + universityMember.getClass().getSimpleName());
        
        student = new Student(2, "Nahir Carrera", "1752235943", courses, 18.53F);
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
