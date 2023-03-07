package ec.edu.espe.inclass.model;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class AttendanceRecord {

    private ArrayList<Boolean> Attendance;
    private int totalClassNumber;

    public AttendanceRecord() {
        this.Attendance = new ArrayList<>();
        Attendance.add(false);
        this.totalClassNumber = 1;
    }        

    public AttendanceRecord(ArrayList<Boolean> Attendance, int totalClassNumber) {
        this.Attendance = Attendance;
        this.totalClassNumber = totalClassNumber;
    }        

    /**
     * @return the Attendance
     */
    public ArrayList<Boolean> getAttendance() {
        return Attendance;
    }

    /**
     * @param Attendance the Attendance to set
     */
    public void setAttendance(ArrayList<Boolean> Attendance) {
        this.Attendance = Attendance;
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
    
 }
