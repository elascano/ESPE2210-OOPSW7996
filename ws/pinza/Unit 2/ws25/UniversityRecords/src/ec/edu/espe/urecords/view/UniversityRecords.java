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
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class UniversityRecords {

    public static void main(String[] args) {

        UniversityMember universityMember;
        ArrayList<NRC> courses;
        courses = new ArrayList<>();
        
        System.out.println("\t===WS25===");
        System.out.println("\t=Juan Pinza=\n");
        
        universityMember = new Instructor(3920.0F, "syst ang", 1, "Edison Lascano", "171089311", courses);
        System.out.println("university member --> " + universityMember);
        System.out.println("university member type " + universityMember.getClass().getSimpleName());
        printUniversityMember(universityMember);

        universityMember = new Student(18.2F, 1, "Stephen Drouet", "1726952946", courses);
        printUniversityMember(universityMember);

        Student student = new Student(16.3F, 2, "Justin", "1805386206", courses);
        printUniversityMember(student);

        Instructor instructor = new Instructor(2851.2F, "sftw eng", 2, "Bernardo Aldas", "1756046452", courses);
        printUniversityMember(instructor);
    }

    public static void printUniversityMember(UniversityMember uMember) {
        System.out.println("this is a uMember --> " + uMember);
    }
}
