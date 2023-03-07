package ec.edu.espe.inclass.controller;
import java.awt.Component;
import javax.swing.JTable;
import org.junit.Test;

/**
 *
 * @author alejo
 */
public class PdfManagerTest {
    
    public PdfManagerTest() {
    }
    /**
     * Test of createGradeRecord method, of class PdfManager.
     */
    @Test
    public void testCreateGradeRecord() {
        System.out.println("createGradeRecord");
        Component parent = null;
        JTable table = new JTable();
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        dataPersistence.connectMongoDB();
        PdfManager.createGradeRecord(parent, table);
    }

    @Test
    public void testCreateAttendaceRecord() {
        System.out.println("createAttendaceRecord");
        Component parent = null;
        JTable table = new JTable();
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        dataPersistence.connectMongoDB();
        PdfManager.createAttendaceRecord(parent, table);
    }
    @Test
    public void testCreateTutorshipRecord() {
        System.out.println("createTutorshipRecord");
        Component parent = null;
        JTable table = new JTable();
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        dataPersistence.connectMongoDB();
        PdfManager.createTutorshipRecord(parent, table);
    } 
    @Test
    public void testCreateGradeRecordFail() {
        System.out.println("createGradeRecord");
        Component parent = null;
        JTable table = null;
        PdfManager.createGradeRecord(parent, table);
    }

    @Test
    public void testCreateAttendaceRecordFail() {
        System.out.println("createAttendaceRecord");
        Component parent = null;
        JTable table = null;
        PdfManager.createAttendaceRecord(parent, table);
    }

    @Test
    public void testCreateTutorshipRecordFail() {
        System.out.println("createTutorshipRecord");
        Component parent = null;
        JTable table = null;
        PdfManager.createTutorshipRecord(parent, table);
    } 
}
