package ec.edu.espe.studentmanager.controller;

import ec.edu.espe.studentmanager.model.FinalGrade;
import ec.edu.espe.studentmanager.model.Student;
import java.util.ArrayList;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class FinalGradeController {
    public static float computeFinalGrade(float[] grades) {
        float finalGrade = 0;
        
        for (int i = 0; i < grades.length; i++) {
            finalGrade += grades[i];
        }
        
        finalGrade /= grades.length;
        
        finalGrade = (float) Math.round(finalGrade * 100) / 100;
        
        return finalGrade;
    }
    
    public static ArrayList buildStudentsFinalGrade(ArrayList<Student> students) {
        ArrayList<FinalGrade> studentsFinalGrade;
        FinalGrade studentFinalGrade;
        
        studentsFinalGrade = new ArrayList<>();
        
        for (Student student : students) {
            studentFinalGrade = new FinalGrade(student.getId(), student.getName(), computeFinalGrade(student.getGrades()));
            studentsFinalGrade.add(studentFinalGrade);
        }
        
        return studentsFinalGrade;
    }
    
    public static void showStudentsFinalGrade(ArrayList<FinalGrade> studentsFinalGrades) {
        int counter = 1;
        System.out.println("#\tID\t\tNAME\t\tFINAL GRADE");
        System.out.println("-------------------------------------------------------");
        for (FinalGrade studentFinalGrades : studentsFinalGrades) {
            System.out.println(counter + "\t" + studentFinalGrades);
            counter++;
        }
        System.out.println("-------------------------------------------------------");
    }
}
