package ec.edu.espe.inclass.controller;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Component;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class PdfManager {

    private static String askDirectory(Component parent) {
        JFileChooser fileChooser = new JFileChooser();
        String directory;
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setApproveButtonText("Save");
        fileChooser.setDialogTitle("Choose Directory");
        int answer = fileChooser.showOpenDialog(parent);
        if (answer == JFileChooser.APPROVE_OPTION) {
            File fileChoose = fileChooser.getSelectedFile();
            directory = fileChoose.getPath();
        } else {
            directory = "";
        }

        return directory;
    }

    public static void createGradeRecord(Component parent, JTable table) {
        DataPersistence dataPersistence;                
        dataPersistence = DataPersistence.getInstance();
        String directory;

        directory = askDirectory(parent);

        if (!directory.equals("")) {

            try {
                String nrc;
                nrc = String.valueOf(dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getNrc());
                FileOutputStream archive;
                File file = new File(directory + "/GradeRecordNrc" + nrc + ".pdf");
                archive = new FileOutputStream(file);
                Document document = new Document();
                PdfWriter.getInstance(document, archive);
                float[] columnGradeRecordStudents = new float[]{10F, 20F, 40F, 15F, 15F, 15F, 15F, 20F};
                String texts[] = {"#", "id", "Students", "Unit1", "Unit2", "Unit3", "Average", "Status"};

                document.open();
                document.add(generateHead(nrc, "GRADE RECORD"));
                document.add(generateInfo());
                document.add(generateRecord(columnGradeRecordStudents, texts, table));
                document.close();
                archive.close();
                JOptionPane.showMessageDialog(null, "Pdf successfully created");

            } catch (DocumentException | IOException e) {
                JOptionPane.showMessageDialog(null, "error: " + e);
            }
        }
    }

    public static void createAttendaceRecord(Component parent, JTable table) {
        DataPersistence dataPersistence;                
        dataPersistence = DataPersistence.getInstance();
        String directory;

        directory = askDirectory(parent);

        if (!directory.equals("")) {

            try {
                String nrc;
                nrc = String.valueOf(dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getNrc());
                FileOutputStream archive;
                File file = new File(directory + "/AttendanceRecordNrc" + nrc + ".pdf");
                archive = new FileOutputStream(file);
                Document doc = new Document();
                PdfWriter.getInstance(doc, archive);

                float[] columnAttendanceRecord = new float[]{10F, 20F, 30F, 20F, 20F};
                String texts[] = {"#", "id", "Students", "Assistance Persent", "Status"};

                doc.open();
                doc.add(generateHead(nrc, "ATTENDANCE RECORD"));
                doc.add(generateInfo());
                doc.add(generateRecord(columnAttendanceRecord, texts, table));
                doc.close();
                archive.close();
                JOptionPane.showMessageDialog(null, "Pdf successfully created");

            } catch (DocumentException | IOException e) {
                JOptionPane.showMessageDialog(null, "error: " + e);
            }
        }
    }

    public static void createTutorshipRecord(Component parent, JTable table) {

        String directory;

        directory = askDirectory(parent);

        if (!directory.equals("")) {

            try {
                FileOutputStream archive;
                File file = new File(directory + "/TutorshipRecordNrc" + ".pdf");
                archive = new FileOutputStream(file);
                Document doc = new Document();
                PdfWriter.getInstance(doc, archive);

                float[] columnTutorshipRecord = new float[]{10F, 20F, 30F, 20F, 20F, 30F};
                String texts[] = {"#", "id", "Students", "Career", "Course Name", "Date"};

                doc.open();
                doc.add(generateHead("GENERAL", "TUTORSHIP RECORD"));
                doc.add(generateInfo());
                doc.add(generateRecord(columnTutorshipRecord, texts, table));
                doc.close();
                archive.close();
                JOptionPane.showMessageDialog(null, "Pdf successfully created");

            } catch (DocumentException | IOException e) {
                JOptionPane.showMessageDialog(null, "error: " + e);
            }
        }
    }

    private static PdfPTable generateRecord(float[] columnsSize, String[] texts, JTable table) throws DocumentException {
        PdfPTable record = new PdfPTable(columnsSize.length);
        record.setWidthPercentage(100);
        record.getDefaultCell().setBorder(0);
        record.setWidths(columnsSize);
        record.setHorizontalAlignment(Element.ALIGN_LEFT);
        putInformation(texts, record, table);
        return record;
    }

    private static Paragraph generateInfo() {
        DataPersistence dataPersistence;                
        dataPersistence = DataPersistence.getInstance();
        Font fontType12 = new Font(Font.FontFamily.TIMES_ROMAN, 12);
        Paragraph informationParagraph = new Paragraph();
        informationParagraph.add(Chunk.NEWLINE);
        informationParagraph.add(new Phrase("ASIGNATURE:  " + dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getName() + "\n\n", fontType12));
        return informationParagraph;
    }

    private static PdfPTable generateHead(String nrc, String recordType) throws DocumentException {
        Font fontType12 = new Font(Font.FontFamily.TIMES_ROMAN, 12);
        Image image = null;
        try {
            image = Image.getInstance("src/img/espeLogo.png");
        } catch (Exception e) {
            System.out.println("espeLogo.png no founded");
        }

        Paragraph dateParagraph = new Paragraph();
        dateParagraph.add(Chunk.NEWLINE);
        Date date = new Date();
        dateParagraph.add(new Phrase("Date:\n" + new SimpleDateFormat("dd-MM-yyyy").format(date) + "\n\n", fontType12));

        PdfPTable head = new PdfPTable(4);
        head.setWidthPercentage(100);
        head.getDefaultCell().setBorder(0);
        float[] columnHead = new float[]{20F, 20F, 110F, 30F};
        head.setWidths(columnHead);
        head.setHorizontalAlignment(Element.ALIGN_LEFT);

        head.addCell(image);
        head.addCell("");
        head.addCell(new Phrase("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE \n\n\t" + recordType + " NRC: " + nrc, fontType12));
        head.addCell(dateParagraph);

        return head;
    }

    private static void putInformation(String[] texts, PdfPTable Record, JTable table) {
        ArrayList<PdfPCell> titles = new ArrayList<>();
        Font fontType10 = new Font(Font.FontFamily.TIMES_ROMAN, 10);

        for (String text : texts) {
            titles.add(new PdfPCell(new Phrase(text, fontType10)));
        }

        for (PdfPCell title : titles) {
            title.setBorder(0);
            title.setBackgroundColor(BaseColor.LIGHT_GRAY);
            Record.addCell(title);
        }

        for (int i = 0; i < table.getRowCount(); i++) {
            for (int j = 0; j < table.getColumnCount(); j++) {
                String data = table.getValueAt(i, j).toString();
                Record.addCell(new Phrase(data, fontType10));
            }
        }
    }

}
