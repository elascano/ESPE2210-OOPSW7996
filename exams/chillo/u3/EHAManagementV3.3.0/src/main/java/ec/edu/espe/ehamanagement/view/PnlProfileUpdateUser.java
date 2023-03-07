package ec.edu.espe.ehamanagement.view;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.controller.Profile;
import ec.edu.espe.ehamanagement.model.User;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairo Bonilla & Nahir Carrera, Gaman GeekLords, DCCO-ESPE
 */
public class PnlProfileUpdateUser extends javax.swing.JPanel {
    private final MongoCollection userCollection;
    /**
     * Creates new form PnlUpdate
     * @param collectionUser
     */
    public PnlProfileUpdateUser(MongoCollection collectionUser) {
        userCollection = collectionUser;
        initComponents();
        writeFields();
        btnSave.setEnabled(false);
        pswNewPassword.setEnabled(false);
    }
    
    private void validateFields(String field, java.awt.event.KeyEvent evt){
        char character = evt.getKeyChar();
        switch(field){
            case ("user") ->{
                if (!Character.isLetter(character) && (character != KeyEvent.VK_BACK_SPACE && character != KeyEvent.VK_SPACE)) {
                    getToolkit().beep();
                    evt.consume();
                    setUserWarning(character + " is not accepted here!");
                }else{
                    cleanUserWarning();
                }
            }
            case ("salary")->{
                if (!Character.isDigit(character) && (character != KeyEvent.VK_BACK_SPACE && character != KeyEvent.VK_PERIOD)) {
                    getToolkit().beep();
                    evt.consume();
                    setSalaryWarning(character + " is not accepted here");
                }else{
                    cleanSalaryWarning();
                }
            }
            case ("email")->{
                if (!txtEmail.getText().contains("@") || !txtEmail.getText().contains(".")||!txtEmail.getText().contains(" ")){
                    setEmailWarning("enter a valid email");
                }else{
                    cleanEmailWarning();
                }
            }
        }
    }
    
    private void setEmptyFieldsWarning(){
        if (txtUserName.getText().equals("UserName")){
            setUserWarning("this area is required");
        }else{
            cleanUserWarning();
        }
        if (txtEmail.getText().equals("name@gmail.com")){
            setEmailWarning("this area is required");
        }else{
            cleanEmailWarning();
        }
        
        if (pswOldPassword.getText().equals("***************")){
            lblOldPasswordWarning.setForeground(Color.red);
            setNotConfirmedPasswordWarning("this area is required");
        }else{
            cleanConfirmPasswordWarning();   
        }
        
        if (txtCurrentSalary.getText().equals("$00.00")){
            setSalaryWarning("this area is required");
        }else{
            cleanSalaryWarning();   
        }
        
        if (pswNewPassword.getText().equals("***************")){
            setPasswordWarning("this area is required");
        }else{
            cleanPasswordWarning();   
        }
        
        if (checkEmptyFields()&& btnConfirmPassword.isEnabled()){
            btnSave.setEnabled(false);
        }
    }
    
    private boolean checkEmptyFields(){
        return !(txtCurrentSalary.getText().equals("$00.00") || pswOldPassword.getText().equals("***************") || lblEmailWarning.getText().equals("enter a valid email")
                || txtEmail.getText().equals("name@gmail.com") || txtUserName.getText().equals("UserName") || txtUserName.getText().isEmpty() || pswOldPassword.getText().isEmpty() || txtEmail.getText().isEmpty()
                || txtCurrentSalary.getText().isEmpty() || pswNewPassword.getText().equals("***************")|| pswNewPassword.getText().isEmpty());
    }
    private void writeFields(){
        String userName = (String) Profile.getValueFromUser(userCollection, 1, "userName");
        String email = (String) Profile.getValueFromUser(userCollection, 1, "email");
        String currentSalary = String.valueOf(Profile.getValueFromUser(userCollection, 1, "currentSalary"));
        String password = String.valueOf(Profile.getValueFromUser(userCollection, 1, "password"));
        txtUserName.setText(userName);
        txtEmail.setText(email);
        txtCurrentSalary.setText(currentSalary);
        pswNewPassword.setText(password);
    }
    
