package ec.edu.espe.restaurant.view;


import java.io.IOException;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class FrmWelcome extends javax.swing.JFrame {

    public FrmWelcome() {
        initComponents();
        setLocationRelativeTo(null);
        progressBar.setVisible(false);
             
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        porcentaje = new javax.swing.JLabel();
        lbl_text = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        porcentaje.setFont(new java.awt.Font("Old English Text MT", 1, 12)); // NOI18N
        porcentaje.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 30, 20));

        lbl_text.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        lbl_text.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 190, 20));

        progressBar.setBackground(new java.awt.Color(102, 255, 204));
        progressBar.setForeground(new java.awt.Color(204, 51, 255));
        progressBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(255, 255, 51), new java.awt.Color(204, 0, 0)));
        jPanel1.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 360, 10));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 450, 70));

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("WELCOME");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 130, 50));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Di Tutto`s\" Restaurant");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 450, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WELCOME.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]){
        
        FrmWelcome frmWelcome;
        frmWelcome = new FrmWelcome();
        frmWelcome.setVisible(true);
        try{
           for(int i=0;i<=100;i++){
               Thread.sleep(20);
               frmWelcome.progressBar.setValue(i);

               frmWelcome.porcentaje.setText(Integer.toString(i)+"%");
               if(i==1){
                  frmWelcome.lbl_text.setText("         Starting application"); 
               }
               if(i==60){
                   frmWelcome.lbl_text.setText("           Loading data");
               }
               if(i==100){
                   frmWelcome.setVisible(false);
                   FrmLogin frmLogin;
                   frmLogin = new FrmLogin();
                   frmLogin.setVisible(true);
               }
           }
    }
       catch(Exception e){
           
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_text;
    private javax.swing.JLabel porcentaje;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
