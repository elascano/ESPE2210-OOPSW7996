package ec.edu.espe.inclass.view;

import ec.edu.espe.inclass.controller.DataPersistence;
import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class FrmEnterCourse extends javax.swing.JFrame {

    /**
     * Creates new form CourseMenu
     */

    public FrmEnterCourse() {

        initComponents();
        uploadCourses();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
    }
    
    private void uploadCourses() {
        DataPersistence dataPersistence;                
        dataPersistence = DataPersistence.getInstance(); 
        String[] coursesArray;
        coursesArray = new String[dataPersistence.getTeacher().getCourses().size()];
        String coursesString;

        for (int i = 0; i < dataPersistence.getTeacher().getCourses().size(); i++) {

            coursesString = dataPersistence.getTeacher().getCourses().get(i).getName() + " - nrc: " + String.valueOf(dataPersistence.getTeacher().getCourses().get(i).getNrc());
            coursesArray[i] = coursesString;
        }

        cmbNrc.setModel(new DefaultComboBoxModel<>(coursesArray));
        cmbNrc.setSelectedIndex(dataPersistence.getPosition());
    }
    
    public String getPositionNrc() {
        DataPersistence dataPersistence;                
        dataPersistence = DataPersistence.getInstance(); 
        String nrc;
        nrc = String.valueOf(dataPersistence.getTeacher().getCourses().get(dataPersistence.getPosition()).getNrc());
        return nrc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEnrolled = new javax.swing.JButton();
        btnAddGrade = new javax.swing.JButton();
        btnAttendance = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnRecord = new javax.swing.JButton();
        btnAttendanceRecord = new javax.swing.JButton();
        brnAddStudent = new javax.swing.JButton();
        cmbNrc = new javax.swing.JComboBox<>();
        pnlButtons = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMenu.setBackground(new java.awt.Color(228, 249, 245));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 81, 78));
        jLabel1.setText("Enter a Course");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 81, 78));
        jLabel2.setText("Select a Course");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 81, 78));
        jLabel3.setText("Menu:");

        btnEnrolled.setBackground(new java.awt.Color(48, 227, 202));
        btnEnrolled.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEnrolled.setForeground(new java.awt.Color(64, 81, 78));
        btnEnrolled.setText("Show enrolled students");
        btnEnrolled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnrolledActionPerformed(evt);
            }
        });

        btnAddGrade.setBackground(new java.awt.Color(48, 227, 202));
        btnAddGrade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddGrade.setForeground(new java.awt.Color(64, 81, 78));
        btnAddGrade.setText("Add grade");
        btnAddGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGradeActionPerformed(evt);
            }
        });

        btnAttendance.setBackground(new java.awt.Color(48, 227, 202));
        btnAttendance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAttendance.setForeground(new java.awt.Color(64, 81, 78));
        btnAttendance.setText("Take attendance");
        btnAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttendanceActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(48, 227, 202));
        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(64, 81, 78));
        btnRemove.setText("Remove Student");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnRecord.setBackground(new java.awt.Color(48, 227, 202));
        btnRecord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRecord.setForeground(new java.awt.Color(64, 81, 78));
        btnRecord.setText("Get grade record");
        btnRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordActionPerformed(evt);
            }
        });

        btnAttendanceRecord.setBackground(new java.awt.Color(48, 227, 202));
        btnAttendanceRecord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAttendanceRecord.setForeground(new java.awt.Color(64, 81, 78));
        btnAttendanceRecord.setText("Get attendance record");
        btnAttendanceRecord.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                btnAttendanceRecordComponentAdded(evt);
            }
        });
        btnAttendanceRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttendanceRecordActionPerformed(evt);
            }
        });

        brnAddStudent.setBackground(new java.awt.Color(48, 227, 202));
        brnAddStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        brnAddStudent.setForeground(new java.awt.Color(64, 81, 78));
        brnAddStudent.setText("Add Student");
        brnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnAddStudentActionPerformed(evt);
            }
        });

        cmbNrc.setBackground(new java.awt.Color(17, 153, 158));
        cmbNrc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbNrc.setForeground(new java.awt.Color(64, 81, 78));
        cmbNrc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNrc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNrcItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(72, 72, 72))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbNrc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnAttendanceRecord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEnrolled, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(brnAddStudent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(111, 111, 111)
                                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(btnAddGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAttendance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                        .addGap(46, 46, 46))))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbNrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEnrolled, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnAddGrade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAttendance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnAttendanceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pnlButtons.setBackground(new java.awt.Color(17, 153, 158));

        btnBack.setBackground(new java.awt.Color(64, 81, 78));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(228, 249, 245));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(34, 34, 34))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnBack)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAttendanceRecordComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_btnAttendanceRecordComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAttendanceRecordComponentAdded

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmTeacherMenu frmTeacherMenu = new FrmTeacherMenu();
        frmTeacherMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEnrolledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnrolledActionPerformed
        FrmShowEnrolledStudents frmShowEnrolledStudents = new FrmShowEnrolledStudents();
        frmShowEnrolledStudents.setVisible(true);
        FrmShowEnrolledStudents.txtNrcReceive.setText(getPositionNrc());
        this.setVisible(false);
    }//GEN-LAST:event_btnEnrolledActionPerformed

    private void btnAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttendanceActionPerformed
        FrmTakeAttendance frmTakeAttendance = new FrmTakeAttendance();
        frmTakeAttendance.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAttendanceActionPerformed

    private void btnAddGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGradeActionPerformed
        FrmAddGrade frmAddGrade = new FrmAddGrade();
        frmAddGrade.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddGradeActionPerformed

    private void btnRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordActionPerformed
        FrmGetGradeRecord frmGetGradeRecord = new FrmGetGradeRecord();
        frmGetGradeRecord.setVisible(true);
        FrmGetGradeRecord.txtNrcReceive.setText(getPositionNrc());
        this.setVisible(false);
    }//GEN-LAST:event_btnRecordActionPerformed

    private void brnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnAddStudentActionPerformed
        FrmAddStudent frmAddStudent = new FrmAddStudent();
        frmAddStudent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_brnAddStudentActionPerformed

    private void btnAttendanceRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttendanceRecordActionPerformed
        FrmGetAttendanceRecord frmGetAttendanceRecord = new FrmGetAttendanceRecord();
        frmGetAttendanceRecord.setVisible(true);
        FrmGetAttendanceRecord.txtNrcReceive.setText(getPositionNrc());
        this.setVisible(false);
    }//GEN-LAST:event_btnAttendanceRecordActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        FrmRemoveStudent frmRemoveStudent = new FrmRemoveStudent();
        frmRemoveStudent.setVisible(true);
        FrmRemoveStudent.txtNrcReceive.setText(getPositionNrc());
        this.setVisible(false);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void cmbNrcItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNrcItemStateChanged
        DataPersistence dataPersistence;                
        dataPersistence = DataPersistence.getInstance();
        int position;        
        position = (Integer) cmbNrc.getSelectedIndex();
        dataPersistence.setPosition(position);
    }//GEN-LAST:event_cmbNrcItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEnterCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEnterCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEnterCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEnterCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEnterCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnAddStudent;
    private javax.swing.JButton btnAddGrade;
    private javax.swing.JButton btnAttendance;
    private javax.swing.JButton btnAttendanceRecord;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnrolled;
    private javax.swing.JButton btnRecord;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> cmbNrc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
