package ec.edu.espe.inclass.controller;

import ec.edu.espe.inclass.model.Course;
import ec.edu.espe.inclass.model.Grade;
import ec.edu.espe.inclass.model.Student;
import ec.edu.espe.inclass.model.Tutorship;
import ec.edu.espe.inclass.view.FrmAddCourse;
import ec.edu.espe.inclass.view.FrmAddGrade;
import ec.edu.espe.inclass.view.FrmAddStudent;
import ec.edu.espe.inclass.view.FrmEnterCourse;
import ec.edu.espe.inclass.view.FrmGetAttendanceRecord;
import ec.edu.espe.inclass.view.FrmGetGradeRecord;
import ec.edu.espe.inclass.view.FrmGetTutorshipRecord;
import ec.edu.espe.inclass.view.FrmLogin;
import ec.edu.espe.inclass.view.FrmRemoveCourse;
import ec.edu.espe.inclass.view.FrmRemoveStudent;
import ec.edu.espe.inclass.view.FrmRequestTutorship;
import ec.edu.espe.inclass.view.FrmShowEnrolledStudents;
import ec.edu.espe.inclass.view.FrmStudentMenu;
import ec.edu.espe.inclass.view.FrmTakeAttendance;
import ec.edu.espe.inclass.view.FrmTeacherMenu;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import utils.DBManager;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class FormController {

    public static void AddValidCourse(FrmAddCourse frame) {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        Course course;
        course = null;

        String name = "";
        int nrc = -1;
        boolean isCourseValid = true;

        name = String.valueOf(frame.getTxtName().getText()).toUpperCase();

        if (name.length() < 3) {
            isCourseValid = false;
        }

        try {
            nrc = Integer.parseInt(frame.getTxtNrc().getText());
            course = new Course(name, nrc);
        } catch (Exception e) {
            isCourseValid = false;
        }

        if (CourseController.findCourse(dataPersistence.getTeacher().getCourses(), nrc) != -1) {
            isCourseValid = false;
        }

        if (isCourseValid) {
            dataPersistence.getdBManager().createDocument("Courses", CourseController.convertCourseToJsonForDB(course));
            JOptionPane.showMessageDialog(frame, "Course successfully added", "COURSE add", INFORMATION_MESSAGE);
            frame.getTxtName().setText("");
            frame.getTxtNrc().setText("");
            dataPersistence.updateData();
        } else {
            JOptionPane.showMessageDialog(frame, "Course not add, course not valid or already exists ", "COURSE add", INFORMATION_MESSAGE);
        }
    }

    public static void validKeyName(FrmAddCourse frame, java.awt.event.KeyEvent evt) {
        char character = evt.getKeyChar();
        char nullCharacter = (char) 0;
        if (!Character.isDigit(character) && character != KeyEvent.VK_BACK_SPACE && character != KeyEvent.VK_DELETE) {
            JOptionPane.showMessageDialog(frame, character + " is not accepted here", "warning", JOptionPane.WARNING_MESSAGE);
            evt.setKeyChar(nullCharacter);
        }
    }

    public static ArrayList<Object> buildRow(ArrayList<Float> studentsGrade, int numberOfGrades, FrmAddGrade frame) {
        int num = frame.getTblGrades().getRowCount();
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        ArrayList<Object> studentRow;
        studentRow = new ArrayList<>();

        while (studentsGrade.size() < numberOfGrades) {
            studentsGrade.add(0.0F);
        }

        studentRow.add(String.valueOf(num + 1));
        studentRow.add(dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents().get(num).getEspeId());
        studentRow.add(dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents().get(num).getName());

        for (Float grade : studentsGrade) {
            studentRow.add(String.valueOf(grade));
        }

        return studentRow;
    }

    public static void emptyTable(FrmAddGrade frame) {
        DefaultTableModel model = (DefaultTableModel) frame.getTblGrades().getModel();
        model.setRowCount(0);
        model.setColumnCount(3);
        frame.getLblAction().setText("");
    }

    public static void showTableDate(int unit, int gradeType, FrmAddGrade frame) {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        DefaultTableModel model = (DefaultTableModel) frame.getTblGrades().getModel();
        int numberOfGrades;
        ArrayList<Grade> studentsGrades;
        ArrayList<Object> studentRow;
        studentsGrades = StudentController.getGrades(gradeType, unit);

        emptyTable(frame);

        if (!dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents().isEmpty()) {

            numberOfGrades = studentsGrades.get(0).getGradeValues().size();

            for (int i = 0; i < numberOfGrades; i++) {
                model.addColumn("Grade #" + (i + 1));
            }

            for (Grade studentsGrade : studentsGrades) {
                studentRow = buildRow(studentsGrade.getGradeValues(), numberOfGrades, frame);
                model.addRow(studentRow.toArray());
            }

            model.setColumnCount(3 + numberOfGrades);
        }
    }

    public static void saveActionGrade(FrmAddGrade frame) {
        int numberOfGrades = frame.getTblGrades().getColumnCount() - 3;
        int numberOfStudents = frame.getTblGrades().getRowCount();
        int unitNumber = frame.getCmbUnit().getSelectedIndex();
        int gradeType = frame.getCmbGradeType().getSelectedIndex();
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();

        frame.getTblGrades().selectAll();

        ArrayList<Float> grades;
        ArrayList<ArrayList> studentsGradesValidate;
        ArrayList<Grade> studentsGrades;
        studentsGrades = StudentController.getGrades(gradeType, unitNumber);
        studentsGradesValidate = new ArrayList<>();

        try {
            for (int i = 0; i < numberOfStudents; i++) {
                grades = new ArrayList<>();
                for (int j = 3; j < 3 + numberOfGrades; j++) {
                    grades.add(Float.valueOf((String) frame.getTblGrades().getValueAt(i, j)));
                }
                studentsGradesValidate.add(grades);
            }

            for (int i = 0; i < numberOfStudents; i++) {
                grades = studentsGradesValidate.get(i);
                studentsGrades.get(i).setGradeValues(grades);
            }

            dataPersistence.updateStudentsInDB(dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()));

            JOptionPane.showMessageDialog(frame, "Grades was saved", "Grades", INFORMATION_MESSAGE);
        } catch (Exception e) {
            frame.getLblAction().setText("Grades wasn´t saved, please use numbers and point(.)");
        }
    }

    public static void AddGradeAction(FrmAddGrade frame) {
        DefaultTableModel model = (DefaultTableModel) frame.getTblGrades().getModel();
        int unitNumber = frame.getCmbUnit().getSelectedIndex();
        int gradeType = frame.getCmbGradeType().getSelectedIndex();
        int numberOfGrades = frame.getTblGrades().getColumnCount() - 3;
        ArrayList<Grade> studentsGrades;
        studentsGrades = StudentController.getGrades(gradeType, unitNumber);
        model.addColumn("Grade #" + (numberOfGrades + 1));

        for (Grade studentGrades : studentsGrades) {
            studentGrades.getGradeValues().add(0.0F);
        }

        frame.getLblAction().setText("Grades was added");
    }

    public static void removeGradeAction(FrmAddGrade frame) throws HeadlessException {
        DefaultTableModel model = (DefaultTableModel) frame.getTblGrades().getModel();
        int unitNumber = frame.getCmbUnit().getSelectedIndex();
        int gradeType = frame.getCmbGradeType().getSelectedIndex();
        int numberOfGrades = frame.getTblGrades().getColumnCount() - 3;
        ArrayList<Grade> studentsGrades;

        int desicion = JOptionPane.showConfirmDialog(frame, "Do you want to delete the last grade?", "Grade delete info", WIDTH);

        if (desicion == 0) {
            if (numberOfGrades > 0) {
                frame.getLblAction().setText("Grades was deleted");
                studentsGrades = StudentController.getGrades(gradeType, unitNumber);

                model.setColumnCount(2 + numberOfGrades);

                for (Grade studentGrades : studentsGrades) {
                    studentGrades.getGradeValues().remove(numberOfGrades - 1);
                }

            } else {
                frame.getLblAction().setText("No grades to remove");
            }
        }
    }

    public static void AddStudentAction(FrmAddStudent form) throws HeadlessException {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        boolean isValid = true;
        Student student;
        Course course;

        String name;
        String id;
        int nrc;

        course = dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition());
        nrc = course.getNrc();
        name = String.valueOf(form.getTxtName().getText()).toUpperCase();
        id = String.valueOf(form.getTxtId().getText());

        if (name.length() < 6) {
            JOptionPane.showMessageDialog(form, "name: " + name + " is too short", "warning", JOptionPane.WARNING_MESSAGE);
            isValid = false;
        }

        if (id.length() < 9) {
            JOptionPane.showMessageDialog(form, "id: " + id + " is incomplete", "warning", JOptionPane.WARNING_MESSAGE);
            isValid = false;
        }

        if (isValid && StudentController.findStudent(course.getStudents(), id) != -1) {
            JOptionPane.showMessageDialog(form, "id: " + id + " already existing in course's nrc: " + nrc, "warning", JOptionPane.WARNING_MESSAGE);
            isValid = false;
        }

        try {
            student = new Student(id, name);
        } catch (Exception e) {
            student = null;
        }

        if (student != null && isValid) {
            dataPersistence.getdBManager().createDocument("Students", StudentController.convertStudentToJsonForDB(student, nrc));
            JOptionPane.showMessageDialog(form, "Student successfully added to course's nrc: " + nrc, "Student add", INFORMATION_MESSAGE);
            dataPersistence.updateData();
            form.getTxtName().setText("");
            form.getTxtId().setText("L");
        } else {
            JOptionPane.showMessageDialog(form, "Student not add", "Student add", INFORMATION_MESSAGE);
        }
    }

    public static void uploadCourses(FrmEnterCourse frame) {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        String[] coursesArray;
        coursesArray = new String[dataPersistence.getTeacher().getCourses().size()];
        String coursesString;

        for (int i = 0; i < dataPersistence.getTeacher().getCourses().size(); i++) {

            coursesString = dataPersistence.getTeacher().getCourses().get(i).getName() + " - nrc: " + String.valueOf(dataPersistence.getTeacher().getCourses().get(i).getNrc());
            coursesArray[i] = coursesString;
        }

        frame.getCmbNrc().setModel(new DefaultComboBoxModel<>(coursesArray));
        frame.getCmbNrc().setSelectedIndex(dataPersistence.getPosition());
    }

    public static void emptyTable(FrmGetAttendanceRecord frame) {
        DefaultTableModel model = (DefaultTableModel) frame.getTblAttendance().getModel();
        model.setRowCount(0);
        model.setColumnCount(3);
    }

    public static void showTableDate(FrmGetAttendanceRecord frame) {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        DefaultTableModel model = (DefaultTableModel) frame.getTblAttendance().getModel();
        Float studentAttendace;
        ArrayList<Object> studentRow;

        emptyTable(frame);

        model.addColumn("Assistance Persent");
        model.addColumn("Status");

        for (Student student : dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents()) {
            studentAttendace = StudentController.calculateAssistancePersetn(student);
            studentRow = buildRow(studentAttendace, frame);
            model.addRow(studentRow.toArray());
        }
    }

    public static ArrayList<Object> buildRow(Float studentAttendace, FrmGetAttendanceRecord frame) {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        int num = frame.getTblAttendance().getRowCount();
        ArrayList<Object> studentRow;
        studentRow = new ArrayList<>();

        studentRow.add(String.valueOf(num + 1));
        studentRow.add(dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents().get(num).getEspeId());
        studentRow.add(dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents().get(num).getName());
        studentRow.add(studentAttendace);

        if (StudentController.verifyAttendancePesent(studentAttendace)) {
            studentRow.add("Approved");
        } else {
            studentRow.add("Not approved");
        }

        return studentRow;
    }

    public static void showTableDate(FrmGetGradeRecord frame) {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        DefaultTableModel model = (DefaultTableModel) frame.getTblGrades().getModel();
        ArrayList<Float> studentsGrades;
        ArrayList<Object> studentRow;

        emptyTable(frame);

        for (int i = 0; i < 3; i++) {
            model.addColumn("Unit " + (i + 1));
        }
        model.addColumn("Average");
        model.addColumn("Status");

        for (Student student : dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents()) {
            studentsGrades = StudentController.getGradesUnit(student);
            studentRow = buildRow(studentsGrades, frame);
            model.addRow(studentRow.toArray());

        }

    }

    public static ArrayList<Object> buildRow(ArrayList<Float> studentsGrade, FrmGetGradeRecord frame) {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        int num = frame.getTblGrades().getRowCount();
        ArrayList<Object> studentRow;
        studentRow = new ArrayList<>();

        studentRow.add(String.valueOf(num + 1));
        studentRow.add(dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents().get(num).getEspeId());
        studentRow.add(dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents().get(num).getName());

        for (Float grade : studentsGrade) {
            studentRow.add(String.valueOf(grade));
        }
        if (studentsGrade.get(3) >= 14) {
            studentRow.add("Approved");
        } else {
            studentRow.add("Not approved");
        }

        return studentRow;
    }

    public static void emptyTable(FrmGetGradeRecord frame) {
        DefaultTableModel model = (DefaultTableModel) frame.getTblGrades().getModel();
        model.setRowCount(0);
        model.setColumnCount(3);
    }

    public static void showTableDate(FrmGetTutorshipRecord frame) {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        DefaultTableModel model = (DefaultTableModel) frame.getTblTutorships().getModel();
        ArrayList<Object> studentRow;

        emptyTable(frame);

        model.addColumn("Career");
        model.addColumn("Course Name");
        model.addColumn("date");

        for (Tutorship tutorship : dataPersistence.getTeacher().getTutorships()) {
            studentRow = buildRow(tutorship, frame);
            model.addRow(studentRow.toArray());
        }
    }

    public static ArrayList<Object> buildRow(Tutorship tutorship, FrmGetTutorshipRecord frame) {
        int count = frame.getTblTutorships().getRowCount();
        ArrayList<Object> studentRow;
        studentRow = new ArrayList<>();

        studentRow.add(String.valueOf(count + 1));
        studentRow.add(tutorship.getId());
        studentRow.add(tutorship.getName());
        studentRow.add(tutorship.getCareer());
        studentRow.add(tutorship.getCourseName());
        studentRow.add(tutorship.getDate().toString());

        return studentRow;
    }

    public static void emptyTable(FrmGetTutorshipRecord frame) {
        DefaultTableModel model = (DefaultTableModel) frame.getTblTutorships().getModel();
        model.setRowCount(0);
        model.setColumnCount(3);
    }

    public static void login(FrmLogin frame) throws HeadlessException {
        // TODO add your handling code here:
        String user;
        String password;
        int validated;

        user = String.valueOf(frame.getTxtUser().getText());
        password = String.valueOf(frame.getTxtPassword().getText());

        validated = TeacherController.loginTeacher(user, password);

        if (validated == 1) {
            JOptionPane.showMessageDialog(frame, "WELCOME", "LOGIN INFO", INFORMATION_MESSAGE);
            emptyFields(frame);

            FrmTeacherMenu frmTeacherMenu = new FrmTeacherMenu();
            frmTeacherMenu.setVisible(true);
            frame.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(frame, "ERROR", "LOGIN INFO", INFORMATION_MESSAGE);
            emptyFields(frame);
        }
    }

    public static void emptyFields(FrmLogin frame) {
        frame.getTxtUser().setText("");
        frame.getTxtPassword().setText("");
    }

    public static void removeCourseAction(FrmRemoveCourse frame) throws HeadlessException {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        String courseDeleteString;
        int courseToDelete;
        int desicion;
        int result;

        courseToDelete = (Integer) frame.getCmbNrc().getSelectedIndex();
        courseDeleteString = (String) frame.getCmbNrc().getSelectedItem();

        desicion = JOptionPane.showConfirmDialog(frame, "Do you want to delete course: " + courseDeleteString + " ?", "course delete info", WIDTH);

        if (desicion == 0) {
            result = CourseController.removeCourse(courseToDelete);
            if (result == 1) {
                JOptionPane.showMessageDialog(frame, "Course successfully deleted ", "course delete info", INFORMATION_MESSAGE);
                dataPersistence.updateData();
            }
            uploadCourses(frame);
        } else {
            uploadCourses(frame);
        }
    }

    public static void uploadCourses(FrmRemoveCourse frame) {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        String[] coursesArray;
        coursesArray = new String[dataPersistence.getTeacher().getCourses().size()];
        String coursesString;

        for (int i = 0; i < dataPersistence.getTeacher().getCourses().size(); i++) {

            coursesString = dataPersistence.getTeacher().getCourses().get(i).getName() + " - nrc: " + String.valueOf(dataPersistence.getTeacher().getCourses().get(i).getNrc());
            coursesArray[i] = coursesString;
        }

        frame.getCmbNrc().setModel(new DefaultComboBoxModel<>(coursesArray));
    }

    public static void deleteStudentAction(FrmRemoveStudent frame) throws HeadlessException {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        String espeId;
        String name;
        int studentNumber;
        int nrc;
        int desicion;
        int result;

        try {
            studentNumber = Integer.parseInt(frame.getTxtNStudent().getText()) - 1;
            int totalStudents = dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents().size();
            nrc = dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getNrc();
            if (studentNumber < totalStudents) {
                espeId = String.valueOf(dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents().get(studentNumber).getEspeId());
                name = String.valueOf(dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents().get(studentNumber).getName());
                desicion = JOptionPane.showConfirmDialog(frame, "Do you want to delete this student: " + name + " (" + espeId + ")" + " ?", "course delete info", WIDTH);

                if (desicion == 0) {
                    result = StudentController.removeStudent(espeId, nrc);
                    if (result == 1) {
                        JOptionPane.showMessageDialog(frame, "Student " + name + " (" + espeId + ")" + " was successfully eliminated", "Student delete information", INFORMATION_MESSAGE);
                        frame.getTxtNStudent().setText("");
                        refreshTable(frame);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "operation canceled");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Student not found, try Again\nRemember do you have " + totalStudents + " students in this nrc " + "(" + nrc + ")");
                frame.getTxtNStudent().setText("");
            }

            dataPersistence.updateData();
            refreshTable(frame);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Can't delete that student\n Error: " + e);
        }
    }

    public static final void refreshTable(FrmRemoveStudent frame) {
        DefaultTableModel model = new DefaultTableModel();
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        model.addColumn("#");
        model.addColumn("Name");
        model.addColumn("Espe Id");

        int i = 1;
        for (Student student : dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents()) {
            model.addRow(new Object[]{i, student.getName(), student.getEspeId()});
            i++;
        }

        frame.getTblStudents().setModel(model);
    }

    public static void requestTutorship(FrmRequestTutorship frame) throws HeadlessException {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        Tutorship tutorship;
        Date date;
        String id;
        String name;
        String career;
        String courseName;

        try {
            date = new Date();
            id = frame.getTxtID().getText();
            name = frame.getTxtName().getText();
            career = frame.getTxtCarrer().getText();
            courseName = frame.getTxtNRC().getText();

            tutorship = new Tutorship(date, id, name, career, courseName);
            dataPersistence.getdBManager().createDocument("Tutorships", DBManager.convertToJson(tutorship));

            JOptionPane.showMessageDialog(frame, "Tutorship was Requested", "Tutorship", INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Error not requested", "Tutorship", INFORMATION_MESSAGE);
        }
    }

    public static final void refreshTableStudent(FrmShowEnrolledStudents frame) {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("#");
        model.addColumn("Name");
        model.addColumn("Espe Id");

        int i = 1;
        for (Student student : dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents()) {
            model.addRow(new Object[]{i, student.getName(), student.getEspeId()});
            i++;
        }

        frame.getTblStudents().setModel(model);
    }

    public static void showNotifications(FrmStudentMenu frame) {
        DataPersistence dataPersistence;
        DefaultTableModel model;
        dataPersistence = DataPersistence.getInstance();
        model = (DefaultTableModel) frame.getTblNotifications().getModel();
        for (String notify : dataPersistence.getNotifies()) {
            model.addRow(new Object[]{notify});
        }
    }

    public static void initCmbClasses(FrmTakeAttendance frame) {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        int numClasses;

        if (!dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents().isEmpty()) {
            numClasses = dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents().get(0).getAttendanceRecord().getAttendance().size();
            for (int i = 1; i <= numClasses; i++) {
                frame.getCmbClasses().addItem(String.valueOf(i));
            }
        }
    }

    public static void showTableAttendace(int classNumber, FrmTakeAttendance frame) {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        DefaultTableModel model = (DefaultTableModel) frame.getTblAttendance().getModel();
        int num = 0;
        String name;
        String id;
        boolean attendance;

        emptyTableAttendance(frame);

        for (Student student : dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents()) {
            num++;
            name = student.getName();
            id = student.getEspeId();
            attendance = student.getAttendanceRecord().getAttendance().get(classNumber);
            model.addRow(new Object[]{num, id, name, attendance});
        }
    }

    public static void emptyTableAttendance(FrmTakeAttendance frame) {
        DefaultTableModel model = (DefaultTableModel) frame.getTblAttendance().getModel();
        int numRows = model.getRowCount();
        for (int i = 0; i < numRows; i++) {
            model.removeRow(0);
        }
    }

    public static void AddClassAttendance(FrmTakeAttendance frame) throws NumberFormatException {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        int classNumber;
        if (!dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents().isEmpty()) {
            for (Student student : dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents()) {
                student.getAttendanceRecord().getAttendance().add(false);
            }
            frame.getCmbClasses().addItem(String.valueOf(dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents().get(0).getAttendanceRecord().getAttendance().size()));
            classNumber = Integer.parseInt(frame.getCmbClasses().getSelectedItem().toString()) - 1;
            showTableAttendace(classNumber, frame);
            frame.getLblAction().setText("Class was added");
        }
    }

    public static void saveAttendanceAction(FrmTakeAttendance frame) throws HeadlessException, NumberFormatException {
        DefaultTableModel model = (DefaultTableModel) frame.getTblAttendance().getModel();
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();

        if (!dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents().isEmpty()) {

            int classNumer = Integer.parseInt(frame.getCmbClasses().getSelectedItem().toString()) - 1;
            boolean studentAttendance;
            int count = 0;

            for (Student student : dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents()) {
                studentAttendance = (boolean) model.getValueAt(count, 3);
                student.getAttendanceRecord().getAttendance().set(classNumer, studentAttendance);
                student.getAttendanceRecord().setTotalClassNumber(student.getAttendanceRecord().getAttendance().size());
                count++;
            }

            dataPersistence.updateStudentsInDB(dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()));

            JOptionPane.showMessageDialog(frame, "Attendance was saved", "Attendance", INFORMATION_MESSAGE);
        }
    }

    public static void deleteAttendanceAction(FrmTakeAttendance frame) {
        DataPersistence dataPersistence;
        dataPersistence = DataPersistence.getInstance();
        if (frame.getCmbClasses().getItemCount() > 1) {
            for (Student student : dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getStudents()) {
                student.getAttendanceRecord().getAttendance().remove(frame.getCmbClasses().getItemCount() - 1);
            }

            frame.getCmbClasses().removeItemAt(frame.getCmbClasses().getItemCount() - 1);

            showTableAttendace(frame.getCmbClasses().getItemCount() - 1, frame);

            frame.getLblAction().setText("class #" + (frame.getCmbClasses().getItemCount() + 1) + " was deleted");
        }
    }
}