    private void writeDeafultFields(){
        if (txtUserName.getText().isEmpty()) {
            txtUserName.setText("UserName");
            txtUserName.setForeground(Color.gray);
        }
        if (txtEmail.getText().isEmpty()) {
            txtEmail.setText("name@gmail.com");
            txtEmail.setForeground(Color.gray);
        }
        if (txtCurrentSalary.getText().isEmpty()) {
            txtCurrentSalary.setText("$00.00");
            txtCurrentSalary.setForeground(Color.gray);

        }
        if (String.valueOf(pswOldPassword.getPassword()).isEmpty()) {
            pswOldPassword.setText("***************");
            pswOldPassword.setForeground(Color.gray);
        }
        if(String.valueOf(pswNewPassword.getPassword()).isEmpty())
        {
            pswNewPassword.setText("***************");
            pswNewPassword.setForeground(Color.gray);
        }
    }
    
    private void setConfirmedPasswordWarning(String message) {
        lblOldPasswordWarningPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/seenGreen.png"))); // NOI18N
        lblOldPasswordWarningPicture.setText("");
        lblOldPasswordWarning.setText(message);
    }
    private void setNotConfirmedPasswordWarning(String message) {
        lblOldPasswordWarningPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/alert.png"))); // NOI18N
        lblOldPasswordWarningPicture.setText("");
        lblOldPasswordWarning.setText(message);
    }
    private void cleanConfirmPasswordWarning() {
        lblOldPasswordWarningPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/picture1.png"))); // NOI18N
        lblOldPasswordWarningPicture.setText("");
        lblOldPasswordWarning.setText("");
    }

    
    private void setUserWarning(String message) {
        lblUserWarningPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/alert.png"))); // NOI18N
        lblUserWarningPicture.setText("");
        lblUserWarning.setText(message);
        
    }
    private void cleanUserWarning() {
        lblUserWarningPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/picture1.png"))); // NOI18N
        lblUserWarningPicture.setText("");
        lblUserWarning.setText("");
    }
    
    private void setEmailWarning(String message) {
        lblEmailWarningPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/alert.png"))); // NOI18N
        lblEmailWarningPicture.setText("");
        lblEmailWarning.setText(message);
    }
    private void cleanEmailWarning() {
        lblEmailWarningPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/picture1.png"))); // NOI18N
        lblEmailWarningPicture.setText("");
        lblEmailWarning.setText("");
    }
    
    private void setPasswordWarning(String warning) {
        lblNewPasswordWarningPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/alert.png"))); // NOI18N
        lblNewPasswordWarningPicture.setText("");
        lblNewPasswordWarning.setText(warning);
    }
    private void cleanPasswordWarning() {
        lblNewPasswordWarningPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/picture1.png"))); // NOI18N
        lblNewPasswordWarningPicture.setText("");
        lblNewPasswordWarning.setText("");
    }

    private void setSalaryWarning(String message) {
        lblSalaryWarningPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/alert.png"))); // NOI18N
        lblSalaryWarningPicture.setText("");
        lblSalaryWarning.setText(message);
    }
    private void cleanSalaryWarning() {
        lblSalaryWarningPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/picture1.png"))); // NOI18N
        lblSalaryWarningPicture.setText("");
        lblSalaryWarning.setText("");
    }
    

