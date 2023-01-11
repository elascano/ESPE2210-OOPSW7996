/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.studentcsassignment.view;

//import com.raven.datechooser.DateChooser;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
//import com.formdev.flatlaf.intellijthemes.*;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.*;
import ec.ecu.espe.studentcsassignment.model.*;
import org.bson.Document;
import com.google.gson.Gson;
import static ec.ecu.espe.studentcsassignment.controller.AssignmentsController.addAssignment;
import static ec.ecu.espe.studentcsassignment.controller.AssignmentsController.findAssignment;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonModel;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class assignments extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    
    
    
    /**
     * Creates new form assignments
     */
    public assignments() {
        initComponents();
        
        String[] head = new String[]{"Name","Shipping","Deadline"};
        dtm.setColumnIdentifiers(head);
        tblAssignments.setModel(dtm);
        
    }
    
    void addToTable(Assignment assignment){
        dtm.addRow(new Object[]{
            assignment.getName(),assignment.getShipping(),assignment.getDeadline()
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlSearch = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        dtShipping = new com.toedter.calendar.JDateChooser();
        dtDeadline = new com.toedter.calendar.JDateChooser();
        btnFind = new javax.swing.JButton();
        btnNewAssignment = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAComment = new javax.swing.JTextArea();
        tblAssignmentsContainer = new javax.swing.JScrollPane();
        tblAssignments = new javax.swing.JTable();
        pnlActions = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        btnOpen = new javax.swing.JButton();
        txtAction = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        mnPrincipal = new javax.swing.JMenuBar();
        mnStudentCS = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        itmLogOut = new javax.swing.JMenuItem();
        mnClassrooms = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        mnManage = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnHelp = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Assignments"); // NOI18N

        pnlForm.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jLabel1.setText("Assignments");

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mathematics");

        pnlSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD, jLabel3.getFont().getSize()+2));
        jLabel3.setForeground(jLabel1.getForeground());
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name");

        jLabel4.setFont(jLabel3.getFont());
        jLabel4.setForeground(jLabel1.getForeground());
        jLabel4.setHorizontalAlignment(jLabel3.getHorizontalAlignment());
        jLabel4.setText("Shipping");
        jLabel4.setBorder(jLabel3.getBorder());

        jLabel5.setFont(jLabel3.getFont());
        jLabel5.setForeground(jLabel1.getForeground());
        jLabel5.setHorizontalAlignment(jLabel3.getHorizontalAlignment());
        jLabel5.setText("Deadline");
        jLabel5.setBorder(jLabel3.getBorder());

        txtName.setName(""); // NOI18N
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
        });

        dtShipping.setDateFormatString("dd-MM-yyyy");
        dtShipping.setOpaque(false);

        dtDeadline.setDateFormatString("dd-MM-yyyy");
        dtDeadline.setFocusable(false);
        dtDeadline.setOpaque(false);

        btnFind.setFont(btnFind.getFont().deriveFont(btnFind.getFont().getStyle() & ~java.awt.Font.BOLD, btnFind.getFont().getSize()+2));
        btnFind.setForeground(new java.awt.Color(51, 51, 51));
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnNewAssignment.setFont(btnFind.getFont());
        btnNewAssignment.setForeground(btnFind.getForeground());
        btnNewAssignment.setText("New Assignment");
        btnNewAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAssignmentActionPerformed(evt);
            }
        });

        jLabel6.setFont(jLabel3.getFont());
        jLabel6.setForeground(jLabel1.getForeground());
        jLabel6.setHorizontalAlignment(jLabel3.getHorizontalAlignment());
        jLabel6.setText("Comment");
        jLabel6.setBorder(jLabel3.getBorder());

        txtAComment.setColumns(20);
        txtAComment.setRows(5);
        txtAComment.setBorder(jLabel3.getBorder());
        jScrollPane2.setViewportView(txtAComment);

        pnlSearch.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(txtName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(dtShipping, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(dtDeadline, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(btnFind, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(btnNewAssignment, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addComponent(btnFind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(btnNewAssignment))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSearchLayout.createSequentialGroup()
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(dtDeadline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(dtShipping, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtShipping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewAssignment)
                    .addComponent(btnFind))
                .addGap(17, 17, 17))
        );

        txtName.getAccessibleContext().setAccessibleName("");
        txtName.getAccessibleContext().setAccessibleDescription("");
        btnFind.getAccessibleContext().setAccessibleDescription("Find an element");

        tblAssignments.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tblAssignments.setFont(getFont());
        tblAssignments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Shipping", "Deadine"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblAssignments.setOpaque(false);
        tblAssignmentsContainer.setViewportView(tblAssignments);

        pnlActions.setBorder(pnlSearch.getBorder());

        jLabel7.setFont(jLabel3.getFont());
        jLabel7.setForeground(jLabel1.getForeground());
        jLabel7.setText("Name");

        btnOpen.setBackground(new java.awt.Color(0, 255, 102));
        btnOpen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOpen.setForeground(new java.awt.Color(255, 255, 255));
        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        txtAction.setBackground(txtName.getBackground());
        txtAction.setBorder(txtName.getBorder());
        txtAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnDelete.setFont(btnOpen.getFont());
        btnDelete.setForeground(new java.awt.Color(255, 204, 204));
        btnDelete.setText("Delete");

        pnlActions.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlActions.setLayer(btnOpen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlActions.setLayer(txtAction, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlActions.setLayer(btnDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlActionsLayout = new javax.swing.GroupLayout(pnlActions);
        pnlActions.setLayout(pnlActionsLayout);
        pnlActionsLayout.setHorizontalGroup(
            pnlActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActionsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlActionsLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlActionsLayout.createSequentialGroup()
                        .addGroup(pnlActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAction)
                            .addGroup(pnlActionsLayout.createSequentialGroup()
                                .addComponent(btnOpen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete)))
                        .addGap(16, 16, 16))))
        );
        pnlActionsLayout.setVerticalGroup(
            pnlActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpen)
                    .addComponent(btnDelete))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnClean.setBackground(new java.awt.Color(204, 255, 255));
        btnClean.setFont(btnFind.getFont());
        btnClean.setForeground(btnFind.getForeground());
        btnClean.setText("Clean");

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(285, 285, 285))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tblAssignmentsContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFormLayout.createSequentialGroup()
                                .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlActions)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnClean)))))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addComponent(pnlActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClean)))
                .addGap(18, 18, 18)
                .addComponent(tblAssignmentsContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        mnStudentCS.setText("Student CS");
        mnStudentCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnStudentCSActionPerformed(evt);
            }
        });

        itmAbout.setText("About");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        mnStudentCS.add(itmAbout);

        itmLogOut.setText("Log out");
        itmLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLogOutActionPerformed(evt);
            }
        });
        mnStudentCS.add(itmLogOut);

        mnPrincipal.add(mnStudentCS);

        mnClassrooms.setText("Classrooms");
        mnClassrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClassroomsActionPerformed(evt);
            }
        });

        jMenuItem9.setText("Mathematics");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        mnClassrooms.add(jMenuItem9);

        jMenuItem10.setText("History");
        mnClassrooms.add(jMenuItem10);

        jMenuItem11.setText("Biology");
        mnClassrooms.add(jMenuItem11);

        jMenuItem12.setText("English");
        mnClassrooms.add(jMenuItem12);

        mnPrincipal.add(mnClassrooms);

        mnManage.setText("Manage");

        jMenuItem3.setText("Students");
        mnManage.add(jMenuItem3);

        jMenuItem5.setText("Absense");
        mnManage.add(jMenuItem5);

        jMenuItem6.setText("Events");
        mnManage.add(jMenuItem6);

        mnPrincipal.add(mnManage);

        mnHelp.setText("Help");

        jMenuItem8.setText("User Manual");
        mnHelp.add(jMenuItem8);

        jMenuItem7.setText("Technical Contact");
        mnHelp.add(jMenuItem7);

        mnPrincipal.add(mnHelp);

        setJMenuBar(mnPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        Document assignmentDocument = findAssignment(name);
        String assignmentJson = assignmentDocument.toJson();
        Assignment assignment;
        assignment = new Gson().fromJson(assignmentJson,Assignment.class);
        
        if (assignment != null) {
            addToTable(assignment);
        } else {
            System.out.println("..:: DATA NOT FOUND ::..");
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void txtActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOpenActionPerformed

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameFocusGained

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_itmAboutActionPerformed

    private void itmLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmLogOutActionPerformed

    private void mnStudentCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnStudentCSActionPerformed
        // TODO add your handling code here:
        FrmAbout frmAbout;
        frmAbout = new FrmAbout();
        frmAbout.setVisible(true);
    }//GEN-LAST:event_mnStudentCSActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void mnClassroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClassroomsActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnClassroomsActionPerformed

    
    
    private void btnNewAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAssignmentActionPerformed
        // TODO add your handling code here:
        
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        Date shipping = dtShipping.getDate();
        Date deadline = dtDeadline.getDate();
        
        String shippingStr = dateFormat.format(shipping);
        String deadlineStr = dateFormat.format(deadline);
        
        dtm.addRow(new Object[]{
            txtName.getText(),shippingStr,deadlineStr
        });
        
        Document assignment;
        assignment = new Document("_id", new ObjectId())
                .append("name",txtName.getText())
                .append("shipping", shippingStr)
                .append("deadline", deadlineStr)
                
                .append("comment",txtAComment.getText());
        addAssignment(assignment,"Mathematics");
    }//GEN-LAST:event_btnNewAssignmentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            //UIManager.setLookAndFeel(new FlatLightLaf());
            //FlatLightFlatIJTheme.setup();
            //FlatMaterialDesignDarkIJTheme.setup();
            FlatMaterialLighterIJTheme.setup();
            //FlatMaterialLighterContrastIJTheme.setup();
            //FlatGitHubContrastIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new assignments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNewAssignment;
    private javax.swing.JButton btnOpen;
    private com.toedter.calendar.JDateChooser dtDeadline;
    private com.toedter.calendar.JDateChooser dtShipping;
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu mnClassrooms;
    private javax.swing.JMenu mnHelp;
    private javax.swing.JMenu mnManage;
    private javax.swing.JMenuBar mnPrincipal;
    private javax.swing.JMenu mnStudentCS;
    private javax.swing.JLayeredPane pnlActions;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JLayeredPane pnlSearch;
    private javax.swing.JTable tblAssignments;
    private javax.swing.JScrollPane tblAssignmentsContainer;
    private javax.swing.JTextArea txtAComment;
    private javax.swing.JTextField txtAction;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
