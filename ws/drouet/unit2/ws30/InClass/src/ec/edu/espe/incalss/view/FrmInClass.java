/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.incalss.view;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class FrmInClass extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistrationSystem
     */
    public FrmInClass() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mnbMenu = new javax.swing.JMenuBar();
        mnuInClass = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        itmQuit = new javax.swing.JMenuItem();
        mnuTeacher = new javax.swing.JMenu();
        itmEnterCourse = new javax.swing.JMenuItem();
        itmManageCourse = new javax.swing.JMenuItem();
        itmTutorship = new javax.swing.JMenuItem();
        mnuStudent = new javax.swing.JMenu();
        itmRequestTutorship = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        itmHelpStudent = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InClass");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("InClass");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel2)
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addContainerGap(275, Short.MAX_VALUE))
        );

        mnbMenu.setBackground(new java.awt.Color(255, 255, 255));
        mnbMenu.setForeground(new java.awt.Color(51, 51, 51));

        mnuInClass.setText("InClass");

        itmAbout.setText("About");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        mnuInClass.add(itmAbout);

        itmQuit.setText("Quit");
        mnuInClass.add(itmQuit);

        mnbMenu.add(mnuInClass);

        mnuTeacher.setText("Teacher");

        itmEnterCourse.setText("EnterCourse");
        mnuTeacher.add(itmEnterCourse);

        itmManageCourse.setText("Manage Course");
        mnuTeacher.add(itmManageCourse);

        itmTutorship.setText("Tutorships");
        mnuTeacher.add(itmTutorship);

        mnbMenu.add(mnuTeacher);

        mnuStudent.setText("Student");

        itmRequestTutorship.setText("Request Tutorship");
        itmRequestTutorship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRequestTutorshipActionPerformed(evt);
            }
        });
        mnuStudent.add(itmRequestTutorship);

        mnbMenu.add(mnuStudent);

        mnuHelp.setText("Help");

        itmHelpStudent.setText("Help of students");
        mnuHelp.add(itmHelpStudent);

        mnbMenu.add(mnuHelp);

        setJMenuBar(mnbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
        FrmAbout frmAbout;
        frmAbout = new FrmAbout();        
        
        frmAbout.setVisible(true);
    }//GEN-LAST:event_itmAboutActionPerformed

    private void itmRequestTutorshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRequestTutorshipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmRequestTutorshipActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmEnterCourse;
    private javax.swing.JMenuItem itmHelpStudent;
    private javax.swing.JMenuItem itmManageCourse;
    private javax.swing.JMenuItem itmQuit;
    private javax.swing.JMenuItem itmRequestTutorship;
    private javax.swing.JMenuItem itmTutorship;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuInClass;
    private javax.swing.JMenu mnuStudent;
    private javax.swing.JMenu mnuTeacher;
    // End of variables declaration//GEN-END:variables
}
