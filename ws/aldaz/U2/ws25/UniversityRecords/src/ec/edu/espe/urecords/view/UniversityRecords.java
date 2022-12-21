/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.urecords.view;

import ec.edu.espe.urecords.model.Instructor;
import ec.edu.espe.urecords.model.NRC;
import ec.edu.espe.urecords.model.Student;
import ec.edu.espe.urecords.model.UniversityMember;
import java.util.ArrayList;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class UniversityRecords {
    public static void main(String[] args){
        UniversityMember universityMember;
        ArrayList<NRC> courses;
        courses = new ArrayList<>();
        universityMember = new Instructor(320F,"System ing",1,"Edison Lascano", "170893114",courses);
        System.out.println("university member -->" + universityMember);
        System.out.println("university member type -->" + universityMember.getClass().getSimpleName());
        printUniversityMember(universityMember);
        
        universityMember = new Student(18.5F,1,"Francisco Aldaz", "0501964761", courses);
        printUniversityMember(universityMember);
        
        Student student = new Student(16.5F,2,"Domenica Chango","1722678560",courses);
        printUniversityMember(student);
        
        Instructor instructor = new Instructor(2851.20F,"Software Engineer",2,"Bernardo Aldaz","1756046452",courses);
        printUniversityMember(instructor);
    }
    public static void printUniversityMember(UniversityMember universityMember){
        System.out.println("this is a uMember -->" + universityMember);
    }
}