    private void confirmPasswordToUpdate(){
        String correctPassword = (String) Profile.getValueFromUser(userCollection, 1, "password");
        String password = pswOldPassword.getText();
         if ( password.equals(correctPassword)){
            btnSave.setEnabled(true);
            
            lblOldPasswordWarning.setForeground(Color.green);
            setConfirmedPasswordWarning("Confirmed");
            pswNewPassword.setEnabled(true);
            pswOldPassword.setEnabled(false);
            btnConfirmPassword.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(this,"The  password is incorrect, please try again", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void saveChanges(){
        int option = JOptionPane.showConfirmDialog(this, "Do you want to update ?");      
        if (option == 0 && checkEmptyFields()){
            String userName = txtUserName.getText();
            String email = txtEmail.getText();
            float currentSalary = Float.parseFloat(txtCurrentSalary.getText());
            String password = pswNewPassword.getText();
            User user = new User(1, userName, email, password, currentSalary);
            if(Profile.updateUser(user, userCollection)){
                JOptionPane.showMessageDialog(this,"Your changes  have been successfully saved!", "Updated successfully", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,"An error occured updating your changes", "Updated failed", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"There are empty fields, please fill them in and try again", "Updated failed", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        lblNewPasswordWarningPicture = new javax.swing.JLabel();
        lblUserWarningPicture = new javax.swing.JLabel();
        lblEmailWarningPicture = new javax.swing.JLabel();
        lblSalaryWarningPicture = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCurrentSalary = new javax.swing.JTextField();
        lblSalaryWarning = new javax.swing.JLabel();
        lblOldPasswordWarning = new javax.swing.JLabel();
        lblEmailWarning = new javax.swing.JLabel();
        lblUserWarning = new javax.swing.JLabel();
        pswOldPassword = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        pswNewPassword = new javax.swing.JPasswordField();
        btnConfirmPassword = new javax.swing.JButton();
        lblOldPasswordWarningPicture = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        lblNewPasswordWarning = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("User");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Email");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Current Salary");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("New Password");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("name@gmail.com");
        txtEmail.setBorder(null);
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEmailMousePressed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtCurrentSalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCurrentSalary.setForeground(new java.awt.Color(153, 153, 153));
        txtCurrentSalary.setText("$00.00");
        txtCurrentSalary.setBorder(null);
        txtCurrentSalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCurrentSalaryMousePressed(evt);
            }
        });
        txtCurrentSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrentSalaryActionPerformed(evt);
            }
        });
        txtCurrentSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCurrentSalaryKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCurrentSalaryKeyTyped(evt);
            }
        });

        lblSalaryWarning.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblSalaryWarning.setForeground(new java.awt.Color(204, 0, 0));
        lblSalaryWarning.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblOldPasswordWarning.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblOldPasswordWarning.setForeground(new java.awt.Color(50, 250, 100));
        lblOldPasswordWarning.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOldPasswordWarning.setToolTipText("");

        lblEmailWarning.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblEmailWarning.setForeground(new java.awt.Color(204, 0, 0));
        lblEmailWarning.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblUserWarning.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblUserWarning.setForeground(new java.awt.Color(204, 0, 0));

        pswOldPassword.setForeground(new java.awt.Color(153, 153, 153));
        pswOldPassword.setText("***************");
        pswOldPassword.setBorder(null);
        pswOldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pswOldPasswordMousePressed(evt);
            }
        });
        pswOldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswOldPasswordActionPerformed(evt);
            }
        });
        pswOldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pswOldPasswordKeyReleased(evt);
            }
        });

        txtUserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(153, 153, 153));
        txtUserName.setText("UserName");
        txtUserName.setBorder(null);
        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserNameMousePressed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Current password");

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        pswNewPassword.setForeground(new java.awt.Color(153, 153, 153));
        pswNewPassword.setText("***************");
        pswNewPassword.setBorder(null);
        pswNewPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pswNewPasswordMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pswNewPasswordMousePressed(evt);
            }
        });
        pswNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswNewPasswordActionPerformed(evt);
            }
        });
        pswNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pswNewPasswordKeyReleased(evt);
            }
        });

        btnConfirmPassword.setBackground(new java.awt.Color(0, 105, 125));
        btnConfirmPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmPassword.setText("confirm");
        btnConfirmPassword.setToolTipText("You have to confirm your old password to save changes, also to change you current password");
        btnConfirmPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmPasswordActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("$");

        jPanel2.setBackground(new java.awt.Color(0, 30, 57));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Update Profile");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/profile.png"))); // NOI18N

        jPanel7.setBackground(new java.awt.Color(0, 30, 57));

        btnSave.setBackground(new java.awt.Color(0, 62, 101));
        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(null);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        lblNewPasswordWarning.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblNewPasswordWarning.setForeground(new java.awt.Color(204, 0, 0));
        lblNewPasswordWarning.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNewPasswordWarning.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCurrentSalary))
                            .addComponent(pswNewPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pswOldPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(btnConfirmPassword))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEmailWarningPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblEmailWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOldPasswordWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblUserWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserWarningPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSalaryWarningPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNewPasswordWarningPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOldPasswordWarningPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblSalaryWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNewPasswordWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblUserWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblUserWarningPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblEmailWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(lblSalaryWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblSalaryWarningPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(lblOldPasswordWarningPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(lblNewPasswordWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lblNewPasswordWarningPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCurrentSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEmailWarningPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(lblOldPasswordWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pswNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCurrentSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrentSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurrentSalaryActionPerformed

    private void txtEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMousePressed
        writeDeafultFields();
        setEmptyFieldsWarning();
        if (txtEmail.getText().equals("name@gmail.com")) {
            txtEmail.setText("");
            txtEmail.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtEmailMousePressed

    private void txtCurrentSalaryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCurrentSalaryMousePressed
        writeDeafultFields();
        setEmptyFieldsWarning();
        if (txtCurrentSalary.getText().equals("$00.00")) {
            txtCurrentSalary.setText("");
            txtCurrentSalary.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCurrentSalaryMousePressed

    private void pswOldPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswOldPasswordMousePressed
        writeDeafultFields();
        setEmptyFieldsWarning();
        if (String.valueOf(pswOldPassword.getPassword()).equals("***************")) {
            pswOldPassword.setText("");
            pswOldPassword.setForeground(Color.black);
        }
    }//GEN-LAST:event_pswOldPasswordMousePressed

    private void txtUserNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMousePressed
        writeDeafultFields();
        setEmptyFieldsWarning();
        if (txtUserName.getText().equals("UserName")) {
            txtUserName.setText("");
            txtUserName.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtUserNameMousePressed

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
        setEmptyFieldsWarning();
        validateFields("user", evt);
            
    }//GEN-LAST:event_txtUserNameKeyTyped

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased

    }//GEN-LAST:event_txtUserNameKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased

    }//GEN-LAST:event_txtEmailKeyReleased

    private void pswOldPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswOldPasswordKeyReleased

    }//GEN-LAST:event_pswOldPasswordKeyReleased

    private void txtCurrentSalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurrentSalaryKeyReleased
        
    }//GEN-LAST:event_txtCurrentSalaryKeyReleased

    private void txtCurrentSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurrentSalaryKeyTyped
        setEmptyFieldsWarning();
        validateFields("salary", evt);
    }//GEN-LAST:event_txtCurrentSalaryKeyTyped
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveChanges();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void pswNewPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswNewPasswordMousePressed
        writeDeafultFields();
        setEmptyFieldsWarning();
        if (String.valueOf(pswNewPassword.getPassword()).equals("***************")) {
            pswNewPassword.setText("");
            pswNewPassword.setForeground(Color.black);

        }
    }//GEN-LAST:event_pswNewPasswordMousePressed

    private void pswNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswNewPasswordKeyReleased
        setEmptyFieldsWarning();
    }//GEN-LAST:event_pswNewPasswordKeyReleased

    private void btnConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmPasswordActionPerformed
        confirmPasswordToUpdate();
    }//GEN-LAST:event_btnConfirmPasswordActionPerformed

    private void pswNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswNewPasswordActionPerformed

    }//GEN-LAST:event_pswNewPasswordActionPerformed

    private void pswNewPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswNewPasswordMouseClicked
        
    }//GEN-LAST:event_pswNewPasswordMouseClicked

    private void pswOldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswOldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswOldPasswordActionPerformed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
       setEmptyFieldsWarning();
       validateFields("email", evt);
    }//GEN-LAST:event_txtEmailKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmPassword;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblEmailWarning;
    private javax.swing.JLabel lblEmailWarningPicture;
    private javax.swing.JLabel lblNewPasswordWarning;
    private javax.swing.JLabel lblNewPasswordWarningPicture;
    private javax.swing.JLabel lblOldPasswordWarning;
    private javax.swing.JLabel lblOldPasswordWarningPicture;
    private javax.swing.JLabel lblSalaryWarning;
    private javax.swing.JLabel lblSalaryWarningPicture;
    private javax.swing.JLabel lblUserWarning;
    private javax.swing.JLabel lblUserWarningPicture;
    public javax.swing.JPasswordField pswNewPassword;
    private javax.swing.JPasswordField pswOldPassword;
    public javax.swing.JTextField txtCurrentSalary;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
