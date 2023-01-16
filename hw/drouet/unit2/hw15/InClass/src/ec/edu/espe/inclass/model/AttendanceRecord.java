package ec.edu.espe.inclass.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class AttendanceRecord {

    private int attendanceNumber;
    private int totalClassNumber;

    public AttendanceRecord() {
        attendanceNumber = 0;
        totalClassNumber = 0;
    }

    public AttendanceRecord(int attendanceNumber, int totalClassNumber) {
        this.attendanceNumber = attendanceNumber;
        this.totalClassNumber = totalClassNumber;
    }

    public void add(ArrayList<Student> students) {
        String isPresentString;
        Scanner scan = new Scanner(System.in);

        for (Student student : students) {
            System.out.print("name: " + student.getName());

            System.out.print("  Is present? (y/n): ");
            isPresentString = scan.nextLine();

            isPresentString = validatePresentString(isPresentString, scan);

            if ("y".equals(isPresentString.toLowerCase())) {
                student.getAttendanceRecord().addAttendance();
                student.getAttendanceRecord().addClassNumber();
            } else {
                student.getAttendanceRecord().addClassNumber();
            }

        }
    }

    private String validatePresentString(String isPresentString, Scanner scan) {
        while (!"y".equals(isPresentString.toLowerCase()) && !"n".equals(isPresentString.toLowerCase())) {
            System.out.print("(y/n): ");
            isPresentString = scan.nextLine();
        }
        return isPresentString;
    }

    public void addAttendance() {
        attendanceNumber++;
    }

    public void addClassNumber() {
        totalClassNumber++;
    }

    /**
     * @return the attendanceNumber
     */
    public int getAttendanceNumber() {
        return attendanceNumber;
    }

    /**
     * @param attendanceNumber the attendanceNumber to set
     */
    public void setAttendanceNumber(int attendanceNumber) {
        this.attendanceNumber = attendanceNumber;
    }

    /**
     * @return the totalClassNumber
     */
    public int getTotalClassNumber() {
        return totalClassNumber;
    }

    /**
     * @param totalClassNumber the totalClassNumber to set
     */
    public void setTotalClassNumber(int totalClassNumber) {
        this.totalClassNumber = totalClassNumber;
    }

    @Override
    public String toString() {
        return "attendanceNumber: " + attendanceNumber + ", totalClassNumber: " + totalClassNumber;
    }

}
