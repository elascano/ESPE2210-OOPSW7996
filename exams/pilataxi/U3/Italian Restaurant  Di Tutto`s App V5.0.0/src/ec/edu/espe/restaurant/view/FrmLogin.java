package ec.edu.espe.restaurant.view;

import ec.edu.espe.restaurant.controller.MongoDBConnection;
import ec.edu.espe.restaurant.controller.UserController;
import ec.edu.espe.restaurant.model.User;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class FrmLogin extends javax.swing.JFrame {
UserController userController;

    public FrmLogin() {
        initComponents();
        MongoDBConnection.connectDatabase();
        
        userController = new UserController("User");
        this.setTitle("Italian Restaurant Di Tutto`s");
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void login(){
        User user;
        user = new User(txt_username1.getText(),new String (passwordUser.getPassword()));
        
        Document doc = userController.read(userController.buildDocumentUser(user));
        
        if (doc !=null) {
            
            frmIS = new FrmInterface();
            frmIS.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "USER OR PASSWORD INVALID:\n"+"Please, try again", "Denied access",
            JOptionPane.ERROR_MESSAGE);
            txt_username1.setText("");
            passwordUser.setText("");
        }
    }
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_username1 = new javax.swing.JTextField();
        passwordUser = new javax.swing.JPasswordField();
        btn_Login = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1210, 620));
        jPanel1.setPreferredSize(new java.awt.Dimension(1210, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_username1.setBackground(new java.awt.Color(204, 204, 204));
        txt_username1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_username1.setForeground(new java.awt.Color(0, 0, 0));
        txt_username1.setBorder(null);
        txt_username1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_username1MousePressed(evt);
            }
        });
        txt_username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_username1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 240, 40));

        passwordUser.setBackground(new java.awt.Color(204, 204, 204));
        passwordUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordUser.setForeground(new java.awt.Color(0, 0, 0));
        passwordUser.setText("**********");
        passwordUser.setBorder(null);
        passwordUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordUserMousePressed(evt);
            }
        });
        passwordUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordUserActionPerformed(evt);
            }
        });
        jPanel1.add(passwordUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 240, 40));

        btn_Login.setBackground(new java.awt.Color(255, 51, 51));
        btn_Login.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btn_Login.setForeground(new java.awt.Color(0, 0, 0));
        btn_Login.setText("LOGIN");
        btn_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 130, 40));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 20, 420));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Welcome to \"Di Tutto`s\" Restaurant");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Username:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 100, 20));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoRestaurant-removebg1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 290, 280));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("HELP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 363, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        login();
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void passwordUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordUserActionPerformed
        btn_Login.requestFocus();
        login();
    }//GEN-LAST:event_passwordUserActionPerformed

    private void passwordUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordUserMousePressed

        if(String.valueOf(passwordUser.getPassword()).equals("**********")){
            passwordUser.setText("");
            passwordUser.setForeground(Color.black);
        }
        if(txt_username1.getText().isEmpty() ){
            txt_username1.setText("Type your user");
            txt_username1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passwordUserMousePressed

    private void txt_username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_username1ActionPerformed
        btn_Login.requestFocus();
        login();
    }//GEN-LAST:event_txt_username1ActionPerformed

    private void txt_username1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_username1MousePressed

        if(txt_username1.getText().equals("Type your user")){
            txt_username1.setText("");
            txt_username1.setForeground(Color.black);
        }
        if(String.valueOf(passwordUser.getPassword()).isEmpty() ){
            passwordUser.setText("**********");
            passwordUser.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_username1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmHelp FrmHelp = new FrmHelp();
        this.setVisible(false);
        FrmHelp.setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private FrmInterface frmIS;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordUser;
    private javax.swing.JTextField txt_username1;
    // End of variables declaration//GEN-END:variables
}
