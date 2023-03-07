package ec.edu.espe.inclass.model;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Student extends UniversityMember {

    private AttendanceRecord attendanceRecord;
    private GradeRecord gradeRecord;

    public Student(String espeId, String name) {
        super(name, espeId);
        attendanceRecord = new AttendanceRecord();
        gradeRecord = new GradeRecord();
    }

    public Student(AttendanceRecord attendanceRecord, GradeRecord gradeRecord, String name, String espeId) {
        super(name, espeId);
        this.attendanceRecord = attendanceRecord;
        this.gradeRecord = gradeRecord;
    }

    /**
     * @return the attendanceRecord
     */
    public AttendanceRecord getAttendanceRecord() {
        return attendanceRecord;
    }

    /**
     * @param attendanceRecord the attendanceRecord to set
     */
    public void setAttendanceRecord(AttendanceRecord attendanceRecord) {
        this.attendanceRecord = attendanceRecord;
    }

    /**
     * @return the gradeRecord
     */
    public GradeRecord getGradeRecord() {
        return gradeRecord;
    }

    /**
     * @param gradeRecord the gradeRecord to set
     */
    public void setGradeRecord(GradeRecord gradeRecord) {
        this.gradeRecord = gradeRecord;
    }

}
