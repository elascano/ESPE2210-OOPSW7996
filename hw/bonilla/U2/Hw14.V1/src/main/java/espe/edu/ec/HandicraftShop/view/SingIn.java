/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package espe.edu.ec.HandicraftShop.view;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.Color;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class SingIn extends javax.swing.JFrame {

    /**
     * Creates new form SingIn
     */
    public SingIn() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbUser1 = new javax.swing.JLabel();
        txtfNameUser = new javax.swing.JTextField();
        sptLine = new javax.swing.JSeparator();
        lbEmail = new javax.swing.JLabel();
        txtfNameEmail = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lbPassword = new javax.swing.JLabel();
        txtNamePassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        lbCurrentSalary = new javax.swing.JLabel();
        txtfNameCurrentSalary = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Log in");

        lbUser1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        lbUser1.setForeground(new java.awt.Color(0, 0, 0));
        lbUser1.setText("User");

        txtfNameUser.setBackground(new java.awt.Color(255, 255, 255));
        txtfNameUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfNameUser.setForeground(new java.awt.Color(204, 204, 204));
        txtfNameUser.setText("Enter your username ");
        txtfNameUser.setBorder(null);
        txtfNameUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtfNameUserMousePressed(evt);
            }
        });
        txtfNameUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNameUserActionPerformed(evt);
            }
        });

        lbEmail.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(0, 0, 0));
        lbEmail.setText("E-mail ");

        txtfNameEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtfNameEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfNameEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtfNameEmail.setText("name@gmail.com");
        txtfNameEmail.setBorder(null);
        txtfNameEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtfNameEmailMousePressed(evt);
            }
        });
        txtfNameEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNameEmailActionPerformed(evt);
            }
        });

        lbPassword.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(0, 0, 0));
        lbPassword.setText("Password");

        txtNamePassword.setBackground(new java.awt.Color(255, 255, 255));
        txtNamePassword.setForeground(new java.awt.Color(204, 204, 204));
        txtNamePassword.setText("***************");
        txtNamePassword.setBorder(null);
        txtNamePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNamePasswordMousePressed(evt);
            }
        });

        lbCurrentSalary.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        lbCurrentSalary.setForeground(new java.awt.Color(0, 0, 0));
        lbCurrentSalary.setText("Current salary");

        txtfNameCurrentSalary.setBackground(new java.awt.Color(255, 255, 255));
        txtfNameCurrentSalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfNameCurrentSalary.setForeground(new java.awt.Color(204, 204, 204));
        txtfNameCurrentSalary.setText("write your current salary ");
        txtfNameCurrentSalary.setBorder(null);
        txtfNameCurrentSalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtfNameCurrentSalaryMousePressed(evt);
            }
        });
        txtfNameCurrentSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNameCurrentSalaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfNameCurrentSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUser1)
                    .addComponent(sptLine, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail)
                    .addComponent(txtfNameEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPassword)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCurrentSalary))
                .addContainerGap(363, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtfNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbUser1))
                .addComponent(sptLine, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmail)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtfNameEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtNamePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbPassword))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCurrentSalary)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtfNameCurrentSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfNameUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfNameUserMousePressed
        if(txtfNameUser.getText().equals("Enter your username "))
        {
            txtfNameUser.setText("");

            txtfNameUser.setForeground(Color.black);

        }
        if(txtfNameCurrentSalary.getText().isEmpty())
        {
            txtfNameCurrentSalary.setText("write your current salary ");
            txtfNameCurrentSalary.setForeground(Color.gray);

        }
        if(String.valueOf(txtNamePassword.getPassword()).isEmpty())
        {
            txtNamePassword.setText("***************");
            txtNamePassword.setForeground(Color.gray);

        }
        if(txtfNameEmail.getText().isEmpty())
        {
            txtfNameEmail.setText("name@gmail.com");
            txtfNameEmail.setForeground(Color.gray);
        }

    }//GEN-LAST:event_txtfNameUserMousePressed

    private void txtfNameUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNameUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNameUserActionPerformed

    private void txtfNameEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfNameEmailMousePressed
        if(txtfNameEmail.getText().equals("name@gmail.com"))
        {
            txtfNameEmail.setText("");
            txtfNameEmail.setForeground(Color.black);

        }
        if(txtfNameUser.getText().isEmpty())
        {
            txtfNameUser.setText("Enter your username ");
            txtfNameUser.setForeground(Color.gray);

        }
        if(String.valueOf(txtNamePassword.getPassword()).isEmpty())
        {
            txtNamePassword.setText("***************");
            txtNamePassword.setForeground(Color.gray);

        }
        if(txtfNameCurrentSalary.getText().isEmpty())
        {
            txtfNameCurrentSalary.setText("write your current salary ");
            txtfNameCurrentSalary.setForeground(Color.gray);

        }

    }//GEN-LAST:event_txtfNameEmailMousePressed

    private void txtfNameEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNameEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNameEmailActionPerformed

    private void txtNamePasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNamePasswordMousePressed
        if(String.valueOf(txtNamePassword.getPassword()).equals("***************"))
        {
            txtNamePassword.setText("");
            txtNamePassword.setForeground(Color.black);

        }
        if(txtfNameUser.getText().isEmpty())
        {
            txtfNameUser.setText("Enter your username ");
            txtfNameUser.setForeground(Color.gray);
        }
        if(txtfNameEmail.getText().isEmpty())
        {
            txtfNameEmail.setText("name@gmail.com");
            txtfNameEmail.setForeground(Color.gray);
        }
        if(txtfNameCurrentSalary.getText().isEmpty())
        {
            txtfNameCurrentSalary.setText("write your current salary ");
            txtfNameCurrentSalary.setForeground(Color.gray);

        }

    }//GEN-LAST:event_txtNamePasswordMousePressed

    private void txtfNameCurrentSalaryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfNameCurrentSalaryMousePressed
        if(txtfNameCurrentSalary.getText().equals("write your current salary "))
        {
            txtfNameCurrentSalary.setText("");
            txtfNameCurrentSalary.setForeground(Color.black);
        }
        if(txtfNameUser.getText().isEmpty())
        {
            txtfNameUser.setText("Enter your username ");
            txtfNameUser.setForeground(Color.gray);

        }
        if(String.valueOf(txtNamePassword.getPassword()).isEmpty())
        {
            txtNamePassword.setText("***************");
            txtNamePassword.setForeground(Color.gray);

        }
        if(txtfNameEmail.getText().isEmpty())
        {
            txtfNameEmail.setText("name@gmail.com");
            txtfNameEmail.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtfNameCurrentSalaryMousePressed

    private void txtfNameCurrentSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNameCurrentSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNameCurrentSalaryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SingIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbCurrentSalary;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUser1;
    private javax.swing.JSeparator sptLine;
    private javax.swing.JPasswordField txtNamePassword;
    private javax.swing.JTextField txtfNameCurrentSalary;
    private javax.swing.JTextField txtfNameEmail;
    private javax.swing.JTextField txtfNameUser;
    // End of variables declaration//GEN-END:variables
}
